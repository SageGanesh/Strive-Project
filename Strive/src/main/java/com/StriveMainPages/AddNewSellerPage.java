package com.StriveMainPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddNewSellerPage extends StriveBasePage{

	public AddNewSellerPage(WebDriver driver) {
		super(driver);
	}

	By AddNewSellerPagebutton=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[1]/div/div[1]/a/div/span");
	
	
	
	public AddNewSellerPage ClickOnTheAddNewSellerPagebutton() {
		WebElement AddNewSellerpageButton=getElement(AddNewSellerPagebutton);
		AddNewSellerpageButton.click();
		return getInstance(AddNewSellerPage.class);
		
		 }
	
	
	
	
	
	
	
	
	
	
	
}
