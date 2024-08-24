package com.omrbranch.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.base.BaseClass;

public class ChangeBooking extends BaseClass{

	public ChangeBooking()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(className = "couppon-code")
	private WebElement orderid;
	
	@FindBy(xpath = "//strong[text()='Elite Grand Hotel']")
	private WebElement orderhotelname;
	
	@FindBy(xpath = "//button[@class='btn filter_btn'])[2]")
	private WebElement searchhotelname;
	
	@FindBy(css=".d-inline-block")
	private WebElement orderids;
	
	@FindBy(xpath = "//strong[text()='Elite Grand Hotel']")
	private WebElement orderhotelcorrectname;
	
	@FindBy(xpath = "//button[text()='Edit']")
	private WebElement linkeddata;

	public WebElement getOrderid() {
		return orderid;
	}

	public WebElement getOrderhotelname() {
		return orderhotelname;
	}

	public WebElement getSearchhotelname() {
		return searchhotelname;
	}

	public WebElement getOrderids() {
		return orderids;
	}

	public WebElement getOrderhotelcorrectname() {
		return orderhotelcorrectname;
	}

	public WebElement getLinkeddata() {
		return linkeddata;
	}
	
	
}
