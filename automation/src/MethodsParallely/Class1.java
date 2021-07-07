package MethodsParallely;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class1 {

	WebDriver driver;

	@Test
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		driver.switchTo().activeElement().sendKeys("RCB");

	}
	
	@Test
	public void tearDown() {
		driver.close();
	}

}

//How to execute classes parallely?

//testng-parallelclasses.xml
//<suite name="Suite" parallel="classes">
//<test thread-count="5" name="Test" parallel="classes">
//<classes>
//  <class name="MethodsParallely.Class4"/>
//  <class name="MethodsParallely.Class2"/>
//  <class name="MethodsParallely.Class3"/>
//  <class name="MethodsParallely.Class1"/>
//</classes>
//</test> <!-- Test -->
//</suite> <!-- Suite -->
