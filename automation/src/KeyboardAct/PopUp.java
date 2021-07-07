package KeyboardAct;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUp {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver(); 
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);// for implicitlywait
		driver.manage().window().maximize();// for maximize the browser
		driver.get("https://www.selenium.dev/downloads/");//launch the web application
		
		Robot robot = new Robot();
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_P);
		robot.keyRelease(KeyEvent.VK_P);
		robot.keyRelease(KeyEvent.VK_CONTROL);
			for (int i = 0; i < 7; i++) 
		{
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
	}

}
