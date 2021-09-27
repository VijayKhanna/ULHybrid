package com.urbanladder.reusablecomponents;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

@SuppressWarnings("unused")
public class Landing {

	public static WebDriver driver;
	public Landing(WebDriver driver) {
		this.driver=driver;
	}
	public static void Land(WebDriver driver) throws IOException {
		FileReader fr=new FileReader("C:\\Users\\mylaptop\\eclipse-workspace\\Mtree\\UrbanLadderHybrid\\ConfigFiles\\config.properties");
		Properties prop=new Properties();
		prop.load(fr);
		driver.get(BaseClass.prop.getProperty("baseURL"));
	}
}
