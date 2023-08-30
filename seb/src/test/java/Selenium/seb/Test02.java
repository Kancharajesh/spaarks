package Selenium.seb;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.aspectj.lang.annotation.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Test02 {

	
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
	    
	    @Test
	    public void loginmodule() throws InterruptedException
	    {
	    
	    	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.Button[1]\r\n"
	    			+ "")).click();
	    	Thread.sleep(3500);
	    	
	    	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText\r\n"
	    			+ "")).sendKeys("6281669895");

	    	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView\r\n"
	    			+ "")).click();
	    	
	    	Thread.sleep(5000); 

	    	//otp box
	    	
	    	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText[1]\r\n"
	    			+ ""));
	    	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText[2]\r\n"
	    			+ ""));
	    	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText[3]\r\n"
	    			+ ""));
	    	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText[4]\r\n"
	    			+ ""));
	    	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText[5]\r\n"
	    			+ ""));
	    	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText[6]\r\n"
	    			+ ""));
	    	
	    	
	    	Thread.sleep(9000);

	    	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TextView\r\n"
	    			+ "")).click();
	    	
	   	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[2]\r\n"
	    			+ "")).getText();
	 
	 
	   	boolean Display= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[1]\r\n"
	   			+ "")).isDisplayed();
	    	
	   	System.out.println("Element displayed is :"+Display);
	    	
	 Thread.sleep(9000);
	    	
	    }
 	    
	    @AfterTest
	    
	    public void close()
	    {
	    	driver.quit();
	    	
	    }
}
