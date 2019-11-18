package com.qa.tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class VerticalScrolling {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		dc.setCapability(MobileCapabilityType.APP, "C:\\Software\\Android\\SDK\\apiDemos.apk");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url, dc);
		Thread.sleep(1000);

		// Vertical Scrolling
		driver.findElements(By.id("android:id/text1")).get(1).click();
		AndroidElement list = (AndroidElement) driver.findElement(By.id("android:id/text1"));

		MobileElement listitem = (MobileElement) driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Views\").instance(0))");

		System.out.println("x co ordinate: "+listitem.getLocation().getX());
		System.out.println("y co ordinate: "+listitem.getLocation().getY());
		listitem.click();

	}

}
