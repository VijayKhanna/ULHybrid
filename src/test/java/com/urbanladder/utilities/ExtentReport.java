package com.urbanladder.utilities;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {


	 ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/reports/LandingPage.html"));
	 
	 ExtentReports extent =new ExtentReports();
}
