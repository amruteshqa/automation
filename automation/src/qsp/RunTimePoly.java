package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunTimePoly {
	static WebDriver driver;
	
	public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter name of browser");
			String Browservalue = sc.next();
			System.out.println(Browservalue);
			
			if(Browservalue.equalsIgnoreCase("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver" , "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
				driver.get("www.google.com");
			}
			
			else
			{
				System.out.println("no");
			}

	}

}
