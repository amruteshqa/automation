package TakeScreenshotDymically;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomListners extends Base implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("test has been started",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("test has is successful",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test Script got failed and screenshot is taken",true);
		fail(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log(result.getMethod().getMethodName()+" test is skipped",true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("This is the test script",true);
	}

	@Override
	public void onFinish(ITestContext context) {
		
		
		Reporter.log("Reports are generated",true);
		
	}

}
