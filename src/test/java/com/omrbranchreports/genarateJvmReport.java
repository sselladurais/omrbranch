package com.omrbranchreports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class genarateJvmReport {
	
	
	public static void genarateJvm(String jsonpath) {
		File file =new File("C:\\Users\\User\\eclipse-workspace\\OmrBranchHotelBookingAutomation\\target");
		Configuration configuration=new Configuration(file,"PROJECT NAME");
		configuration.addClassifications("browser", "CHRME");
		configuration.addClassifications("NAME", "DURAI");
		List<String> jsonfile=new ArrayList<>();
		jsonfile.add(jsonpath);
		ReportBuilder builder =new ReportBuilder(jsonfile, configuration);
		builder.generateReports();
	}

}
