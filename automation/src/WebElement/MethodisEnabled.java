package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodisEnabled {



public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("https://www.instagram.com");
Thread.sleep(2000);
WebElement button = driver.findElement(By.xpath("//button[contains(@class,' L3NKy')]"));
boolean status = button.isEnabled();

System.out.println(status);//false

}

}