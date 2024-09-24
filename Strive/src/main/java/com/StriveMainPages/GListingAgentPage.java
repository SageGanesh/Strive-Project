package com.StriveMainPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GListingAgentPage extends StriveBasePage {

	public GListingAgentPage(WebDriver driver) {
		super(driver);
	}

	By listingAgent1=By.xpath("//*[@id=\"property-form\"]/div/div[2]/div/div/div[1]/div[1]/label");
	By listingAgent2=By.xpath("//*[@id=\"property-form\"]/div/div[2]/div/div/div[2]/div[1]/label");
	By listingAgent3=By.xpath("//*[@id=\"property-form\"]/div/div[2]/div/div/div[3]/div[1]/label");
	
	By proposalLink1=By.xpath("//*[@id=\"property-form\"]/div/div[1]/div[1]/div[3]");
	
public String  get_ListingAgent1() {
	 return getElement(listingAgent1).getText();
	}
	
public String  get_ListingAgent2() {
	 return getElement(listingAgent2).getText();
	}
	
public String  get_ListingAgent3() {
	 return getElement(listingAgent3).getText();
}
	
	public GProposalTab ClickOnProposalTab() {
		
		WebElement proposalLink= getElement(proposalLink1);
		proposalLink.click();
		return getInstance(GProposalTab.class);
	}
	
	
	
}
