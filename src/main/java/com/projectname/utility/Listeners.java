package com.projectname.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners implements ITestListener {
	
	ExtentReports extent = Extenttestreport.getExtentreport();
	ThreadLocal<ExtentTest> Extenttest = new ThreadLocal<ExtentTest>();

	public void onTestStart(ITestResult result) {
		Object_Report.test=extent.createTest(result.getClass().getName()+"=="+result.getMethod().getMethodName());
		Extenttest.set(Object_Report.test);
	}

	public void onTestSuccess(ITestResult result) {
		Object_Report.test.log(Status.PASS,"Testcase Pass");
	}

	public void onTestFailure(ITestResult result) {
		Object_Report.test.log(Status.FAIL,"Testcase Fail");
		
	}

	public void onTestSkipped(ITestResult result) {
		Object_Report.test.log(Status.SKIP, "Testcse skip");
	}

	public void onFinish(ITestContext context) {
		extent.flush();
	
	}

	
}
