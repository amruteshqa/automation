package FlagsInTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Groups {
	
@Test(groups = "FUNCTIONAL")
public void ft1() {
	Reporter.log("FT!",true);
	
}
@Test(groups = "INTEGRATION")
public void it1() {
	Reporter.log("IT!",true);
}
@Test(groups = "SMOKE")
public void st1() {
	Reporter.log("ST!",true);
}

@Test(groups = "FUNCTIONAL")
public void ft2() {
	Reporter.log("FT2",true);
}
@Test(groups = "INTEGRATION")
public void it2() {
	Reporter.log("IT2",true);
}
@Test(groups = "SMOKE")
public void st2() {
	Reporter.log("ST2",true);
}
//___________________________________________________________________
@Test(groups = "FUNCTIONAL")
public void ft3() {
	Reporter.log("FT3",true);
}
@Test(groups = "INTEGRATION")
public void it3() {
	Reporter.log("IT3",true);
}
@Test(groups = "SMOKE")
public void st3() {
	Reporter.log("ST3",true);
}
//______________________________________________----
@Test(groups = "FUNCTIONAL")
public void ft4() {
	Reporter.log("FT4",true);
}
@Test(groups = "INTEGRATION")
public void it4(){
	Reporter.log("it4!",true);
}
@Test(groups = "SMOKE")
public void st4() {
	Reporter.log("sT4",true);
}
///=======================================
@Test(groups = "FUNCTIONAL")
public void ft5() {
	Reporter.log("FT5",true);
}
@Test(groups = "INTEGRATION")
public void it5() {
	Reporter.log("iT5",true);
}
@Test(groups = "SMOKE")
public void st5() {
	Reporter.log("sT5",true);
}
//___________________________________
@Test(groups = "FUNCTIONAL")
public void ft6() {
	Reporter.log("FT6",true);
}
@Test(groups = "INTEGRATION")
public void it6() {
	Reporter.log("IT6",true);
}
@Test(groups = "SMOKE")
public void st6() {
	Reporter.log("ST6",true);
}



}

//with the help of group execution.xml file 
//we can perform group execution.
//in above scenario , we have 18 t.c (@test=18)
//And all of this @test are labled as per there type.(FT,IT,ST).
//Lableing has to be done like this.
//@Test(groups = "FUNCTIONAL")
//public void ft6() {
//	Reporter.log("FT6",true);
//}
//@Test(groups = "INTEGRATION")
//public void it6() {
//	Reporter.log("IT6",true);
//}
//@Test(groups = "SMOKE")
//public void st6() {
//	Reporter.log("ST6",true);
//}

//in the xml we have to define whichever lables that we have to include.
//inside RUN , we need to specify which T.C has to be included and which has to be excluded
//so if we run this xml file , only included set of t.c will execute.

