package generic;

import org.openqa.selenium.WebDriver;

public class WebDriverCommonLib extends BaseTest {
	 WebDriver driver;	
	
	public String getTitleOfWebPage() {
		String titleofwebpage = driver.getTitle();
		return titleofwebpage;
	}
	
	public void verifyTitleOfWebPage(String expectedTitle,){
		
	}
	
	
	
}
