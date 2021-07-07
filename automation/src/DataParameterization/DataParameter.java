package DataParameterization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataParameter {

	WebDriver driver;

	@Parameters({ "username", "password", "browser" })
	@Test
	public void launchActiTime(String username, String password, String browservalue) {
		if (browservalue.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://desktop-a3rr3tc/login.do");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
	} else if(browservalue.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		// this is used avoid the illegalStateException
		FirefoxDriver driver = new FirefoxDriver(); //Launch Firefox browser// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();//maximize the browser
		driver.get("http://desktop-a3rr3tc/login.do");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();

	}else {
		Reporter.log("Invalid browser value",true);
	}
	}
}
//***************************************************************************************************************

//Parallel Execution:- 

//Executing the test block parallely and then (testng-parameter.xml)

//<test thread-count="5" name="TestChrome" parallel="tests">
//<parameter name="username" value="admin"></parameter>
//<parameter name="password" value="manager"></parameter>
//<parameter name="browser" value="chrome"></parameter>
//<classes>
//	<class name="DataParameterization.DataParameter" />
//</classes>
//</test> <!-- Parameter -->
//
//<test thread-count="5" name="TestFirefox">
//<parameter name="username" value="admin"></parameter>
//<parameter name="password" value="manager"></parameter>
//<parameter name="browser" value="firefox"></parameter>
//<classes>
//	<class name="DataParameterization.DataParameter" />
//</classes>
//</test> <!-- Parameter -->


