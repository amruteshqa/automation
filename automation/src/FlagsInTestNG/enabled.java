package FlagsInTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enabled {
	// this method is disabled with help of with help of ENABLED.
	// If we run below program
	
//	@Test(enabled = false)
//	public void Logout() {
//		Reporter.log("logout", true);
//	}
//
//	@Test(enabled = false)
//	public void Login() {
//		Reporter.log("Login", true);
//	}

	//o/p:-
	// Default suite
	//	Total tests run: 0, Passes: 0, Failures: 0, Skips: 0
	//	===============================================
	//	[TestNG] No tests found. Nothing was run
	
	//2.0
	//testng."TestNGException"******************************************************************
	@Test(dependsOnMethods = "Login")
	public void Logout() {
		Reporter.log("logout", true);
	}

	@Test(enabled = false)
	public void Login() {
		Reporter.log("Login", true);
	}

}
