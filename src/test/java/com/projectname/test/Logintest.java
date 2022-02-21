package com.projectname.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.projectname.Pom.Loginpage_Object;
import com.projectname.utility.Baseclass;
import com.projectname.utility.Library;

public class Logintest extends Baseclass {

	@Test
	public void Verify_Logintest_01() {
		Loginpage_Object login = PageFactory.initElements(driver, Loginpage_Object.class);
		Library.Custom_Sendkeys(login.getTxt_Username(), excel.getStringData("LoginTestData", 0, 1), "Email");
		Library.Custom_Sendkeys(login.getTxt_Passworod(), excel.getStringData("LoginTestData", 1, 1), "Password");
		Library.Custom_Click(login.getBtn_login(), "Login");
		
		
		
	}
	
}
