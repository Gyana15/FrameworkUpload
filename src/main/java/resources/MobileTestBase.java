package resources;

import java.io.IOException;

import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class MobileTestBase {
	

	public static AndroidDriver driver;
	
	@BeforeSuite
	public void setUp() throws IOException, InterruptedException{
		
		if(driver==null){
	
		AppiumServer.stop();
		AppiumServer.start();
		CommonUtils.loadConfigProp("app.properties");
		CommonUtils.setCapabilities();
		driver = CommonUtils.getDriver();
		}
		
	}
	
	@AfterSuite
	public void tearDown() throws IOException{
		
		driver.quit();
		AppiumServer.stop();
		
	}

}
