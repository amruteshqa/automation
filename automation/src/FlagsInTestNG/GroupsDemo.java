package FlagsInTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupsDemo {
	
	@Test(groups = "FUNCTIONAL")
	public void FT1()
	{
		Reporter.log("FT1",true);
	}
	
	@Test(groups = "INTEGRATION")
	public void IT1()
	{
		Reporter.log("IT1",true);
	}
	
	@Test(groups = "SYSTEM")
	public void ST1()
	{
		Reporter.log("ST1",true);
	}
	
	@Test(groups = "SANITY")
	public void SAT1()
	{
		Reporter.log("SAT1",true);
	}
	
	@Test(groups = "RETESTING")
	public void RT1()
	{
		Reporter.log("RT1",true);
	}
	//********************************************************************************
	
	@Test(groups = "FUNCTIONAL")
	public void FT2()
	{
		Reporter.log("FT2",true);
	}
	
	@Test(groups = "INTEGRATION")
	public void IT2()
	{
		Reporter.log("IT2",true);
	}
	
	@Test(groups = "SYSTEM")
	public void ST2()
	{
		Reporter.log("ST2",true);
	}
	@Test(groups = "SANITY")
	public void SAT2()
	{
		Reporter.log("SAT2",true);
	}
	
	@Test(groups = "RETESTING")
	public void RT2()
	{
		Reporter.log("RT2",true);
	}
	
	//**********************************************************************************
	
	@Test(groups = "FUNCTIONAL")
	public void FT3()
	{
		Reporter.log("FT3",true);
	}
	
	@Test(groups = "INTEGRATION")
	public void IT3()
	{
		Reporter.log("IT3",true);
	}
	
	@Test(groups = "SYSTEM")
	public void ST3()
	{
		Reporter.log("ST3",true);
	}
	
	@Test(groups = "SANITY")
	public void SAT3()
	{
		Reporter.log("SAT3",true);
	}
	
	@Test(groups = "RETESTING")
	public void RT3()
	{
		Reporter.log("RT3",true);
	}
	//**********************************************************************************
}
