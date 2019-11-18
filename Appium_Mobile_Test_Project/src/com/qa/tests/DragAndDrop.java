package com.qa.tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		dc.setCapability(MobileCapabilityType.APP, "C:\\Software\\Android\\SDK\\dragAndDrop.apk");
//		dc.setCapability("appPackage", "com.mobeta.android.demodslv");
//		dc.setCapability("appActivity", "com.mobeta.android.demodslv.BGHandle");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url, dc);
		Thread.sleep(5000);
		
		//Navigation
		
				driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.TextView[1]")).click();		

				WebElement source=driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle")).get(2);
				WebElement target=driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle")).get(5);
				TouchAction action=new TouchAction((MobileDriver)driver);
				action.longPress(ElementOption.element(source)).moveTo(ElementOption.element(target)).release().perform();
				
	}

}
