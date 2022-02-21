package com.projectname.utility;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public static WebDriver driver;
	public static ConfigDataProvider config;
	public static Exceldataprovider excel;

	@BeforeSuite
	public void BS() throws Exception {
		System.out.println("I am before Suite");
		config=new ConfigDataProvider();
		excel = new Exceldataprovider();
	}

	@BeforeTest
	public void BT() {
		System.out.println("I am before Test");
	}

	@BeforeClass
	public void BC() {
		System.out.println("I am before Class");
	}

	@Parameters({"Browsername"})
	@BeforeMethod
	public void setup(@Optional String Browsername) {
		System.out.println("Browser Open");
		if(Browsername.equalsIgnoreCase(config.getBrowser())) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(config.getURL());
		driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		else if(Browsername.equalsIgnoreCase("Firefox")) {
			
		}

	}

	@AfterMethod
	public void testDown() {
		System.out.println("Browser close");

		driver.quit();

	}

	@AfterClass
	public void Ac() {
		System.out.println("I am After Class");
	}

	@AfterTest
	public void AT() {
		System.out.println("I am After Test");
	}

	@AfterSuite
	public void AS() {
		System.out.println("I am After Suite");
	}

}
