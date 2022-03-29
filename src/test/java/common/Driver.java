package common;

import org.openqa.selenium.WebDriver;

public class Driver {

	//This is chrome driver location
	public static final String DRIVER_LOCATION = "C:\\chromedriver.exe";
	
	//This is chrome driver name
	public static final String DRIVER_NAME = "webdriver.chrome.driver";
	
	//This is setter method for set driver
	private static WebDriver driver;
	public static void setDriver (WebDriver webDriver) {
		if(driver == null) {
			driver = webDriver;
		}
	}
	
	//This is a getter method for get the driver
	public static WebDriver getDriver() {
		if(driver == null) {
			throw new AssertionError("Driver is null. Initialize driver before calling this method");
		}
		return driver;
	}
	
	
}
