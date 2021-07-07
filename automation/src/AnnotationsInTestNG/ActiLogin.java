package AnnotationsInTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ActiLogin {
	WebDriver driver;

	@Test//Annotation-Login 
	public void login() {              //3.
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	}

	@Test//Annotation-InvalidLogin     //6.
	public void loginInvalid() {
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("managsr");
		driver.findElement(By.id("loginButton")).click();
	}

	@BeforeMethod
	public void beforeMethod() {        //2.  //5. 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://desktop-a3rr3tc/login.do");
	}

	@AfterMethod
	public void afterMethod() {         //4.  //7.
		driver.quit();
	}

	@BeforeTest
	public void beforeTest() {             //1.
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	@AfterTest
	public void afterTest() {              //8.
		Reporter.log("generate the report", true);
	}

}
