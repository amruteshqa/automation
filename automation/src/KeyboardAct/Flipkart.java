package KeyboardAct;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();//maximize the browser
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Laptop");
		//Thread.sleep(2000);

		Robot Control = new Robot();

		Control.keyPress(KeyEvent.VK_CONTROL);
		Control.keyPress(KeyEvent.VK_P);
		Thread.sleep(2000);
		Control.keyRelease(KeyEvent.VK_P);
		Control.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		Control.keyPress(KeyEvent.VK_TAB);
		Control.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		Control.keyPress(KeyEvent.VK_ENTER);
		Control.keyRelease(KeyEvent.VK_ENTER);
		}

		
	}


