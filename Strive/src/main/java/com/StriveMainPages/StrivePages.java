package com.StriveMainPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class StrivePages {

	WebDriver driver;
	WebDriverWait wait;
	
	
	public StrivePages(WebDriver driver) {
		this.driver=driver;//local variable=global variable
		this.wait=new WebDriverWait(this.driver,Duration.ofSeconds(15));
		
}
	
	
	//abstract methods
	public abstract String getpageTitle();
	
	public abstract  String getPageHeader(By Locator);
	
	public abstract WebElement getElement(By Locator);
	
	public abstract void waitForElementPresent(By Locator);
	
	public abstract void waitForPageTitle(String title);
	
	public <TStrivePages extends StriveBasePage> TStrivePages   getInstance(Class<TStrivePages>  StrivePagesClass)
	{
		try {
		return StrivePagesClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		return null;
	}
	

	}
	


