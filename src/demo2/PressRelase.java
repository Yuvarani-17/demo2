package demo2;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.MobileBy.ByAndroidUIAutomator;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;
public class PressRelase extends day1 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		AndroidDriver driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
		
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"Jordan 6 Rings\").instance(0))"));
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"TextClock\")");
		
		
    	driver.findElement(By.xpath("//*[@text='Date Widgets']")).click();
		driver.findElement(By.xpath("//*[@text='2. Inline']")).click();
		driver.findElement(By.xpath("//*[@content-desc='9']")).click();
		
		AndroidElement first= (AndroidElement) driver.findElement(By.xpath("//*[@content-desc='15']"));
		AndroidElement second= (AndroidElement) driver.findElement(By.xpath("//*[@content-desc='45']"));
		
    	AndroidTouchAction tap = new AndroidTouchAction(driver);
		tap.longPress(LongPressOptions.longPressOptions().withElement(element(first)).withDuration(ofSeconds(2))).moveTo(element(second)).release().perform();
		//tap.longPress(first).release(second).perform();
	
		//driver.findElement(By.xpath("//*[@text='Date Widgets'"));
		

	}

}
