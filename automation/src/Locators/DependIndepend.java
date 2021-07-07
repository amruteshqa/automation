package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependIndepend {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.craftsvilla.com/");
//		driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("jackets");
//		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@class='_3879cV' and .='Core i5']/preceding-sibling::div[@class='_24_Dny']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@class='_3879cV' and .='HP']/preceding-sibling::div[@class='_24_Dny']")).click();
//		
//	}

	}}
