package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	static 
		{ 	
		
			//this is used avoid the illegalStateException
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		}
	
public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver(); //Launch the chrome browser.
		driver.get("https://www.naukri.com"); //use to launch url.
		driver.manage().window().maximize(); //to maximize the window.
		
	}

}
