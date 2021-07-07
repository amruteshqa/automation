package Windowhandles;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChildBrowserAndkeepParentAlive {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);// for implicitlywait
		driver.manage().window().maximize();// for maximize the browser
		driver.get("https://www.naukri.com/");//launch the web application
		
		//3.CloseChildBrowserAndkeepParentAlive 
		
		String parentwindow = driver.getWindowHandle();
		String parentTitle = driver.getTitle();
		Set<String> allhandles = driver.getWindowHandles();

		for(String wh:allhandles)
		{
			String titles = driver.switchTo().window(wh).getTitle();
			if(!titles.equals(parentTitle))
			{
				driver.close();
			}
			
		}
	}

}
