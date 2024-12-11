package com.jktech.testngListeners;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


// Note: when diff version of testng is used, it is failing

@Listeners(com.jktech.testngListeners.IHookableImplementation.class)
public class IHookableListenerWithExample {

	@Test(dataProvider="parametersToBeSent")
	public void t(String parameter) {
	System.out.println("test method to be called with the following parameter is " + parameter);
	}

	@DataProvider
	public Object[][] parametersToBeSent() {
	return new Object[][]{{"parameter 1"}, {"parameter 2"}, {"parameter 3"}};
	}

}
