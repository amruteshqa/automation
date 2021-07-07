package Windowhandles;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);// for implicitlywait
		driver.manage().window().maximize();// for maximize the browser
		driver.get("https://www.naukri.com/");//launch the web application
		
		//1. closing all browsers without Quit().
		
		String window = driver.getWindowHandle();//
		Set<String> allhandles = driver.getWindowHandles();
		
		System.out.println("This is parent" +window);
		System.out.println("this is all window" +allhandles.size());
		
		for(String wh:allhandles)
		{
			driver.switchTo().window(wh);
			driver.close();
			Thread.sleep(2000);
		}

	}

}
