package stepDefinition;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;
import java.io.IOException;
import org.testng.Assert;
import com.RestAssured.FrameworkPOJO.TestDataBuilder;
import com.RestAssured.Utils.RequestSpec;
import com.RestAssured.Utils.ResourcesURI;
import io.cucumber.java.en.*;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class AddPlaceStepDefinition extends RequestSpec {

	RequestSpecification reqSpec;
	ResponseSpecification resSpec;
	Response res;
	TestDataBuilder data = new TestDataBuilder();
	static String place_id;		// marking this as static so that the value will be available to all scenarios in feature file else it will become null after completing the first scenario

	@Given("Add place payload with {string} {string} {string}")
	public void add_place_payload_with(String name, String phone, String address) throws IOException {

		// Separating request from group
		reqSpec = given().spec(addPlaceSpec()).body(data.testData(name, phone, address));
	}

	@When("user calls {string} with {string} http request")
	public void user_calls_with_http_request(String resourcefromFeatureFile, String method) {
		
		ResourcesURI resource = ResourcesURI.valueOf(resourcefromFeatureFile);

		resSpec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		
		if(method.equalsIgnoreCase("Post")) {
			res = reqSpec.when().post(resource.getResource());
			
		}
		else if(method.equalsIgnoreCase("get")) {
			res = reqSpec.when().get(resource.getResource());
		}
		else if(method.equalsIgnoreCase("delete")) {
			res = reqSpec.when().delete(resource.getResource());
		}
		

	}

	@Then("the API call is success with status code {int}")
	public void the_api_call_is_success_with_status_code(Integer int1) {
		res = res.then().log().all().spec(resSpec).extract().response();	//code should work even without this line
		assertEquals(res.getStatusCode(), int1);
	}

	@Then("{string} in response body is {string}")
	public void in_response_body_is(String scope, String scopeValue) {
		
		Assert.assertEquals((getJsonPath(res,scope)), scopeValue);
		System.out.println("This step is completed");

	}
	
	@Then("verify place_id maps to {string} using {string}")
	public void verify_place_id_maps_to_using(String placeName, String getresource) throws IOException {
		
		place_id = getJsonPath(res,"place_id");
		reqSpec = given().spec(addPlaceSpec()).queryParam("place_id", place_id);
		
		user_calls_with_http_request(getresource,"Get");		//this will return the response as res from line # 48
		Assert.assertEquals(getJsonPath(res,"name"),placeName);
	    
		
	}
	
	@Given("Delete place payload")
	public void delete_place_payload() throws IOException {
		
		reqSpec = given().spec(addPlaceSpec()).body(data.deletePlaceBody(place_id));
		System.out.println("Deleted successfully");
	}



}
