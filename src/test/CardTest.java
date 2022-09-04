package test;

import org.testng.annotations.Test;

public class CardTest extends BaseClass {
	
	@Test(groups= {"sanity"},description ="This test will validate Credit Card Test")
	public void CCTest() {
		
		System.out.println("Inside CC Test");
	}

}
