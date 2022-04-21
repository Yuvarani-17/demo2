package demo2;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class generalstore {

	public static AndroidDriver capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub

		DesiredCapabilities cap= new DesiredCapabilities();

		File appDir = new File("src");

		File app = new File(appDir, "General-Store.apk");


		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "yuvaemulator");

		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");//new step

		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	
	return driver;
		
	}

}
