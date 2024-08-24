package com.omrbranch.pageobjectmodel;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.base.BaseClass;

public class LoginPage extends BaseClass{
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
    
	@FindBy(css="input#email")
	private WebElement username;
	
	@FindBy(css="input#pass")
	private WebElement userpass;
	
	@FindBy(xpath ="//button[@value='login']")
	private WebElement lognbtn;
	
	@FindBy(xpath ="//b[text()='Invalid Login details or Your Password might have expired. ']")
	private WebElement invalidlognbtn;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getUserpass() {
		return userpass;
	}

	public WebElement getLognbtn() {
		return lognbtn;
	}

	public WebElement getInvalidlognbtn() {
		return invalidlognbtn;
	}

	
	public void login(String name,String password)
	{
		sendKeys(username,name );
		sendKeys(userpass, password);
		clickButton(lognbtn);
	}
	
	public void loginenterkey(String name,String password) throws AWTException
	{
		sendKeys(username,name );
		sendKeys(userpass, password);
		clickButton(lognbtn);
		getRobot();
	}
	
	public String getLoginErrorMsgText()
	{
		String elementGetText = elementGetText(invalidlognbtn);
		return elementGetText; 
	}
}
