package webBasedPopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		ChromeDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().window().maximize();//maximize the browser
		driver.get("file:///C:/Users/Amrutesh/Desktop/Automation/html/Alert.html");
		driver.findElement(By.xpath("//button[.='Try it']")).click();
		
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
		al.accept();//this is used to accept the popup
//		String text = al.getText();
//		System.out.println(text);
//		al.dismiss(); //this is also used to do same
		driver.quit();
	}

}
