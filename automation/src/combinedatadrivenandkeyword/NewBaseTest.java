package combinedatadrivenandkeyword;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjectModel.Flib;

public class NewBaseTest implements iAutoConstant {
	static WebDriver driver;
	public void setUp() throws IOException
	{
		Flib fb = new Flib();
		String browser = fb.readPropertyData(PROP_PATH,"browser");
		String baseurl = fb.readPropertyData(PROP_PATH,"url");
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY,CHROME_PATH);
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
			driver.manage().window().maximize();// for maximize the browser
			driver.get(baseurl);
		}

		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY,GECKO_PATH);
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
			driver.manage().window().maximize();// for maximize the browser
			driver.get(baseurl);
		}
		else
		{
			System.out.println("Invalid broswer");
		}
	   }

	public void tearDown()
	{
		driver.close();
	}


}
