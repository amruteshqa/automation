package dataDrivenFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActiTime_Invalid {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		// this is used avoid the illegalStateException
		FirefoxDriver driver = new FirefoxDriver(); //Launch Firefox browser// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();//maximize the browser
		driver.get("http://desktop-a3rr3tc/login.do");//launch the web application
		Thread.sleep(3000);

		Flib flib = new Flib();
		int rc = flib.getRowCount("./data/Testdata.xlsx", "Invalid");
		
		for (int i = 1; i <=rc;i++) {
			
			String username = flib.readExcel("./data/Testdata.xlsx", "Invalid", i, 0);
			WebElement username1 = driver.findElement(By.name("username"));
			username1.clear();
			username1.sendKeys(username);
			Thread.sleep(2000);
			String password = flib.readExcel("./data/Testdata.xlsx", "Invalid", i, 1);
			driver.findElement(By.name("pwd")).sendKeys(password);
			Thread.sleep(2000);
			driver.findElement(By.id("loginButton")).click();
			
		}
		
		
		
	}

}
