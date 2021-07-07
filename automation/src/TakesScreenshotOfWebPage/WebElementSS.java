package TakesScreenshotOfWebPage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class WebElementSS {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		
		driver.manage().window().maximize();//maximize the browser
		driver.get("https://www.google.com/");
		
		WebElement target = driver.findElement(By.name("q"));
		File src = target.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/SsOfSearchBox.png");
		Files.copy(src, dest);

	}

}
