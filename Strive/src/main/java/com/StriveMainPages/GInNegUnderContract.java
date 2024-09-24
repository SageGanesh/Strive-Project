package com.StriveMainPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GInNegUnderContract extends StriveBasePage{

	public GInNegUnderContract(WebDriver driver) {
		super(driver);
	}

	By Contractlink=By.xpath("//*[@id=\"property-form\"]/div/div[2]/div/div[3]/div/label");
	
	By BuySideLink=By.xpath("//*[@id=\"property-form\"]/div/div[1]/div[1]/div[8]");
	
	public void is_DisplayedContract() {
		WebElement Contract=getElement(Contractlink);
		Contract.isDisplayed();
		
}
	
	public GBuySide clickOnBuySideLink() {
		WebElement ClickOnBuySideLink=  getElement(BuySideLink);
		ClickOnBuySideLink.click();
         return getInstance(GBuySide.class);
        
}
	
	
	
	
	
	
	
}
