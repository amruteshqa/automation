package keywordDriverFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import handlingProprtyFile.Flib1;

public class ActiTimeValidLogin {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		// this is used avoid the illegalStateException
		FirefoxDriver driver = new FirefoxDriver(); //Launch Firefox browser// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();//maximize the browser
		driver.get("http://desktop-a3rr3tc/login.do");//launch the web application
		Thread.sleep(3000);
		
		Flib1 flib = new Flib1();
		String url = flib.readPropertyFile("./data/config.properties", "url");
		driver.get(url);
		
		String username = flib.readPropertyFile("./data/config.properties", "un");
		String password = flib.readPropertyFile("./data/config.properties", "pwd");
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();

	}

}
