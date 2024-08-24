package com.omrbranch.ProjectManager;

import com.omrbranch.pageobjectmodel.BookHotelPage;
import com.omrbranch.pageobjectmodel.LoginPage;
import com.omrbranch.pageobjectmodel.SearchHotelPage;
import com.omrbranch.pageobjectmodel.SelectHotelPage;

public class PageObjectManager {
	
	private LoginPage loginpage;
	private SearchHotelPage searchhotelpage;
	private SelectHotelPage selecthotelpage;
	private BookHotelPage bookhotelpage;
	//private BookingConfirmPage bookingconfirmpage;
	//private MyBookingPage mybookingpage;
	
	
	public LoginPage getLoginPage()
	{
		return(loginpage==null)?loginpage=new LoginPage():loginpage;
	}

	public SearchHotelPage getSearchHotelPage()
	{
		return(searchhotelpage==null)?searchhotelpage=new SearchHotelPage():searchhotelpage;
	}
	
	public SelectHotelPage getSelectHotelPage()
	{
		return(selecthotelpage==null)?selecthotelpage=new SelectHotelPage():selecthotelpage;
	}
	
	public BookHotelPage getBookHotelPage()
	{
		return(bookhotelpage==null)?bookhotelpage=new BookHotelPage():bookhotelpage;
	}
	
	
}
