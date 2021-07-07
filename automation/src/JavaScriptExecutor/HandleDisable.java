package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisable {



	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();//maximize the browser
		driver.get("file:///C:/Users/Amrutesh/Desktop/Automation/html/jse.html");//launch the web application
		WebElement uname = driver.findElement(By.id("i1"));
		WebElement pwd = driver.findElement(By.id("i2"));
		
		if(uname.isEnabled())
		{
			uname.sendKeys("Amrut");
		}
		else
		{
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('i1').value='Amrut'");
		}
		
		if(pwd.isEnabled())
		{
			pwd.sendKeys("Rairikar");
		}
		else
		{
			JavascriptExecutor jse2 = (JavascriptExecutor) driver;
			jse2.executeScript("document.getElementById('i2').value='Rairikar'");
		}
	}}
