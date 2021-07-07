package PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");// we avoid IllegalStateException we
																					// set the path of driver executable
																					// file
		WebDriver driver = new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// for implicitlywait
		driver.manage().window().maximize();// for maximize the browser
		driver.get("http://desktop-a3rr3tc/login.do");
		
		WebElement uname = driver.findElement(By.name("username"));
		Thread.sleep(2000);
		uname.sendKeys("admin");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		uname.clear();
		Thread.sleep(2000);
		uname.sendKeys("admin");
		
	}
}
