package com.StriveMainPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GWebSite extends StriveBasePage{

	public GWebSite(WebDriver driver) {
		super(driver);
	}

By marketingPackage1=By.xpath("//*[@id=\"property-form\"]/div/div[2]/div/div[2]/div[1]/label");
By photo1=By.xpath("//*[@id=\"property-form\"]/div/div[2]/div/div[3]/div/label");
By backButton=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[2]/div[1]/div/div[1]");
	
	public void is_DisplayedmarketingPackage() {
		WebElement marketingPackage=getElement(marketingPackage1);
		marketingPackage.isDisplayed();
		
}
	
	public void clickOnphotoLink() {
		WebElement photo=  getElement(photo1);
		photo.isDisplayed();
     
}
	
	public StrivePropertiesPage clickOnNavigationBackbutton() {
	    WebElement backNavigationButton=getElement(backButton);
		backNavigationButton.click();
		return getInstance(StrivePropertiesPage.class);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
