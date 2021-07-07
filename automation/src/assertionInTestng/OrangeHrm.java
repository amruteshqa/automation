package assertionInTestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OrangeHrm {
	WebDriver driver;

	@Test
	public void testOrangeHrm() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		driver.get("https://opensource-demo.orangehrmlive.com/");

		String lp = driver.getTitle();// getting title of LOGIN PAGE(OrangeHRM)
		SoftAssert softassert = new SoftAssert();// creating object of softassert
		softassert.assertEquals(lp, "OrangeHRM");// SoftAssert

		WebElement un = driver.findElement(By.name("txtUsername"));// click on username
		boolean statusOfun = un.isDisplayed();//isDisplayed will return boolean value to the statusOfun
		Assert.assertEquals(statusOfun, true);// hardAssert

		WebElement pwd = driver.findElement(By.name("txtPassword"));// click on password
		boolean statusOfpass = pwd.isDisplayed();//True
		Assert.assertEquals(statusOfpass, true);// hardAssert

		WebElement login = driver.findElement(By.id("btnLogin"));// click on login
		boolean statusOflogin = login.isDisplayed();//True
		Assert.assertEquals(statusOflogin, true);// hardAssert

		un.sendKeys("Admin");
		pwd.sendKeys("admin123");
		login.click();

		Thread.sleep(3000);

		String homepage = driver.getTitle();// getting HOMEPAGE title(OrangeHRM)
		softassert.assertEquals(homepage, "OrangeHrm");// SoftAssert

		Reporter.log("create user", true);
		Reporter.log("do setting", true);

		driver.findElement(By.id("welcome")).click();// logging out
		driver.findElement(By.xpath("//a[.='Logout']")).click();// logging out

		softassert.assertAll();// SoftAssert

	}

}
//WHY DO WE USE softassert.assertAll()?
//1.whenever we use softAssert for non critical features , then the next
//set of lines will be executed. Even if 'softAssert' gets failed.

//2.once after execution is completed , softAssert will not mark the TC as 'failed on its own'.
//3.if we want to mark the TC as failed , we ned to use [softassert.assertAll()] as the last line of our script.
//now this softassert.assertAll() will be applicable to all the softAssert.

//Disadvan-
//if we dont use softassert.assertAll() , SOFTASSERT is of No use.