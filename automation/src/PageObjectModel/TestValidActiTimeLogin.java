package PageObjectModel;

import java.io.IOException;

public class TestValidActiTimeLogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();

		LoginPage lp = new LoginPage(driver);

		Thread.sleep(5000);
		Flib flib = new Flib();

		lp.validLogin(flib.readPropertyData(PROP_PATH, "un"), flib.readPropertyData(PROP_PATH, "pwd"));
		Thread.sleep(5000);
		bt.closeBrowser();
	}

}
