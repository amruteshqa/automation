package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Frame2 {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");//we avoid IllegalStateException we set the path of driver executable file
WebDriver driver=new FirefoxDriver();// launch the chrome browser
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
driver.manage().window().maximize();//maximize the browser
driver.get("https://www.bluestone.com/jewellery/rings.html");//launch the web application
Thread.sleep(3000);

WebElement target = driver.findElement(By.xpath("//iframe[@id='chat-widget']"));
driver.switchTo().frame(target);

Thread.sleep(6000);

driver.findElement(By.xpath("//div[@class='lc-mmsuz6 e1dmt1bi0']")).click();
driver.findElement(By.id("name")).sendKeys("suraj");
driver.findElement(By.id("email")).sendKeys("sawantsuraj743@gmail.com");
driver.findElement(By.xpath("//span[.='Leave a message']")).click();
}
}
