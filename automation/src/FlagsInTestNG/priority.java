package FlagsInTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority {
//f , g ,  h , j , i
	@Test(priority = -1)
	public void A() {
		
		Reporter.log("method A", true);

	}
	
	@Test(priority = 0)
	public void B() {
		
		Reporter.log("method B", true);

	}
	
	@Test(priority = 2)
	public void C() {
		
		Reporter.log("method C", true);

	}
	
	@Test(priority = 1)
	public void D() {
		
		Reporter.log("method D", true);

	}
	
	@Test(priority = 0)
	public void E() {
		
		Reporter.log("method E", true);

	}
}
