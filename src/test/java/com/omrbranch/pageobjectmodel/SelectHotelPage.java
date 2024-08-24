package com.omrbranch.pageobjectmodel;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.base.BaseClass;

public class SelectHotelPage extends BaseClass{

	public static String firsthotelname;
	public static String firsthotelprice;
	
	public SelectHotelPage()
	{
		PageFactory.initElements(driver,this);
	}
	

	@FindBy(className = "select2-search__field")
	private WebElement room;
	
	public WebElement getRoom() {
		return room;
	}


	@FindBy(xpath = "//h5[text()='Select Hotel']")
	private WebElement selecthotel;
	
	@FindBy(xpath = "//a[@id='room_type']")
	private WebElement allroomtypes;
	
	@FindBy(xpath = "//h5[text()='Elite Grand Hotel Standard']")
	private WebElement firsthotel;
	
	@FindBy(xpath = "//strong[@class='total-prize']")
	private WebElement firstprice;
	
	@FindBy(xpath = "//label[text()='Name Ascending']")
	private WebElement nameasc;
	
	@FindBy(xpath = "//label[text()='Price High to low']")
	private WebElement pricehtl;
	
	@FindBy(linkText = "Continue")
	private WebElement conhotel;
	
	@FindBy(xpath = "//h5[text()='Elite Grand Hotel Standard']")
	private WebElement hotelname;

	
	@FindBy(xpath = "//a[@id='step1']")
	private WebElement scrolldown;
	
	@FindBy(xpath = "//div[@id='hotellist']//h5")
	private List<WebElement> hoteldata;
	
	@FindBy(xpath = "//strong[@class='total-prize']")
	private List<WebElement> hotelpricelist;
	
	public WebElement getnameasc() {
		return nameasc;
	}
	
	public WebElement getSelecthotel() {
		return selecthotel;
	}

	public WebElement getFirsthotel() {
		return firsthotel;
	}

	public WebElement getHotelprice() {
		return firstprice;
	}

	public WebElement getConhotel() {
		return conhotel;
	}

	public WebElement getHotelname() {
		return hotelname;
	}
	
	public WebElement getScrolldown() {
		return scrolldown;
	}
	
	public List<WebElement> getHoteldata() {
		return hoteldata;
	}

	public String getSearchHotelSuccessMsg()
	{
		String selecthotelmsg = elementGetText(selecthotel);
		return selecthotelmsg;
	}
	public String getAllRoomTypeSuccessMsg()
	{
		String allroomtype = elementGetText(allroomtypes);
		return allroomtype;
	}
	public String getHotelSuccessMsg()
	{
		String firsthotelsuccess = elementGetText(firsthotel);
		return firsthotelsuccess;
	}
	
	public String getHotelPriceSuccessMsg()
	{
		String firsthotelname = elementGetText(firstprice);
		return firsthotelname;
	}
	
	/*public void getHotelNameSuccess()
	{
		String[] a = {"Elite Grand Hotel Standard"};
		for (String s : a) {
			boolean contains = s.contains("Standard");
		}
	}*/

	public boolean getHotelEnd(String roomType)
	{
		
		List<List<WebElement>> hotelname =Arrays.asList(hoteldata);
		//List<WebElement> hotelname =findelementsByXpath(hoteldata);
		List<Boolean>hotelendswith=new ArrayList<>();
		for(List<WebElement> hotel:hotelname)
		{
			System.out.println(hotel.hashCode());
			for (WebElement c : hotel) {
			String text = c.getText();
			boolean b=text.endsWith(roomType);
			hotelendswith.add(b);
			//System.out.println(hotelname);
			System.out.println(text);
			}
		}
		boolean contains = hotelendswith.contains(false);
		System.out.println(contains);
		return contains;
	}

	public void getHotelPrintedAscOrder() throws AWTException, InterruptedException {
		clickButton(nameasc);
	   
		
	}
	
  public boolean getHotelAscOrder() throws InterruptedException
  {
	 // List<WebElement> aschotelname = findelementsByXpath("hoteldata");
	  Thread.sleep(3000);
	  List<List<WebElement>> aschotelname =Arrays.asList(hoteldata);
	  List<String>hotelascorder=new ArrayList<>();
	  for(List<WebElement> string:aschotelname)
	  {
		  System.out.println(string.hashCode());
		  
		  for (WebElement asc : string) {
		  String text1 = asc.getText();
		  System.out.println("a"+text1);
		  hotelascorder.add(text1);
		  }
		  System.out.println("b"+hotelascorder);
		  Collections.sort(hotelascorder);
		  System.out.println("c"+hotelascorder);
	  }
	  boolean equals = hotelascorder.equals(aschotelname);
	  return equals;
}	
  
public void getHotelPriceHighToLow() {
	clickButton(pricehtl);
}
	
public boolean getHotelPriceDescOrder()
{
	//List<WebElement> hotelname =findelementsByXpath("hotelpricelist");
	List<List<WebElement>> hotelprices=Arrays.asList(hoteldata);
	List<String>hightolow=new ArrayList<>();
	for (List<WebElement> hotelpricelists : hotelprices) {
		for (WebElement string : hotelpricelists) {
			String elementGetText = elementGetText(string);
			//String text = string.getText();
			System.out.println(elementGetText);
			hightolow.add(elementGetText);
		}
	}
	boolean equals = hightolow.equals(hightolow);
	return equals;
}

public void getFirstHotelNameAndPrice()
{
	 firsthotelname = elementGetText(firsthotel);
	 firsthotelprice=elementGetText(firstprice);
}

public void getAlertAccept()
{
	clickButton(conhotel);
	elementOkAccept();
}

public void getAlertDismiss()
{
  clickButton(conhotel);
  elementOkDimiss();
}
}
