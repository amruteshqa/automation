package webBasedPopup;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actitime {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();// for maximize the browser
		driver.get("http://desktop-a3rr3tc/login.do");//launch the web application

		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//a[.='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='content administration']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='uploadNewLogoOption']")).click();
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		new Actions(driver).doubleClick(target).perform();
		Runtime.getRuntime().exec("C:\\Users\\Amrutesh\\Desktop\\eclipse\\automation\\AutoIt\\Acti3.exe");
		

	}

}
