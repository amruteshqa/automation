package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MockScript {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.craftsvilla.com/");
driver.findElement(By.xpath("//input[@name='q']")).sendKeys("jackets");

driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();




// for(int b=0;b<sugg.size();b++)
// {
// String ops = sugg.get(b).getText();
// System.out.println(ops);
// Thread.sleep(2000);
//
// }








}




}
