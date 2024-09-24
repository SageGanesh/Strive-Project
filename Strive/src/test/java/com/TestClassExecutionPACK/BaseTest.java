package com.TestClassExecutionPACK;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import com.StriveMainPages.StriveBasePage;
import com.StriveMainPages.StrivePages;
import com.StriveMainPages.StriveUtility;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	  WebDriver driver;
	public StrivePages page;
	StriveUtility util;
	
	 
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		 ChromeOptions options = new ChromeOptions();
		  driver = new ChromeDriver(options);
		  driver.manage().window().maximize();
		  driver.get("https://app-test.strivere.com");
		  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   page=new StriveBasePage(driver);
		   util=new StriveUtility(driver);
		   
		  }
	
	@AfterMethod
	public void teardown(ITestResult result) throws Exception {
		
		if (ITestResult.FAILURE == result.getStatus()) {
			  
		    try {
		     util=new StriveUtility(driver);
		     util.ScreenShot("filename");
		     Thread.sleep(2000);
		     System.out.println("Screenshot taken");
		     } catch (Exception e) {
	         System.out.println("Exception while taking screenshot " + e.getMessage());
		    }
		  }
		
		if(driver!=null) {
			Thread.sleep(5000);
			driver.quit();
		}
		
	}
	
	
}
