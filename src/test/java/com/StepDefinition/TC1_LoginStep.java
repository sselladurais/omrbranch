package com.StepDefinition;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;

import com.omrbranch.ProjectManager.PageObjectManager;
import com.omrbranch.base.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_LoginStep extends BaseClass{

	PageObjectManager pom=new PageObjectManager();
	
	@Given("User is in OmrBranch hotel page")
	public void user_is_in_omr_branch_hotel_page() throws FileNotFoundException, IOException {
		 
	}
	@When("User enter {string} and {string}")
	public void user_enter_and(String username, String password) {
	   pom.getLoginPage().login(username, password);
	}
	
	@Then("User should verify after login success message {string}")
	public void user_should_verify_after_login_success_message(String exploginSuccessMsgText) {
		String actloginSuccessMsgText = pom.getSearchHotelPage().getLoginSuccessMsgText();
	    Assert.assertEquals("verify after login success msg", actloginSuccessMsgText, exploginSuccessMsgText);
	}

	@When("User enter {string} and {string} with enter key")
	public void user_enter_and_npt_ineyveli_with_enter_key(String name, String password) throws AWTException {
	    pom.getLoginPage().loginenterkey(name, password);
	}

	@Then("User should verify error message after click login button {string}")
	public void user_should_verify_error_message_after_click_login_button(String exploginErrorMsgText) {
	    String actloginErrorMsgText = pom.getLoginPage().getLoginErrorMsgText();
	    boolean b = actloginErrorMsgText.contains(exploginErrorMsgText);
	    Assert.assertTrue("verify after login error msg",b);
	}





}
