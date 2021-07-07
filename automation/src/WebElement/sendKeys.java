package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendKeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement box = driver.findElement(By.name("q"));
		box.sendKeys("java");
		Thread.sleep(2000);
		box.clear();
		
		
		
		
	}

}
