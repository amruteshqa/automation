package PageObjectModel;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class BaseTest implements IAutoConstant {
	static WebDriver driver;
	  
	public void openBrowser() throws IOException
	{
		//get the required data from prop file
	Flib flib = new Flib();
	String browservalue = flib.readPropertyData(PROP_PATH, "browser");
	String baseUrl = flib.readPropertyData(PROP_PATH, "url");
	
	if(browservalue.equalsIgnoreCase("chrome"))
	{
		System.setProperty(CHROME_KEY,CHROME_PATH);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}
	
	else if(browservalue.equalsIgnoreCase("firefox"))
	{
		System.setProperty(GECKO_KEY,GECKO_PATH);
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}
	
	else
	{
		System.out.println("invalid input");
	}
		
	

		
	}
	
	
	public void closeBrowser()
	{
		driver.close();
	}

}


