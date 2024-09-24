package com.StriveMainPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GSaleInfo extends StriveBasePage{

	public GSaleInfo(WebDriver driver) {
		super(driver);
	}
	
	By closeOfEscrow1=By.xpath("//*[@id=\"property-form\"]/div/div[2]/div/div[1]/div[1]/label");
    By capRate1=By.xpath("//*[@id=\"property-form\"]/div/div[2]/div/div[1]/div[2]/div[2]/label");
    By history=By.xpath("//*[@id=\"property-form\"]/div/div[1]/div[1]/div[10]");
	
	
	public void is_Displayed_CloseOfEscrow() {
		WebElement closeOfEscrow=getElement(closeOfEscrow1);
		    closeOfEscrow.isDisplayed();
		    
}
	
	public void is_Displayed_capRate() {
		WebElement capRate=getElement(capRate1);
		capRate.isDisplayed();
		    
}
	
	public GHistory ClickOnHistoryTab() {
		WebElement historyTab=getElement(history);
		historyTab.click();
		return getInstance(GHistory.class);
		
	}
	
	
	
	
	

}
