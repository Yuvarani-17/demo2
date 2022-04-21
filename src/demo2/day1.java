package demo2;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;

import io.appium.java_client.remote.MobileCapabilityType;
public class day1 {

	public static AndroidDriver capabilities() throws MalformedURLException
	{
	// TODO Auto-generated method stub

		
		File appDir = new File("src");
		File app = new File(appDir, "ApiDemos-debug.apk");
		DesiredCapabilities cap= new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "yuvaemulator");
		//cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 14);
		
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");//new step
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);	
		
		//AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		 //driver.findElement(MobileBy.AndroidUIAutomator("android:id/text1")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	
	}

}
