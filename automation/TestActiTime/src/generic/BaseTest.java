package generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest<Static> implements IAutoConstant {
	 WebDriver driver;

	@BeforeMethod
	public void setup() throws IOException {
		Flib Flib = new Flib();
		String browservalue = Flib.readPropertyData(PROP_PATH, "browser");
		String baseurl = Flib.readPropertyData(PROP_PATH, "url");
		
		if (browservalue.equalsIgnoreCase("chrome")) {
			System.setProperty(CHROME_KEY, CHROME_PATH);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
			driver.get(baseurl);
		} else if (browservalue.equalsIgnoreCase("firefox")) {

			System.setProperty(GECKO_KEY, GECKO_PATH);
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(baseurl);
		} else {
			System.out.println("Invalid o/p");
		}

	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
