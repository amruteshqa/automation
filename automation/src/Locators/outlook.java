package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class outlook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.live.com/login.srf");
		
		WebElement enter = driver.findElement(By.id("i0116"));
		Thread.sleep(3000);
		enter.sendKeys("amrut");
		Thread.sleep(3000);
		driver.findElement(By.id("idSIButton9")).click();
	}

}
