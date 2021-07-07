package flipkart;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assign {
	

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
			WebDriver driver=new ChromeDriver();// launch the chrome browser
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);// for implicitlywait
			driver.manage().window().maximize();// for maximize the browser
			driver.get("https://www.flipkart.com");//launch the web application
			driver.findElement(By.xpath("//button[.='✕']")).click();//close the hidden division popup
			
			
			driver.findElement(By.name("q")).sendKeys("mobile");// send the text mobile to searchbox
			driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();//click on search icon
			
			WebElement target = driver.findElement(By.xpath("//span[.='Electronics']"));
			
			Actions act = new Actions(driver);
			act.moveToElement(target).perform();//mouse Hover action performed on target Electronics
			
			//select the brand (samsung)
			driver.findElement(By.xpath("//div[@class='_1fwVde']/a[.='Samsung']")).click();
			
			//select any mobile
			driver.findElement(By.xpath("//img[@alt='SAMSUNG Galaxy M12 (Black, 128 GB)']")).click();
			Thread.sleep(3000);
			String parentHandle = driver.getWindowHandle();// to get the window handle of current tab
			
			Set<String> handles = driver.getWindowHandles();// to get all window handles
			
			//switching the control to the newly opened tab
			for(String se:handles)
			{
				if(!se.equals(parentHandle))
				driver.switchTo().window(se);
			}
			Thread.sleep(3000);
			
			
			//select color
			driver.findElement(By.xpath("(//div[@class='_2C41yO'])[3]")).click();
			Thread.sleep(2000);
			//select the storage
			driver.findElement(By.xpath("//a[.='64 GB']")).click();
			
			//add to cart button
			driver.findElement(By.xpath("//button[@class='_2KpZ6l 2U9uOA 3v1-ww']")).click();
			
			//click on remove icon
			driver.findElement(By.xpath("//div[.='Remove']")).click();
			
			
			//click on remove button
			driver.findElement(By.xpath("//div[@class='td-FUv WDiNrH']/div[2]")).click();
			
			
			

		
	}
}
