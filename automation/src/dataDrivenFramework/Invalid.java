package dataDrivenFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invalid {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);// for implicitlywait
		driver.manage().window().maximize();// for maximize the browser
		driver.get("http://desktop-a3rr3tc/login.do");//launch the web application
		
		Flib flib = new Flib();
		flib.readExcel("./data/Sample.xlsx", "login", 1, 0);
		
		

	}

}
