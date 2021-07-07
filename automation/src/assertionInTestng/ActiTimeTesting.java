package assertionInTestng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class ActiTimeTesting {
	@Test
	public void testActiTime() {
		Reporter.log("Launch the browser",true);
		Reporter.log("Open the web apps",true);
		Reporter.log("Verify the login page title",true);
		SoftAssert softAssert = new SoftAssert();
		Assert.assertEquals(true, true);
		Reporter.log("If username text box is enabled then send Username",true);
		Reporter.log("If pwd text box is enabled then send pwd",true);
		Reporter.log("Click on login button",true);
		Assert.assertEquals(true, true);
		Reporter.log("Verify the home page title",true);
		softAssert.assertEquals(false, true);
		
		Reporter.log("CreateUser",true);
		Reporter.log("Configure the settings",true);
		
		Reporter.log("Logout",true);
		
		softAssert.assertAll();
	}
}
