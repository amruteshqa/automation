package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorXpathUsingContains {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qspiders.com");
		Thread.sleep(300);
		WebElement clk = driver.findElement(By.xpath("//a[contains(text(),'PLACEMENT STATISTICS')]"));
		Thread.sleep(3000);
		clk.click();
		

	}

}
