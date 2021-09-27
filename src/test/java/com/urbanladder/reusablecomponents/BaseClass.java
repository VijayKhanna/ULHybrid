package com.urbanladder.reusablecomponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.urbanladder.utilities.BrowserClass;

import io.github.bonigarcia.wdm.WebDriverManager;

@SuppressWarnings("unused")
public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;
	public static Logger log;
	public static ExtentReports report;
	public static ExtentTest rep;
	
	@BeforeSuite
	public static void setUpSuite() throws FileNotFoundException {
		ExtentHtmlReporter  extent= new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/reports/ULreport.html"));
		report = new ExtentReports();
		report.attachReporter(extent);
		File logfr= new File("C:\\Users\\mylaptop\\eclipse-workspace\\Mtree\\UrbanLadderHybrid\\ConfigFiles\\log4j.properties");
		FileInputStream fislog=new FileInputStream(logfr);
		log=Logger.getLogger("Urban Ladder Hybrid: ");
		PropertyConfigurator.configure(fislog);
	}
	@BeforeClass
	public WebDriver startApp() throws IOException {
		FileReader fr=new FileReader("C:\\Users\\mylaptop\\eclipse-workspace\\Mtree\\UrbanLadderHybrid\\ConfigFiles\\config.properties");
		Properties prop=new Properties();
		prop.load(fr);
		driver =BrowserClass.initialize(driver,prop.getProperty("browserName"),prop.getProperty("baseURL"));
		//driver=BrowserClass.initialize(driver,"chrome","https://www.urbanladder.com");
		//ImplicitWait.Wait(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	@AfterClass
	public void teardown() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.quit();
		driver=null;
	}
	public void getScreenshots(String result) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(".\\screenshots\\"+result+"screenshot.png"));
	}
	@AfterSuite
	public void atLast() {
		report.flush();
	}
}
