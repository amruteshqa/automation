package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTagName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement box = driver.findElement(By.name("q"));
		String id = box.getTagName();
		System.out.println(id);
	}

}
