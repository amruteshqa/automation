
		package Dropdown;

		import java.util.List;
		import java.util.concurrent.TimeUnit;

		import javax.sound.midi.Soundbank;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.Select;

		

		public class getOption {



		public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();//maximize the browser
		driver.get("file:///C:/Users/Amrutesh/Desktop/Automation/html/list.html");//launch the web application
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='menu']"));
		Select sel = new Select(dropdown);
		List<WebElement> options = sel.getOptions();

		//using for each loop printing all the options of Dropdown
		for(WebElement we :options)
		{
		String ops = we.getText();
		System.out.println(ops);
		}

	}

}


