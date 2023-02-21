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

public class AppiumBasics {
	
	@Test
	public void AppiumTest() throws MalformedURLException {
		
		File mainJS = new File("C:\\Users\\Akila\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
		
		AppiumServiceBuilder serviceBuilder = new AppiumServiceBuilder();
		serviceBuilder.withAppiumJS(mainJS);
		serviceBuilder.withIPAddress("127.0.0.1");
		serviceBuilder.usingPort(4723);
		
		AppiumDriverLocalService service = AppiumDriverLocalService.buildService(serviceBuilder);
		
		service.start();
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Pixel 4 API 30");
		options.setApp("F:\\Eclipse Workspace\\Appium\\src\\test\\java\\resources\\ApiDemos-debug.apk");
		
		
		URL server = new URL("http://127.0.0.1:4723");
		AndroidDriver driver = new AndroidDriver(server, options);
		
		WebElement preferenceMenu = driver.findElement(AppiumBy.accessibilityId("Preference"));
		preferenceMenu.click();
		
		
		
		driver.quit();
		service.stop();
	}

}
