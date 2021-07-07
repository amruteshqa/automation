package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Selenium");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text() = 'Edit']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@title ='सेलेनियम – Marathi']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title ='Selenium – इंग्रजी']")).click();
		

	}

}
