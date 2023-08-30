package Selenium.seb;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;

public class business_profile {
	
	 String appiumUrl="http://127.0.0.1:4723/wd/hub";
	    WebDriver driver;
	    WebDriverWait wait;
	    @BeforeTest
	    public void setup() throws MalformedURLException {
	        DesiredCapabilities capabilities=new DesiredCapabilities();
	        capabilities.setCapability("automationName","UiAutomator2");
	        capabilities.setCapability("platformName","android");
	        capabilities.setCapability("deviceName","962959539700161");
	        capabilities.setCapability("appPackage","com.osos.spaarksapp");
	        capabilities.setCapability("appActivity","com.osos.spaarksapp.MainActivity");
	        capabilities.setCapability("noReset",true);
	        URL url=new URL(appiumUrl);
	        
	        driver=new AndroidDriver(url,capabilities);
	
	
	
	    }
	    

}
