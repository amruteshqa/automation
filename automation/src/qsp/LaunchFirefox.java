package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		// this is used avoid the illegalStateException
		new FirefoxDriver(); //Launch Firefox browser

	}

}
