package combinedatadrivenandkeyword;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;

import handlingProprtyFile.Flib1;

public class ActiTImeValidLogin extends NewBaseTest{
		public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

			NewBaseTest bt = new NewBaseTest(); //KeywordDriven
			
			bt.setUp();//Keyword driven method
			Thread.sleep(3000);
			
			Flib1 flib =  new Flib1();//keyword driven
			
			driver.findElement(By.name("username")).sendKeys(flib.readPropertyFile(PROP_PATH, "un"));//Data driven
			driver.findElement(By.name("pwd")).sendKeys(flib.readPropertyFile(PROP_PATH, "pwd"));//Data driven
			Thread.sleep(3000);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(5000);
			bt.tearDown();//keyword driven
	}

}
