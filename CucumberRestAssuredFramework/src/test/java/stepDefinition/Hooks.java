package stepDefinition;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {
	
	
	@Before("@DeletePlace")
	public void hooksForDeletePlace() throws IOException {
		
		AddPlaceStepDefinition step = new AddPlaceStepDefinition();
		if(AddPlaceStepDefinition.place_id==null) {
		step.add_place_payload_with("Sharanya House", "(+01) 987 789 9090", "Velachery");
		step.user_calls_with_http_request("AddPlaceAPI", "Post");
		step.verify_place_id_maps_to_using("Sharanya House", "GetPlaceAPI");
		
	}}

}
