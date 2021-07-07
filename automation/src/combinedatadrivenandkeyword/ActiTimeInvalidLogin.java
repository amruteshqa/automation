package combinedatadrivenandkeyword;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dataDrivenFramework.Flib;

public class ActiTimeInvalidLogin extends NewBaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		NewBaseTest bt = new NewBaseTest();
		bt.setUp();
		
		Flib fis  = new Flib();
		int rc = fis.getRowCount(EXCEL_PATH, "Invalid");
		
		for (int i = 0; i <=rc; i++) {
			
			String uname = fis.readExcel(EXCEL_PATH, "Invalid", i, 0);
			WebElement username = driver.findElement(By.name("username"));
			username.clear();
			username.sendKeys(uname);
			Thread.sleep(1000);
			
			String pwd = fis.readExcel(EXCEL_PATH, "Invalid", i, 1);
			WebElement password = driver.findElement(By.name("pwd"));
			password.sendKeys(pwd);
			Thread.sleep(2000);
			
			driver.findElement(By.id("loginButton")).click();
			
		}
		
		bt.tearDown();
			
			
		}
	}


