package com.StriveMainPages;

import org.checkerframework.checker.units.qual.g;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GHistory extends StriveBasePage{

	public GHistory(WebDriver driver) {
		super(driver);
	}
	
	

	By NoResultsTab=By.xpath("//*[@id=\"property-form\"]/div/div[2]/div/div[2]");
	
	By WebSite=By.xpath("//*[@id=\"property-form\"]/div/div[1]/div[1]/div[11]");
			
public void is_displayed_NoResults() {
	WebElement noresults=getElement(NoResultsTab);
	noresults.isDisplayed();
	
}
	
public GWebSite ClickOnWebSite1() {
	WebElement WebSite1=getElement(WebSite);
	WebSite1.click();
	return  getInstance(GWebSite.class);
	
}
	
	
	
	
	
	
	
	

}
