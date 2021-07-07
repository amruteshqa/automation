package webBasedPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		ChromeDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().window().maximize();//maximize the browser
//		driver.get("https://www.cleartrip.com/");
//		Actions act = new Actions(driver);
//		Actions target = act.moveToElement(driver.findElement(By.xpath("//div[@class='flex flex-middle p-relative homeCalender']")));
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//div[@class='flex flex-middle p-relative homeCalender']")).click();
		
		  
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,4500)");//down
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Mon, Jun 7']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='p-1 day-gridContent flex flex-middle flex-column flex-center flex-top' and .='18']")).click();
	}

}
