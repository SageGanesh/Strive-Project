package com.StriveMainPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GBuySide extends StriveBasePage{

	public GBuySide(WebDriver driver) {
		super(driver);
	}
	
	
By Buyer=By.xpath("//*[@id=\"property-form\"]/div/div[2]/div/div/div[1]/div/label");
By BuyerAgent1=By.xpath("//*[@id=\"property-form\"]/div/div[2]/div/div/div[2]/div[1]/label");
By BuyerAgent3=By.xpath("//*[@id=\"property-form\"]/div/div[2]/div/div/div[4]/div[1]/label");
By OutsideAgent=By.xpath("//*[@id=\"property-form\"]/div/div[2]/div/div/div[5]/div[1]/label");
By AgentFirm=By.xpath("//*[@id=\"property-form\"]/div/div[2]/div/div/div[6]/div/label");
By saleinfo=By.xpath("//*[@id=\"property-form\"]/div/div[1]/div[1]/div[9]");


	public void is_Displayed_Buyer_module() {
		WebElement buyer=getElement(Buyer);
		      buyer.isDisplayed();
	}
	
	public void is_Displayed_BuyerAgent1_module() {
		WebElement Buyer_Agent1=getElement(BuyerAgent1);
		Buyer_Agent1.isDisplayed();
	}
	
	public void is_Displayed_BuyerAgent3_module() {
		WebElement Buyer_Agent3=getElement(BuyerAgent3);
		Buyer_Agent3.isDisplayed();
	}
	
	public void is_Displayed_OutsideAgent_module() {
		WebElement Outside_Agent=getElement(OutsideAgent);
		Outside_Agent.isDisplayed();
	}
	
	public void is_Displayed_AgentFirm_module() {
		WebElement Agent_Firm=getElement(AgentFirm);
		Agent_Firm.isDisplayed();
	}
	
	public GSaleInfo clickOnSaleInfo() {
		WebElement saleinfo1=getElement(saleinfo);
		     saleinfo1.click();
		     return getInstance(GSaleInfo.class);
		     
		}
	
	
	
	
	
	
	
	
}
