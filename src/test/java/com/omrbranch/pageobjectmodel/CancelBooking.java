package com.omrbranch.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.base.BaseClass;

public class CancelBooking extends BaseClass{
	
	public CancelBooking()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@data-testid='username']")
	private WebElement userdata;
	
	@FindBy(linkText = "My Account")
	private WebElement myaccount;
	
	@FindBy(xpath = "//h5[text()='Elite Grand Hotel Studio']")
	private WebElement hotelns;
	
	@FindBy(xpath = "//strong[text()='Rs 14,160']")
	private WebElement hotelpricesa;
	
	@FindBy(xpath = "//div[@class='room-code']")
	private WebElement finaldata;
	
	@FindBy(css="input.d-inline-block")
	private WebElement finaldatas;
	
	@FindBy(xpath = "//a[text()='Cancel']")
	private WebElement cancelhotel;
	
	@FindBy(xpath = "//ul//li[@class='alertMsg']")
	private WebElement cancelmsg;

	public WebElement getUserdata() {
		return userdata;
	}

	public WebElement getMyaccount() {
		return myaccount;
	}

	public WebElement getHotelns() {
		return hotelns;
	}

	public WebElement getHotelpricesa() {
		return hotelpricesa;
	}

	public WebElement getFinaldata() {
		return finaldata;
	}

	public WebElement getFinaldatas() {
		return finaldatas;
	}

	public WebElement getCancelhotel() {
		return cancelhotel;
	}

	public WebElement getCancelmsg() {
		return cancelmsg;
	}
   
	
	
}
