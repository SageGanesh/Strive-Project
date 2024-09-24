package com.StriveMainPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GaneshPropertyPageInSide extends StriveBasePage {

	public GaneshPropertyPageInSide(WebDriver driver) {
		super(driver);
	}

	
	
	By headerOfGaneshpropertypageinside=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div[1]");
	By  ListingAgent=By.xpath("//*[@id=\"property-form\"]/div/div[1]/div[1]/div[2]");
	
	 
	public WebElement getGaneshPropertyPageInSideHeaderElement() {
		return getElement(headerOfGaneshpropertypageinside);
		}
	
	public String getGaneshPropertyPageInSideHeader() {
		return getPageHeader(headerOfGaneshpropertypageinside);
		}
	
	
	public GListingAgentPage clickOnListingAgentlink() {
		WebElement listingAgentlink=getElement(ListingAgent);
		listingAgentlink.click();
		return getInstance(GListingAgentPage.class);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
