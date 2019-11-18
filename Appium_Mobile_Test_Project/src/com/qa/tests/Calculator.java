package com.qa.tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Calculator {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		dc.setCapability("appPackage", "com.android.calculator2");
		dc.setCapability("appActivity", "com.android.calculator2.Calculator");
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url, dc);
		Thread.sleep(5000);
		WebElement seven=driver.findElement(By.id("com.android.calculator2:id/digit_7"));
		seven.click();
		WebElement plus=driver.findElement(By.id("com.android.calculator2:id/op_add"));
		plus.click();
		WebElement three=driver.findElement(By.id("com.android.calculator2:id/digit_3"));
		three.click();
		WebElement equal=driver.findElement(By.id("com.android.calculator2:id/eq"));
		equal.click();
		Thread.sleep(3000);
		WebElement result=driver.findElement(By.id("com.android.calculator2:id/formula"));
		String results=result.getText();
		if(results.equals("10"))
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case failed");
		}
		Thread.sleep(5000);
	}

}
