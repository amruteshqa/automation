package FlagsInTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocationCount {
	//if there is any kind of ,we need to execute multiple times.
@Test(invocationCount = 10)
public void login()
{
	Reporter.log("login",true);
}
}

//***************************************************O/P:-**************************************************
////[RemoteTestNG] detected TestNG version 7.4.0
//login
//login
//login
//login
//login
//login
//login
//login
//login
//login
//PASSED: login
//PASSED: login
//PASSED: login
//PASSED: login
//PASSED: login
//PASSED: login
//PASSED: login
//PASSED: login
//PASSED: login
//PASSED: login
//
//===============================================
//    Default test
//    Tests run: 1, Failures: 0, Skips: 0