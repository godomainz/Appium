package akila.Appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumBasics extends BaseTest {
	
	@Test
	public void WifiSettingsName() throws MalformedURLException {
		
		driver = new AndroidDriver(server, options);
		
		WebElement preferenceMenu = driver.findElement(AppiumBy.accessibilityId("Preference"));
		preferenceMenu.click();

	}

}
