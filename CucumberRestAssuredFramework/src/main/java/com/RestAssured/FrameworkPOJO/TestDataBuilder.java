package com.RestAssured.FrameworkPOJO;

import java.util.ArrayList;
import java.util.List;

public class TestDataBuilder {
	
	public AddPlacePOJO testData(String name, String phone, String address) {
		AddPlacePOJO add = new AddPlacePOJO();
		add.setAccuracy(50);
		add.setAddress(address);
		add.setLanguage("French-IN");
		add.setName(name);
		add.setPhone_number(phone);
		add.setWebsite("http://google.com");
		
		List<String> li = new ArrayList<>();
		li.add("shoe park");
		li.add("shop");
		add.setTypes(li);
		
		LocationForAddPlace loc = new LocationForAddPlace();
		loc.setLat(-38.383494);
		loc.setLng(33.427362);
		add.setLocation(loc);
		
		return add;
	}
	
	public String deletePlaceBody(String placeID) {
		return "{\r\n	\"place_id\":\""+placeID+"\"\r\n}";
	}

}
