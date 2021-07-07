package KeyboardAct;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class anyDesk {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();//maximize the browser
		driver.get("https://selenium.dev/");//launch the web application
		WebElement target = driver.findElement(By.xpath("//a[.='Downloads']"));
		
		Robot rbt = new Robot();
		for (int i = 0; i < 7; i++) 
		{
			Thread.sleep(1000);
			rbt.keyPress(KeyEvent.VK_TAB);
			rbt.keyRelease(KeyEvent.VK_TAB);
		}
			rbt.keyPress(KeyEvent.VK_ENTER);
			rbt.keyRelease(KeyEvent.VK_ENTER);
		

	}

}
