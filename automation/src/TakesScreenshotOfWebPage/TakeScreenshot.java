package TakesScreenshotOfWebPage;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenshot {

	

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		ChromeDriver driver=new ChromeDriver();// launch the chrome browser
		
		driver.manage().window().maximize();//maximize the browser
		driver.get("https://www.google.com/");
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/abc.png");
		Files.copy(src, dest);

	}

}
