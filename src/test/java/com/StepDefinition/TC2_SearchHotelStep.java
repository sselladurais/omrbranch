package com.StepDefinition;

import java.awt.AWTException;

import org.testng.Assert;

import com.omrbranch.ProjectManager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC2_SearchHotelStep {

	PageObjectManager pom=new PageObjectManager();
	@When("User search by entering all the fields {string},{string},{string},{string},{string},{string},{string},and {string}")
	public void user_search_by_entering_all_the_fields_and(String state, String city, String roomType, String checkIn , String checkOut, String noRooms, String noAdult, String noChild) throws AWTException {
	   pom.getSearchHotelPage().searchHotels(state, city, roomType, checkIn, checkOut, noRooms, noAdult, noChild);
	}
	
	

	@When("User search by entering fields {string},{string},{string},{string},{string},and {string}")
	public void user_search_by_entering_fields_and(String state, String city, String checkIn, String checkOut, String noRooms, String noAdult) throws AWTException {
	    pom.getSearchHotelPage().hotelMandatoryFields(state, city, checkIn, checkOut, noRooms, noAdult);
	}
	

	@When("User search by entering all the fields roomtype {string},{string},{string},{string},{string},{string},{string},and {string}")
	public void user_search_by_entering_all_the_fields_roomtype_and(String state, String city, String roomType, String checkIn, String checkOut, String noRooms, String noAdult, String noChild) throws AWTException, InterruptedException {
	   pom.getSearchHotelPage().hotelAllRoom(state, city, roomType, checkIn, checkOut, noRooms, noAdult, noChild);
	}





	@Then("User should verify after selecting all roomtype success message {string}")
	public void user_should_verify_after_selecting_all_roomtype_success_message(String expallRoomTypeSuccessMsg) {
	      String actallRoomTypeSuccessMsg = pom.getSelectHotelPage().getAllRoomTypeSuccessMsg();
	      //System.out.println(actallRoomTypeSuccessMsg);
	      Assert.assertEquals(actallRoomTypeSuccessMsg, expallRoomTypeSuccessMsg,"verify the all room type successfully");
	}




	@Then("User should verify after select hotel success message {string}")
	public void user_should_verify_after_select_hotel_success_message(String expselectHotelSuccessMsg) {
		  String actselectHotelSuccessMsg = pom.getSelectHotelPage().getSearchHotelSuccessMsg();
		  System.out.println(actselectHotelSuccessMsg);
	       Assert.assertEquals(actselectHotelSuccessMsg,expselectHotelSuccessMsg,"verify the select hotel successfully");
	}

	@When("User without entering any fields")
	public void user_without_entering_any_fields() {
	   pom.getSearchHotelPage().clickSearchButton();
	}
	@Then("User should verify without fields success message {string}")
	public void user_should_verify_without_fields_success_message(String expexploreMsg) {
	    String actexploreMsg = pom.getSearchHotelPage().getExploreMsg();
	    Assert.assertEquals(actexploreMsg, expexploreMsg,"verify the explore message successfully");
	}
	@Then("User should verify error message {string},{string},{string},{string},{string} and {string}")
	public void user_should_verify_error_message_please_select_no_of_rooms_and_please_select_no_of_adults(String expstateErrorMsg, String expcityErrorMsg, String expdateInErrorMsg, String expdateOutErrorMsg,String exproomErrorMsg,String expadultErrorMsg) {
	    String actstateErrorMsg = pom.getSearchHotelPage().getStateErrorMsg();
	    String actcityErrorMsg = pom.getSearchHotelPage().getCityErrorMsg();
	    String actdateInErrorMsg = pom.getSearchHotelPage().getDateInErrorMsg();
	    String actdateOutErrorMsg = pom.getSearchHotelPage().getDateOutErrorMsg();
	    String actroomErrorMsg = pom.getSearchHotelPage().getRoomErrorMsg();
	    String actadultErrorMsg = pom.getSearchHotelPage().getAdultErrorMsg();
        Assert.assertEquals(actstateErrorMsg, actstateErrorMsg,"verify the state error message successfully"); 
        Assert.assertEquals(actcityErrorMsg, expcityErrorMsg,"verify the city error message successfully");
        Assert.assertEquals(actdateInErrorMsg, expdateInErrorMsg,"verify the dateIn error message successfully");
        Assert.assertEquals(actdateOutErrorMsg, expdateOutErrorMsg,"verify the dateOut error message successfully");
        Assert.assertEquals(actroomErrorMsg, exproomErrorMsg,"verify the Room error message successfully");
        Assert.assertEquals(actadultErrorMsg, expadultErrorMsg,"verify the Adult error message successfully");
	}









}
