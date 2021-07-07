
package Locators;


	import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

	public class ClassLocator {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver" , "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.instagram.com/");
			Thread.sleep(3000);
			driver.findElement(By.name("username")).sendKeys("admin");
			Thread.sleep(3000);
			driver.findElement(By.name("password")).sendKeys("admin123");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[contains(@class,'jKUp7          ')]")).click();
			
			

		}

	}

