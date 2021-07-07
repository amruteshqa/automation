package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContains {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		
		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys("amrut");
		Thread.sleep(3000);
		
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("amrut");
		
		driver.findElement(By.xpath("//div[contains(@class,'jKUp7          ')]")).click();
	}


	}

