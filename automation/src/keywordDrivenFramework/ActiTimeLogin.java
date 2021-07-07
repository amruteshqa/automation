package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import keywordDriverFramework.BaseTest;
import keywordDriverFramework.Flib;

public class ActiTimeLogin  extends BaseTest{
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		
		bt.openBrowser();
		Thread.sleep(3000);
		
		Flib flib = new Flib();
		
		driver.findElement(By.name("username")).sendKeys("admin");//from line 21
		driver.findElement(By.name("pwd")).sendKeys("manager");//from line 22
		Thread.sleep(3000);
		driver.findElement(By.id("loginButton")).click();
		
		bt.closeBrowser();
		
		
		
	}

}
