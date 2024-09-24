package com.StriveMainPages;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class StriveBasePage extends StrivePages {

	public StriveBasePage(WebDriver driver) {
		super(driver);
	}

	@Override
	public String getpageTitle() {
		// getting the title of the page
		return driver.getTitle();
	}

	@Override
	public String getPageHeader(By Locator) {
		return getElement(Locator).getText();
		// getting page header
	}

	@Override
	public WebElement getElement(By Locator) {
	WebElement ele=null;
		// This concept is called exception handling in the framework
		try {
	    	// interacting with the element
			ele=driver.findElement(Locator);
			return ele;
			
	   }
	    catch(StaleElementReferenceException e){
	    	
	    	// retry to interact with the element
	    	ele=driver.findElement(Locator);
	    	//WebElement ele = driver.findElement(By.id("elementId"));
	    }
			JavascriptExecutor js = (JavascriptExecutor) driver;
			String attributeValue = (String) js.executeScript("return arguments[0].getAttribute('attributeName');", ele);
			System.out.println("the attribute value is " + attributeValue);
			
			return ele;
		
	}

	@Override
	public void waitForElementPresent(By Locator) {
		
		try {
		wait.until(ExpectedConditions.presenceOfElementLocated(Locator));
		}catch(Exception e) {
			System.out.println("some error occurred while for the waiting for the element " + Locator.toString());
			
		}
	}

	@Override
	public void waitForPageTitle(String title) {
	
		try {
			wait.until(ExpectedConditions.titleContains(title));
			}catch(Exception e) {
				System.out.println("some error occurred while for the waiting for the element " + title);
				
			}
		
	}
	
	
	}
	
