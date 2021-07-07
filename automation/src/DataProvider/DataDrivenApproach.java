package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenApproach {
	WebDriver driver;

	@BeforeTest
	public void setProp() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

	}

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// implicitlywait
		driver.manage().window().maximize();// maximize the browser
		driver.get("http://desktop-a3rr3tc/login.do");// launch the web application
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

	@DataProvider(name = "TestData")//bank name
	public Object[][] testData() {
		
		Object[][] data = new Object[5][2];// 2D array
		
		data[0][0] = "admin";
		data[0][1] = "manager";

		data[1][0] = "admin1234";
		data[1][1] = "vgcgkgk";

		data[2][0] = "admin12345";
		data[2][1] = "gghggk";

		data[3][0] = "admin123456";
		data[3][1] = "jhkjkbkjb";

		data[4][0] = "admin1234567";
		data[4][1] = "kgjff";


		return data;

	}
	
	@Test(dataProvider = "TestData") //bank name
	public void testInvalidActiTime(String username,String password) throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
	
	}
}