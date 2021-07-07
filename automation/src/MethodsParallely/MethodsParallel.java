package MethodsParallely;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MethodsParallel
{
	WebDriver driver;
	@Test
	public void A() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		driver.switchTo().activeElement().sendKeys("pune");
	}
	
	@Test
	public void B() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		driver.switchTo().activeElement().sendKeys("pune");
	}
}

//How to Execute Methods Parallely?
//	@Test
//	public void A() {
//	Reporter.log("from A()"+Thread.currentThread().getId(),true);
//	}
//	@Test
//	public void B() {
//	Reporter.log("from B()"+Thread.currentThread().getId(),true);
//	}
//testng-parallelMethods.xml
//	<suite name="Suite" parallel="methods">
//	<test thread-count="5" name="Test" parallel="methods">
//  <classes>
//    <class name="MethodsParallely.MethodsParallelly"/>
//  </classes>
//	</test> <!-- Test -->
//	</suite> <!-- Suite -->