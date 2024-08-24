package com.StepDefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.omrbranch.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksClass extends BaseClass{
	 
	@Before
	public void beforeScenario() throws FileNotFoundException, IOException
	{
		 getDriver(getPropertyFileValue("browser")); 
		 enterApplnUrl(getPropertyFileValue("url"));
		 maximizeWindow();
		 implictWait();
	}
	
	@After
	public void afterScenario(Scenario scenario)
	{
	    byte[] screenShot = ScreenShot();
	    scenario.attach(screenShot, "images/png", "EveryScenario");
	   // currentWindow();
	}

}
