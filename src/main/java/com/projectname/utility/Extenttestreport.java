package com.projectname.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extenttestreport {
	
	public static ExtentReports extent ;
	
	public static ExtentReports getExtentreport() {
		
		
		String path="C:\\Users\\admin04\\eclipse-workspace\\FrameWork\\Reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Test Executin Report");
		reporter.config().setReportName("Automation Report");
		reporter.config().setTheme(Theme.DARK);
		
	    extent = new ExtentReports();
	    extent.attachReporter(reporter);
	    
	    extent.setSystemInfo("System", "Lenovo");
	    extent.setSystemInfo("QA", "Pavan");
	    extent.setSystemInfo("Environment", "Stage");
	    extent.setSystemInfo("Browser", "Chrome");
	    return extent;
	}

}
