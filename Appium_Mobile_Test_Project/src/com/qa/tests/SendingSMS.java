package com.qa.tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SendingSMS {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		dc.setCapability("appPackage", "com.android.mms");
		dc.setCapability("appActivity", "com.android.mms.ui.ComposeMessageActivity");
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url, dc);
		Thread.sleep(5000);
	    driver.findElement(By.id("com.android.mms:id/recipients_editor")).sendKeys("9876543210");
	    driver.findElement(By.id("com.android.mms:id/embedded_text_editor")).sendKeys("Hi.. Welcome!!");
	    driver.findElement(By.id("com.android.mms:id/send_button_sms")).click();
	    Thread.sleep(5000);
	    driver.quit();
	    

	}

}
