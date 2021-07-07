package PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class StaleElementReferenceException {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);// for implicitlywait
		driver.manage().window().maximize();// for maximize the browser
		driver.get("http://desktop-a3rr3tc/login.do");
		
		WebElement username = driver.findElement(By.name("username"));//@abc123
		driver.navigate().refresh();
		username.sendKeys("admin");// staleElementReferenceExcpetion
}
}
