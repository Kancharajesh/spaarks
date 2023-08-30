/*package Selenium.seb;
	
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.*;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

	public class test01 {



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
		        //wait= new WebDriverWait(driver,25);
		    }
		    @Test 
		    public void createaccount() throws InterruptedException      {
		    	
		    	Thread.sleep(9800);
		    	driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Profile\"]/android.widget.FrameLayout/android.widget.ImageView\r\n"
		    			+ "")).click();
		    	
		    	Thread.sleep(5000);
		    	
		    	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText\r\n"
		    			+ "")).sendKeys("9988221143");
		    	
		    	
		    	Thread.sleep(5000);
		    	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView\r\n"
		    			+ "")).click();
		    	
		    	Thread.sleep(5000);
		    	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.EditText\r\n"
		    			+ "")).sendKeys("123456");
		    	
		    	Thread.sleep(5000);
		    	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TextView\r\n"
		    			+ "")).click();
	
		    	Thread.sleep(9800);
		    	
		    	System.out.println("test01.createaccount()");
		    	
		    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[2]\r\n"
		    		+ "")).isDisplayed();
		    
		    Thread.sleep(9800);
		    }
		    
		    
		    @AfterTest
		    public void Close()
		    {
		        driver.quit();
		    }
		}*/




	    

