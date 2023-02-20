package akila.Appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppiumBasics {
	
	@Test
	public void AppiumTest() throws MalformedURLException {
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Pixel 4 API 30");
		options.setApp("F:\\Eclipse Workspace\\Appium\\src\\test\\java\\resources\\ApiDemos-debug.apk");
		
		
		URL server = new URL("http://127.0.0.1:4723");
		AndroidDriver driver = new AndroidDriver(server, options);
		driver.quit();
	}

}
