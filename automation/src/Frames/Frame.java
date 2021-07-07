package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		// this is used avoid the illegalStateException
		FirefoxDriver driver = new FirefoxDriver(); //Launch Firefox browser// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();//maximize the browser
		driver.get("file:///C:/Users/Amrutesh/Desktop/Automation/html/username.html");//launch the web applicatio
		driver.findElement(By.id("un")).sendKeys("Admin");
		driver.findElement(By.id("pwd")).sendKeys("admin");
	}

}
