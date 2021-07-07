package KeyboardAct;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Keyboardact {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	// this is used avoid the illegalStateException
	WebDriver driver = new FirefoxDriver(); //Launch Firefox browser// launch the chrome browser
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);// for implicitlywait
	driver.manage().window().maximize();// for maximize the browser
	driver.get("https://www.selenium.dev/downloads/");//launch the web application
	driver.findElement(By.xpath("//a[.='3.141.59']")).click();
	Robot robot = new Robot();
	Thread.sleep(1000);
	robot.keyPress(KeyEvent.VK_ENTER);
	
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
}
}
