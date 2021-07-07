package webBasedPopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		ChromeDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().window().maximize();//maximize the browser
		driver.get("file:///C:/Users/Amrutesh/Desktop/Automation/html/confirmationpopup.html");
		driver.findElement(By.xpath("//button[.='I am Hungry']")).click();
		
		Alert al = driver.switchTo().alert();
		String text = al.getText();
		System.out.println(text);
		Thread.sleep(3000);
		//al.dismiss();//to cancel the popup
		al.accept();//to accept the popup
		driver.quit();
	}

}
