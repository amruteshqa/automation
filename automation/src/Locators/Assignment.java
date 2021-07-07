package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Assignment{
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.skillrary.com/user/login");


	WebElement email = driver.findElement(By.id("email"));
	Thread.sleep(2000);
	email.sendKeys("amrutesh@7277");
	WebElement pass = driver.findElement(By.name("password"));
	Thread.sleep(2000);
	pass.sendKeys("amrut");
	WebElement submit = driver.findElement(By.className("btn btn-color animated fadeInLeft"));
	submit.click();

	
	}
	}

