package akila.Appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {
	
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	public URL server;
	public UiAutomator2Options options;
	
	@BeforeClass
	public void ConfigureAppium() throws MalformedURLException {
		File mainJS = new File("C:\\Users\\Akila\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
		
		AppiumServiceBuilder serviceBuilder = new AppiumServiceBuilder();
		serviceBuilder.withAppiumJS(mainJS);
		serviceBuilder.withIPAddress("127.0.0.1");
		serviceBuilder.usingPort(4723);
		
		service = AppiumDriverLocalService.buildService(serviceBuilder);
		
		service.start();
		
		options = new UiAutomator2Options();
		options.setDeviceName("Pixel 4 API 30");
		options.setApp("F:\\Eclipse Workspace\\Appium\\src\\test\\java\\resources\\ApiDemos-debug.apk");
		
		
		server = new URL("http://127.0.0.1:4723");
		driver = new AndroidDriver(server, options);

	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
		service.stop();
	}

}
