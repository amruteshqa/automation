package webBasedPopup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions co = new ChromeOptions();//options object
		co.addArguments("--disable-notifications");//close popup
		co.addArguments("-start-maximized");//Without use of maximize , we can maximize
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver1 =new ChromeDriver(co);//passing object in webdriver
		driver1.get("https://www.ajio.com/");//ajio url
	
		}


	}


