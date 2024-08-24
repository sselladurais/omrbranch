package com.omrbranch.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.omrbranchreports.genarateJvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags ="@select",dryRun =false,features="src\\test\\resources\\features\\",glue ="com.StepDefinition",plugin = "json:target/login.json")
public class TestRunnerClass {
		
	
	@AfterClass
	public static void jvmReport()
	{
		genarateJvmReport.genarateJvm("C:\\Users\\User\\eclipse-workspace\\OmrBranchHotelBookingAutomation\\target\\login.json");
	}

}

