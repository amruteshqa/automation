package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.id("btnLogin")).click();

	}

}
