package com.omrbranch.pageobjectmodel;

import java.awt.AWTException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.base.BaseClass;

public class SearchHotelPage extends BaseClass {

	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@data-testid='username']")
	private WebElement welcome;

	@FindBy(linkText = "Book Hotel")
	private WebElement book;

	@FindBy(xpath = "//select[@name='state']")
	private WebElement statename;

	@FindBy(xpath = "//span[text()='Select City *']")
	private WebElement citybtn;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	private WebElement city;

	@FindBy(className = "select2-search__field")
	private WebElement room;

	@FindBy(xpath = "//li[text()='Luxury']")
	private WebElement Luxurytype;

	@FindBy(className = "select2-search__field")
	private WebElement rooms;

	@FindBy(xpath = "//li[text()='Standard']")
	private WebElement Standardtype;

	@FindBy(className = "select2-search__field")
	private WebElement roomsa;

	@FindBy(xpath = "//li[text()='Deluxe']")
	private WebElement deluxetype;

	@FindBy(className = "select2-search__field")
	private WebElement roomsb;

	@FindBy(xpath = "//li[text()='Suite']")
	private WebElement suitetype;

	@FindBy(className = "select2-search__field")
	private WebElement roomsc;

	@FindBy(xpath = "//li[text()='Studio']")
	private WebElement studiotype;

	@FindBy(css = ".form-control.from.hasDatepicker")
	private WebElement data;

	@FindBy(css = ".form-control.to.hasDatepicker")
	private WebElement date;

	@FindBy(id = "no_rooms")
	private WebElement noroom;

	@FindBy(id = "no_adults")
	private WebElement noadults;

	@FindBy(id = "no_child")
	private WebElement nochild;

	@FindBy(id = "hotelsearch_iframe")
	private WebElement frameid;

	@FindBy(xpath = "//button[text()='Search']")
	private WebElement searchbtns;

	@FindBy(css = "#invalid-state")
	private WebElement stateerror;

	@FindBy(css = "#invalid-city")
	private WebElement cityerror;

	@FindBy(xpath = "//div[text()='Please select Check-in date']")
	private WebElement dateinerror;

	@FindBy(xpath = "//div[text()='Please select Check-out date']")
	private WebElement dateouterror;

	@FindBy(xpath = "//div[text()='Please select no. of rooms']")
	private WebElement roomerror;

	@FindBy(xpath = "//div[text()='Please select no. of adults']")
	private WebElement adultserror;

	@FindBy(xpath = "//h5[text()='Explore Hotels']")
	private WebElement exhotel;

	public void selectRoomType(String roomType) throws AWTException {
		String[] split = roomType.split("/");
		for (String s : split) {
			sendKeys(room,s+Keys.ENTER);
			//getRobot();
			System.out.println(s);
		}
		
	}

	public WebElement getWelcome() {
		return welcome;
	}

	public WebElement getState() {
		return statename;
	}

	public WebElement getBook() {
		return book;
	}

	public WebElement getCitybtn() {
		return citybtn;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getLuxurytype() {
		return Luxurytype;
	}

	public WebElement getRooms() {
		return rooms;
	}

	public WebElement getStandardtype() {
		return Standardtype;
	}

	public WebElement getRoomsa() {
		return roomsa;
	}

	public WebElement getDeluxetype() {
		return deluxetype;
	}

	public WebElement getRoomsb() {
		return roomsb;
	}

	public WebElement getSuitetype() {
		return suitetype;
	}

	public WebElement getRoomsc() {
		return roomsc;
	}

	public WebElement getStudiotype() {
		return studiotype;
	}

	public WebElement getData() {
		return data;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getNoroom() {
		return noroom;
	}

	public WebElement getNoadults() {
		return noadults;
	}

	public WebElement getNochild() {
		return nochild;
	}

	public WebElement getFrameid() {
		return frameid;
	}

	public WebElement getSearchbtns() {
		return searchbtns;
	}

	public String getLoginSuccessMsgText() {
		String welcomemessage = elementGetText(welcome);
		return welcomemessage;
	}

	public String getExploreMsg() {
		String allexplorehotel = elementGetText(exhotel);
		return allexplorehotel;
	}

	public String getStateErrorMsg() {
		String unclickstate = elementGetText(stateerror);
		return unclickstate;
	}

	public String getCityErrorMsg() {
		String unclickcity = elementGetText(cityerror);
		return unclickcity;
	}

	public String getDateInErrorMsg() {
		String unclickdatein = elementGetText(dateinerror);
		return unclickdatein;
	}

	public String getDateOutErrorMsg() {
		String unclickdateout = elementGetText(dateouterror);
		return unclickdateout;
	}

	public String getRoomErrorMsg() {
		String unclickroom = elementGetText(roomerror);
		return unclickroom;
	}

	public String getAdultErrorMsg() {
		String unclickadult = elementGetText(adultserror);
		return unclickadult;
	}

	public void searchHotels(String state, String cityname, String Standardroomtype, String checkIn, String checkOut,
			String noofrooms, String adults, String childcount) throws AWTException {
		clickButton(book);
		selectByText(statename, state);
		clickButton(citybtn);
		clickButton(city);
		sendKeys(city, cityname);
		getRobot();
		sendKeys(room, Standardroomtype);
		getRobot();
		getTabRobot();
		javaScriptsetAttribute(data, checkIn);
		javaScriptsetAttribute(date, checkOut);
		selectByText(noroom, noofrooms);
		selectByText(noadults, adults);
		sendKeys(nochild, childcount);
		getTabRobot();
		getRobot();
	}

	public void hotelMandatoryFields(String state, String cityname, String checkIn, String checkOut, String noofrooms,
			String adults) throws AWTException {
		clickButton(book);
		selectByText(statename, state);
		clickButton(citybtn);
		clickButton(city);
		sendKeys(city, cityname);
		getRobot();
		javaScriptsetAttribute(data, checkIn);
		javaScriptsetAttribute(date, checkOut);
		selectByText(noroom, noofrooms);
		selectByText(noadults, adults);
		getTabRobot();
		getTabRobot();
		getRobot();
	}

	public void hotelAllRoom(String state, String cityname, String roomType, String checkIn, String checkOut,
			String noofrooms, String adults, String childcount) throws AWTException, InterruptedException {
		clickButton(book);
		selectByText(statename, state);
		clickButton(citybtn);
		clickButton(city);
		sendKeys(city, cityname);
		getRobot();
		selectRoomType(roomType);
		Thread.sleep(3000);
		getRobot();
		javaScriptsetAttribute(data, checkIn);
		javaScriptsetAttribute(date, checkOut);
		selectByText(noroom, noofrooms);
		selectByText(noadults, adults);
		sendKeys(nochild, childcount);
		getRobot();
		getTabRobot();
		getRobot();
	}

	public void clickSearchButton() {
		clickButton(book);
		frameByIndex(0);
		clickButton(searchbtns);
		getDefaultContent();
	}

}
