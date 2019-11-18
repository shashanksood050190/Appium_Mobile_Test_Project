package com.qa.tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class HandleSwitch {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		String val = "";
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		dc.setCapability("appPackage", "io.selendroid.testapp");
		dc.setCapability("appActivity", "io.selendroid.testapp.HomeScreenActivity");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url, dc);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='visibleButtonTestCD']")).click();
		val = driver.findElement(
				By.xpath("(//android.widget.LinearLayout[@content-desc='visibleTestAreaCD'])[1]/android.widget.TextView"))
				.getText();
		System.out.println("val is : " + val);

		driver.findElement(By.xpath("//android.widget.Button[@content-desc='visibleButtonTestCD']")).click();
		driver.findElement(By.id("io.selendroid.testapp:id/startUserRegistration")).click();
		driver.hideKeyboard();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Spinner")).click();
		driver.findElements(By.id("android:id/text1")).get(7).click();
		


	}

}
