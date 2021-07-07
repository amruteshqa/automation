package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement path = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		path.sendKeys("laptop",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_24_Dny']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_4rR01T']")).click();
	}
}
