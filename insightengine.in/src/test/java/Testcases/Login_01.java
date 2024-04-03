package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Baseclass.Basetest;

public class Login_01 extends Basetest{

	
	
	@Test(priority =1,enabled = true,retryAnalyzer = Retry.class)
	public void TC_Downloadreport_throughgmail() throws Exception{
		
	
		String br = driver.findElement(By.xpath("/html/body/main/nav[1]/div[2]/div[1]/ul")).getText();
		System.out.println(br);
		
	

		JavascriptExecutor js = (JavascriptExecutor)driver;
		
        //Locating element by link text and store in variable "Element"        		
        WebElement Element = driver.findElement(By.cssSelector(prop.getProperty("EmailtextFileds")));

        // Scrolling down the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Element);
		
		// enter the Email id.
		driver.findElement(By.cssSelector(prop.getProperty("EmailtextFileds"))).sendKeys(prop.getProperty("ValidEmail"));
		driver.findElement(By.cssSelector(prop.getProperty("EmailSubmit")));
		
		Thread.sleep(3000);
		
		//driver.findElement(By.linkText(prop.getProperty("AftersendingEmail"))).isDisplayed();
	
	}
	

	@Test(priority =2,enabled = true,retryAnalyzer = Retry.class)
	public void login2() {
		
		//String br = driver.findElement(By.xpath("/html/body/main/nav[1]/div[2]/div[1]/ul")).getText();
		
		 driver.findElement(By.linkText(prop.getProperty("Pricing"))).click();
		 
		 
	}
	
	
	@Test(priority =3,enabled = true,retryAnalyzer = Retry.class)
	public void TC_Getstarted() throws Exception
	{

		
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		WebElement Element = driver.findElement(By.xpath(prop.getProperty("Getstarted")));
//		js.executeScript("arguments[0].scrollIntoView();", Element);
		js.executeScript("window.scrollBy(250,350)");
		
		// insight Page click on Get started.
		driver.findElement(By.xpath(prop.getProperty("Getstarted"))).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(prop.getProperty("MainTitle"))).isDisplayed();
		
	}
	
	@Test(priority = 4,enabled = true,retryAnalyzer = Retry.class)
	public void Resources() throws Exception
	{
		// Switch to Resources page.
		driver.findElement(By.linkText(prop.getProperty("Resources"))).click();
	
		// Click on Download Report.
		driver.findElement(By.xpath(prop.getProperty("DownloadReport"))).click();
		
		
		
	}
	
	@Test(priority = 5,enabled = true,retryAnalyzer = Retry.class)
	public void Download_Reort() throws Exception 
	{
	 
		// Switch to Resources page.
		driver.findElement(By.linkText(prop.getProperty("Resources"))).click();

		// Click on Download Report.
		driver.findElement(By.xpath(prop.getProperty("DownloadReport"))).click();
			
		// Fill the all text Fields.
		driver.findElement(By.cssSelector(prop.getProperty("ReportName"))).sendKeys(prop.getProperty("ReportNameText"));
		driver.findElement(By.cssSelector(prop.getProperty("ReportEmail"))).sendKeys(prop.getProperty("ReportEmailtext"));
		driver.findElement(By.cssSelector(prop.getProperty("ReoprtDesignation"))).sendKeys(prop.getProperty("ReoprtDesignationtext"));
		driver.findElement(By.cssSelector(prop.getProperty("ReportCompany"))).sendKeys(prop.getProperty("ReportCompanytext"));
		
		// Click on Submit.
		driver.findElement(By.xpath(prop.getProperty("ReportDownloadReport"))).click();
		
		Thread.sleep(5000);
	}
	
	@Test(priority = 6,enabled = true,retryAnalyzer = Retry.class)
	public void Download_Report_Validationmsg() throws Exception
	{
	
		// Switch to Resources page.
		driver.findElement(By.linkText(prop.getProperty("Resources"))).click();

		// Click on Download Report.
		driver.findElement(By.xpath(prop.getProperty("DownloadReport"))).click();
		Thread.sleep(1000);
		
		// Click on Submit.
		driver.findElement(By.xpath(prop.getProperty("ReportDownloadReport1"))).click();
		// driver.findElement(By.linkText(prop.getProperty("DownloadReportButton"))).click();
		
		// Validation error messages are displayed.
		Thread.sleep(2000);
		Boolean Name =driver.findElement(By.xpath(prop.getProperty("NameValidtion1"))).isDisplayed();
		Boolean Email =driver.findElement(By.xpath(prop.getProperty("EmailValidtion1"))).isDisplayed();
		Boolean Designation =driver.findElement(By.xpath(prop.getProperty("DesignationValidation1"))).isDisplayed();
		Boolean Comapnyname =driver.findElement(By.xpath(prop.getProperty("CompanynameValidation1"))).isDisplayed();
		
		
	}

}
