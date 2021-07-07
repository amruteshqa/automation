package TakeScreenshotDymically;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Base {
	
	
	static WebDriver driver;
	
	public static void initialization()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://desktop-a3rr3tc/login.do");
		
	}
	
	public void fail(String methodName)
	{ 
		try {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		File dest = new File("./screenshots/"+methodName+".png");
		Thread.sleep(5000);
		Files.copy(src, dest);
		Thread.sleep(2000);
		}
		catch (Exception e) {
			
		}
	}

}
