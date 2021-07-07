package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new FirefoxDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();//maximize the browser
		driver.get("file:///C:/Users/Amrutesh/Desktop/Automation/html/username.html");//launch the web application
		Thread.sleep(3000);
		
		driver.findElement(By.id("un")).sendKeys("admin");
		
		WebElement target = driver.findElement(By.id("frid"));
		driver.switchTo().frame(target);

		driver.findElement(By.id("pwd")).sendKeys("mngr");
		
		driver.switchTo().defaultContent();
	}

}
