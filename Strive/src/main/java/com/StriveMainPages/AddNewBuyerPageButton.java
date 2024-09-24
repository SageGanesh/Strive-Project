package com.StriveMainPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddNewBuyerPageButton extends StriveBasePage{

	public AddNewBuyerPageButton(WebDriver driver) {
		super(driver);
	}
	
	By ClickOnAddNewBuyerPlusSymbol=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[1]/div/div[1]/a/div/span");
	

	
	
	public AddNewBuyerPageButton ClickOnTheAddNewBuyerPagebutton() {
		WebElement AddNewBuyerPagebutton1=getElement(ClickOnAddNewBuyerPlusSymbol);
		AddNewBuyerPagebutton1.click();
		return getInstance(AddNewBuyerPageButton.class);
		 
		
	}
	
	
	
	
	
	
	

}
