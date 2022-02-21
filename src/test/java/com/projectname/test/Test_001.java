package com.projectname.test;

import org.testng.annotations.Test;

import com.projectname.utility.Baseclass;

public class Test_001 extends Baseclass {

	@Test(groups = { "Sanity" })
	public void Verify_001() {
		System.out.println("TC_001");

	}

	@Test(groups = { "Regression" })
	public void Verify_002() {
		System.out.println("TC_002");
	}

	@Test(groups = { "Sanity,Regression" })
	public void Verify_003() {
		System.out.println("TC_003");
	}

	@Test(groups = { "Sanity" })
	public void Verify_004() {
		System.out.println("TC_004");
	}

}
