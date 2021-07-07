package KeyboardAct;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseHover {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
	WebDriver driver=new ChromeDriver();// launch the chrome browser
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
	driver.manage().window().maximize();//maximize the browser
	driver.get("https://www.craftsvilla.com");//launch the web application
	Thread.sleep(4000);

	driver.findElement(By.xpath("//a[contains(.,'MENS')]")).click();
	driver.findElement(By.xpath("//a[.='Jackets']")).click();
	}

	}

