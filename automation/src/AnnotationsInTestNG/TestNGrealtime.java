package AnnotationsInTestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGrealtime {
	
	@Test
	public void createUser() {
		Reporter.log("Create the user",true);
	}
	
	
	@BeforeMethod
	public void openBrowser() {
		Reporter.log("open the browser",true);
	}
	
	@AfterMethod
	public void closeBrowser() {
		Reporter.log("close the browser",true);
	}
	
	@Test
	public void addUser() {
		Reporter.log("Add the user",true);
	}
}
//o=p
//open the browser
//Add the user
//close the browser
//open the browser
//Create the user
//close the browser