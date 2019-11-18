package com.qa.tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DialANumber {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		dc.setCapability("appPackage", "com.android.dialer");
		dc.setCapability("appActivity", "com.android.dialer.DialtactsActivity");
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url, dc);
		Thread.sleep(5000);
		driver.findElement(By.id("com.android.dialer:id/floating_action_button")).click();
		//dial 9876543210
		driver.findElement(By.id("com.android.dialer:id/nine")).click();
		driver.findElement(By.id("com.android.dialer:id/nine")).click();
		driver.findElement(By.id("com.android.dialer:id/one")).click();
		driver.findElement(By.id("com.android.dialer:id/zero")).click();
		driver.findElement(By.id("com.android.dialer:id/zero")).click();
		driver.findElement(By.id("com.android.dialer:id/six")).click();
		driver.findElement(By.id("com.android.dialer:id/three")).click();
		driver.findElement(By.id("com.android.dialer:id/four")).click();
		driver.findElement(By.id("com.android.dialer:id/three")).click();
		driver.findElement(By.id("com.android.dialer:id/four")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("com.android.dialer:id/dialpad_floating_action_button")).click();
		Thread.sleep(5000);
		driver.quit();

	}

}
