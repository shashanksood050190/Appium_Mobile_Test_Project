package com.qa.tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class CheckBoxRadioButtonTextBox {

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

		driver.findElements(By.id("android:id/text1")).get(1).click();
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Views\").instance(0))")
				.click();

		driver.findElements(By.id("android:id/text1")).get(4).click();
		driver.findElements(By.id("android:id/text1")).get(1).click();
		// driver.findElementByAccessibilityId("02. Dark Theme").click();

		// textbox
		driver.findElement(By.id("com.touchboarder.android.api.demos:id/edit")).sendKeys("Hi.. Welcome");
		driver.hideKeyboard();
		// checkbox
		driver.findElement(By.id("com.touchboarder.android.api.demos:id/check1")).click();
		// radio button
		driver.findElement(By.id("com.touchboarder.android.api.demos:id/radio1")).click();

	}

}
