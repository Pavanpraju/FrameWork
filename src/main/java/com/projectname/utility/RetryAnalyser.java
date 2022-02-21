package com.projectname.utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer {
	
    int retrycount = 0;
    int maxretrycount = 3;
    		
	public boolean retry(ITestResult result) {
		if(retrycount<maxretrycount) {
			return true;
		}
		return false;
		
		
	}

	
	
}
