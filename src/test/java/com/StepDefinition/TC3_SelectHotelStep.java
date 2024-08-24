package com.StepDefinition;

import java.awt.AWTException;

import org.testng.Assert;

import com.omrbranch.ProjectManager.PageObjectManager;
import com.omrbranch.base.BaseClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC3_SelectHotelStep extends BaseClass{

	

           PageObjectManager pom=new PageObjectManager();
           
	@Then("User should verify hotel names after selected roomType if hotel names ended with selected {string} successfully")
	public void user_should_verify_hotel_names_after_selected_room_type_if_hotel_names_ended_with_selected_successfully(String roomType) {
	        boolean hotelEnd = pom.getSelectHotelPage().getHotelEnd(roomType);
	       Assert.assertEquals(hotelEnd, roomType,"verify all rooom type");
	}

	@When("User click the name ascending button")
	public void user_click_the_name_ascending_button() throws AWTException, InterruptedException {
	       pom.getSelectHotelPage().getHotelPrintedAscOrder();
	}
	@Then("User should verify hotel names after click the name ascending button if it has sorted in ascending order successfully")
	public void user_should_verify_hotel_names_after_click_the_name_ascending_button_if_it_has_sorted_in_ascending_order_successfully() throws InterruptedException {
	      pom.getSelectHotelPage().getHotelAscOrder();
	}
	
	@When("User click the price high-low option button")
	public void user_click_the_price_high_low_option_button() {
	     pom.getSelectHotelPage().getHotelPriceHighToLow();
	}
	@Then("User should verify hotel price after click the price high-low option button if it is sorted in descending order successfully")
	public void user_should_verify_hotel_price_after_click_the_price_high_low_option_button_if_it_is_sorted_in_descending_order_successfully() {
	    pom.getSelectHotelPage().getHotelPriceDescOrder();
	}

	@When("User select the first hotel name and save the hotel name and hotel price")
	public void user_select_the_first_hotel_name_and_save_the_hotel_name_and_hotel_price() {
	    pom.getSelectHotelPage().getFirstHotelNameAndPrice();
	}
	@When("User accpet the alert to select hotel")
	public void user_accpet_the_alert_to_select_hotel() {
	    pom.getSelectHotelPage().getAlertAccept();
	}
	@Then("User should verify {string} success message after navigate to Book hotel")
	public void user_should_verify_success_message_after_navigate_to_book_hotel(String expbookHotelSuccessMsg) {
       String actbookHotelSuccessMsg = pom.getBookHotelPage().getBookHotelSuccessMsg();
	    Assert.assertEquals(actbookHotelSuccessMsg, expbookHotelSuccessMsg,"verify the book hotel success message");
	}
	
	@When("User cancel the alert to select hotel")
	public void user_cancel_the_alert_to_select_hotel() {
	    pom.getSelectHotelPage().getAlertDismiss();
	}


}
