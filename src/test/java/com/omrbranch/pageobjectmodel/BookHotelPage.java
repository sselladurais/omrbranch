package com.omrbranch.pageobjectmodel;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.base.BaseClass;

import io.cucumber.datatable.DataTable;

public class BookHotelPage extends BaseClass {

	public static String orderidsave;
	
	public BookHotelPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h2[text()='Book Hotel - Elite Grand Hotel Studio']")
	private WebElement bookhotelname;

	@FindBy(xpath = "//a[@id='step1']")
	private WebElement scrolldown;
	
	@FindBy(css= "input#own")
	private WebElement bookingfor;
	
	@FindBy(id="user_title")
	private WebElement SelectSalutation;
	
	@FindBy(css="input#first_name")
	private WebElement firstname;
	
	@FindBy(css="input#last_name")
	private WebElement lastname;
	
	@FindBy(id="user_phone")
	private WebElement moibleno;
	
	@FindBy(id="user_email")
	private WebElement emailid;
	
	@FindBy(css="input#gst")
	private WebElement gst;
	
	@FindBy(id="gst_registration")
	private WebElement gstreg;
	
	@FindBy(css="input#company_name")
	private WebElement companyname;
	
	@FindBy(css="input#company_address")
	private WebElement companyaddress;
	
	@FindBy(id="step1next")
	private WebElement stepnext;
	
	@FindBy(xpath = "//input[@name='special_request[]']")
	private WebElement allreq;

	@FindBy(xpath = "//input[@value='Smoking Room']")
	private WebElement smoke;
	
	@FindBy(xpath = "//input[@value='Room on a high floor']")
	private WebElement floor;
	
	@FindBy(xpath = "//input[@value='Large bed']")
	private WebElement large;
	
	@FindBy(id="other_request")
	private WebElement request;
	
	@FindBy(id="step2next")
	private WebElement nextb;
	
	@FindBy(xpath = "(//div[@class='fliter_box_inner'])[3]")
	private WebElement filterbox;
	
	@FindBy(xpath = "//input[@name='special_request[]']")
	private List<WebElement> splitreq;
	
	@FindBy(css="select#payment_type")
	private WebElement payment;
	
	@FindBy(css="select#card_type")
	private WebElement cardtype;
	
	@FindBy(css="input#card_no")
	private WebElement cardno;
	
	@FindBy(css="input#card_name")
	private WebElement cardname;
	
	@FindBy(xpath = "//select[@name='card_month']")
	private WebElement month;
	
	@FindBy(xpath = "//select[@name='card_year']")
	private WebElement year;
	
	@FindBy(id="submitBtn")
	private WebElement submitbtn;
	
	@FindBy(css="input#cvv")
	private WebElement cvvsecret;
	
	@FindBy(className = "couppon-code")
	private WebElement orderid;
	
	public String getConfromhotelname() {
		String confromhotelsuccess = elementGetText(bookhotelname);
		return confromhotelsuccess;
	}
	
	public String getBookingConfirmMessage() {
		String bookinghotelsuccess = elementGetText(orderid);
		return bookinghotelsuccess;
	}

	public WebElement getScrolldown() {
		return scrolldown;
	}

	public WebElement getBookingfor() {
		return bookingfor;
	}

	public WebElement getSelectSalutation() {
		return SelectSalutation;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getMoibleno() {
		return moibleno;
	}

	public WebElement getEmail() {
		return emailid;
	}

	public WebElement getGst() {
		return gst;
	}

	public WebElement getGstreg() {
		return gstreg;
	}

	public WebElement getCompanyname() {
		return companyname;
	}

	public WebElement getCompanyaddress() {
		return companyaddress;
	}

	public WebElement getStepnext() {
		return stepnext;
	}

	public WebElement getSmoke() {
		return smoke;
	}

	public WebElement getFloor() {
		return floor;
	}

	public WebElement getLarge() {
		return large;
	}

	public WebElement getRequest() {
		return request;
	}

	public WebElement getNextb() {
		return nextb;
	}

	public WebElement getFilterbox() {
		return filterbox;
	}

	public WebElement getPayment() {
		return payment;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getCardname() {
		return cardname;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}

	public WebElement getCvvsecret() {
		return cvvsecret;
	}

	public WebElement getOrderid() {
		return orderid;
	}
	
	public void getScrollDownButton()
	{
		javaScriptScroll(scrolldown);
	}
	
	public WebElement getAllreq() {
		return allreq;
	}
	
	public void getOtherRequest()
	{
		//String[] splitreq = otherreqthings.split("/");
		for (WebElement stringreq : splitreq) {
			clickButton( stringreq);
		}
	
	}
	
	public String getBookHotelSuccessMsg()
	{
		String text = bookhotelname.getText();
		String[] split = text.split("-");
		String desiredText = split[0].trim();
		System.out.println(desiredText);
		return desiredText;
	}
	
	public void getBookingDetails(String firstName,String lastName,String moible,String email,String regNo,String companyName,String comapnyAddress,String otherreq, DataTable data)
	{
		clickButton(bookingfor);
	    selectByIndex(SelectSalutation, 1);
	    sendKeys(firstname, firstName);
	    sendKeys(lastname, lastName);
	    sendKeys(moibleno,moible );
	    sendKeys(emailid, email);
	    clickButton(gst);
	    sendKeys(gstreg,regNo );
	    sendKeys(companyname, companyName);
	    sendKeys(companyaddress, comapnyAddress);
	    clickButton(stepnext);
	    getOtherRequest();
	    sendKeys(request, otherreq);
	    clickButton(nextb);
	    clickButton(filterbox);
	    getDataTable(data);
	    clickButton(submitbtn);   
	}
	
	public void getDataTable(DataTable data)
	{
		List<Map<String,String>>asMap=data.asMaps(); 
		for(Map<String,String>map:asMap) {
		String paymentcard=map.get("card");
		javaScriptsetAttribute(payment,paymentcard);
		String cardnos = map.get("cardNumber");
		javaScriptsetAttribute(cardtype, cardnos);
		String diffmonth = map.get("month");
		javaScriptsetAttribute(month, diffmonth);
		String diffyear = map.get("year");
		javaScriptsetAttribute(year, diffyear);
		String diffcvv = map.get("cvv");
		javaScriptsetAttribute(year, diffcvv);
}
   
	}
	
	public void getDataTables(io.cucumber.datatable.DataTable datatable,int Value)
   {
		List<Map<String,String>>asMap=datatable.asMaps();
		Map<String,String>mapset=asMap.get(Value);
		String paymentcard=mapset.get("card");
		javaScriptsetAttribute(payment,paymentcard);
		String cardnos = mapset.get("cardNumber");
		javaScriptsetAttribute(cardtype, cardnos);
		String diffmonth = mapset.get("month");
		javaScriptsetAttribute(month, diffmonth);
		String diffyear = mapset.get("year");
		javaScriptsetAttribute(year, diffyear);
		String diffcvv = mapset.get("cvv");
		javaScriptsetAttribute(year, diffcvv);
   }

	public void getOrderId()
	   {
		    orderidsave = elementGetText(orderid);
	   }
}	