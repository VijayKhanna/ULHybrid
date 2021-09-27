package com.urbanladder.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserClass {

	WebDriver driver;
	public static WebDriver initialize(WebDriver driver,String browserName, String baseURL) {
		if(browserName.equals("chrome")) {
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\mylaptop\\eclipse-workspace\\Milestone3\\Milestone3\\drivers\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else {
			System.out.println("We don't support this browser "+browserName);
		}
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		return driver;
	}
}
