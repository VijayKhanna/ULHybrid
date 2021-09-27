package com.urbanladder.reusablecomponents;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

@SuppressWarnings("unused")
public class ImplicitWait {

	public static void Wait(WebDriver driver) throws IOException{
		int wait=Integer.parseInt(BaseClass.prop.getProperty("waits"));
		driver.manage().timeouts().implicitlyWait(wait, TimeUnit.SECONDS);
	}
}
