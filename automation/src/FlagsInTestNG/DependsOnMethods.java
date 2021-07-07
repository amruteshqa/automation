package FlagsInTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods {

	@Test(priority = 2, dependsOnMethods = "login")//3
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
	
	  //1.0dependsOnMethod is used to make the current method depends on the another method
	  //1.1over here the createUser method is made dependent on login
		/*
		 * //so as soon as the control comes to the method with zero priority
		 * it will check that is that method depends on some other method 
		 * if it is so then the method on which the curren method is dependent will execute befor
		 * before the current method.
		 */
	@Test(dependsOnMethods = "login")//2
	public void createuser()
	{
		Reporter.log("create user after login",true);
	}
	
}
//2.0-in above prgm create user and logout are dependet on login method.
//2.1-this prgm execution , the control will come to method with 0 or no prio(i.e = createuser), but as createuser is dependt on login , it will try to execute login method.
//if the login method get passed , then all the 3 methods will be passed.But as we can seethe login method above prgm is or will get failed.
//it will some exeception.
//so whichever method (logout & createuser) are depends on login method will get skipped.










