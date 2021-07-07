package FlagsInTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Description {
	//this method is used to add some description to the methods.
	@Test(description = "Method is for login")
	public void login() {
		Reporter.log("login to the application",true);
	}
	
}
