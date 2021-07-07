package MethodsParallely;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class4 {

	WebDriver driver;

	@Test
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		driver.switchTo().activeElement().sendKeys("Delhi");
	}
	
	@Test
	public void tearDown() {
		driver.close();
	}
}
