package FlagsInTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class alwaysRun {

	@Test(priority = 2, dependsOnMethods = "login")
	public void logout()
	{
		Reporter.log("logout from user",true);
	}
	
	@Test(priority = 0)//1
	public void login()
	{
		int i = 0;
		int result = 9/i;
		Reporter.log("login with user"+result,true);
	}
	
	//If always run givem , that T.C will always run.
	@Test(dependsOnMethods = "login",alwaysRun = true)
	public void createuser()
	{
		Reporter.log("create user after login",true);
	}
	
}

