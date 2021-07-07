package mouseAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_MouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);// for implicitlywait
		driver.manage().window().maximize();// for maximize the browser
		driver.get("https://www.flipkart.com");//launch the web application
		driver.findElement(By.xpath("//button[.='✕']")).click();//close the hidden division popup
		
		Actions act = new Actions(driver);
	//	act.moveToElement(driver.findElement(By.linkText("Electronics"))).perform();
	//	act.moveToElement(driver.findElement(By.linkText("Fashion"))).perform();
		act.moveToElement(driver.findElement(By.linkText("Home"))).perform();

	}

}
