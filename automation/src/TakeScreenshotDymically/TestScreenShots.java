package TakeScreenshotDymically;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListners.class)
public class TestScreenShots extends Base {

	@BeforeMethod
	public void setUp() {
		initialization();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void verifyTitle() {
		String loginPageTitle = driver.getTitle();
		Assert.assertEquals(loginPageTitle, "actiTIME123 - Login");
	}

	@Test
	public void invalidTest() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		WebElement msg = driver.findElement(By.xpath("//span[@class='errormsg' and contains(.,'User')]"));
		boolean status = msg.isDisplayed();
		Assert.assertEquals(status, true);
		Thread.sleep(15000);
	}

	@Test
	public void verifyTitle2() {
		String loginPageTitle = driver.getTitle();
		Assert.assertEquals(loginPageTitle, "actiTIME123 - Login");
	}

	@Test(dependsOnMethods = "verifyTitle2")
	public void verifyTitle3() {
		String loginPageTitle = driver.getTitle();
		Assert.assertEquals(loginPageTitle, "actiTIME123 - Login");
	}

	@Test
	public void verifyTitle4() {
		String loginPageTitle = driver.getTitle();
		Assert.assertEquals(loginPageTitle, "actiTIME123 - Login");
	}

	@Test
	public void verifyTitle5() {
		String loginPageTitle = driver.getTitle();
		Assert.assertEquals(loginPageTitle, "actiTIME123 - Login");
	}

}
