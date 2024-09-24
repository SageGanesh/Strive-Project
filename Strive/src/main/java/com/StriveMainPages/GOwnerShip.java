package com.StriveMainPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GOwnerShip extends StriveBasePage{

	public GOwnerShip(WebDriver driver) {
		super(driver);
	}
	
	By sellertab=By.xpath("//*[@id=\"property-form\"]/div/div[2]/div/div/div/div/div/label");
	
	
	By ClickingOnInNegotiationUnderContractLink=By.xpath("//*[@id=\"property-form\"]/div/div[1]/div[1]/div[7]");
	
	
	public void isdisplayed_Sellertab() {
		WebElement seller=getElement(sellertab);
		seller.isDisplayed();
		
	}
	
	public GInNegUnderContract clickOnInNegotiationUnderContractLink() {
		
		            WebElement ClickOnInNegotiationUnderContractLink=  getElement(ClickingOnInNegotiationUnderContractLink);
		            ClickOnInNegotiationUnderContractLink.click();
		             return getInstance(GInNegUnderContract.class);
		            
	}
	
	
	

}
