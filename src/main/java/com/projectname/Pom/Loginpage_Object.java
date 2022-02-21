package com.projectname.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpage_Object {
	
	WebDriver driver;

	//https://www.facebook.com/
	////input[@id='email']
	
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	private WebElement txt_Username;
	@FindBy(how=How.XPATH,using="//input[@id='pass']")
	private WebElement txt_Passworod;
	@FindBy(how=How.XPATH,using="//button[@name='login']")
	private WebElement btn_login;
	
	public Loginpage_Object(WebDriver driver) {
		this.driver=driver;
		
	}

	public WebElement getTxt_Username() {
		return txt_Username;
	}

	public void setTxt_Username(WebElement txt_Username) {
		this.txt_Username = txt_Username;
	}

	public WebElement getTxt_Passworod() {
		return txt_Passworod;
	}

	public void setTxt_Passworod(WebElement txt_Passworod) {
		this.txt_Passworod = txt_Passworod;
	}

	public WebElement getBtn_login() {
		return btn_login;
	}

	public void setBtn_login(WebElement btn_login) {
		this.btn_login = btn_login;
	}
	
	
}
