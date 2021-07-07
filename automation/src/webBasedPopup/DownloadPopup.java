package webBasedPopup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DownloadPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		ChromeDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();//maximize the browser
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//b[.='PIM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Add Employee']")).click();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("ar");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("rairikar");
		WebElement target = driver.findElement(By.xpath("//input[@id='photofile']"));
		new Actions(driver).doubleClick(target).perform();
		
		
		

	}

}
