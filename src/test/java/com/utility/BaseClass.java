package com.utility;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseClass {
public AppiumDriverLocalService service;
//public static ConfigDataProvider config;
	public  static AndroidDriver driver;
	public static TakesScreenshot ts;

	@BeforeClass
	//@Test
	public void setup () throws MalformedURLException {
		
		service = new AppiumServiceBuilder ().withAppiumJS(new File("C:\\Users\\USER\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				
				.withIPAddress("127.0.0.1").usingPort(4723).withTimeout(Duration.ofSeconds(300)).build();
			
			service.start();
		
				
     		UiAutomator2Options options = new UiAutomator2Options ();
			
			options.setDeviceName("Pixel_6a_API_28");
			
			options.setApp( System.getProperty("user.dir")+"\\src\\test\\resources\\apk\\app1.apk");
			
		     driver= new AndroidDriver(new URL("http://127.0.0.1:4723/"),options);
		String sessionId =driver.getSessionId().toString();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		     
		     
		DesiredCapabilities desiredCap =new DesiredCapabilities();
		desiredCap.setCapability("platformName", "Android");
		//desiredCap.setCapability("platformVersion", "(9.0");
		desiredCap.setCapability("deviceName", "any device name");
		desiredCap.setCapability("automationName", "UiAutomator2");
		//desiredCap.setCapability("appActivity", "");
		desiredCap.setCapability("avd", "Pixel_6a_API_28");
		desiredCap.setCapability("app", "/Users");
		
		//driver.quit();
		//service.stop();
	}
		@BeforeMethod
		public void takeScreenshot()
	{
		System.out.println("Starting the screenshot method!");
		ts= (TakesScreenshot) driver;
	}
		
	
	}
	
	

