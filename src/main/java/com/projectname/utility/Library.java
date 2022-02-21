package com.projectname.utility;

import org.openqa.selenium.WebElement;

public class Library {

	public static void Custom_Sendkeys(WebElement element,String Valuetobesent, String fieldname ) {
		
		try {
			element.sendKeys(Valuetobesent);
			Object_Report.test.pass(fieldname+"=="+Valuetobesent);
		}catch (Exception e ) {
			Object_Report.test.fail("Unable to send Value");
		}
	}
		public static void Custom_Click(WebElement element, String fieldname) {
			try {
				element.click();
				Object_Report.test.pass("Clicked sucessfully"+fieldname);
			}catch(Exception e) {
				Object_Report.test.fail("Unable to Click");
			}
		
	}
}
