package dataDrivenFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidActi {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	Flib fib = new Flib();
	String username = fib.readExcel("./data/Sample.xlsx","login", 1, 0);
	String password = fib.readExcel("./data/Sample.xlsx","login", 1, 1);
	System.out.println(username);
	System.out.println(password);
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	// this is used avoid the illegalStateException
	ChromeDriver driver = new ChromeDriver(); //Launch Firefox browser// launch the chrome browser
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
	driver.manage().window().maximize();//maximize the browser
	driver.get("http://desktop-a3rr3tc/login.do");//launch the web application
	
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.name("pwd")).sendKeys(password);
	driver.findElement(By.id("loginButton")).click();
	
	
}
}
