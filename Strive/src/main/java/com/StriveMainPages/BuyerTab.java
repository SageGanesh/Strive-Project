package com.StriveMainPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuyerTab extends StriveBasePage{

	public BuyerTab(WebDriver driver) {
		super(driver);
	}
	
	//div[@class='SortTable_th_name ']
	
	By BuyerHeading=By.xpath("//div[text()='Buyers']");
	By BuyerViewtab=By.xpath("//div[text()='View']");
	By buyerStatus=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[2]/a/div/text()");
	By BuyerEmail=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[10]/a/div");
	By BuyerPhoneNum=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[11]/a/div");
	By Buyer_FirstName=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[9]/div[2]/a[1]/div");
	By Buyer_LastName=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[9]/div[2]/a[2]/div");
    By scrollTOlastElementBuyer=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/tbody/tr[50]/td[1]/a/span");
	By ScrollToStartingElement=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/tbody/tr[1]/td[1]/a/span");
   By AddBuyerheadingInAddNewPage=By.xpath("//div[text()='Add buyer']");
   
	By BuyerModuletab=By.xpath("//*[@id=\"buyer-form\"]/div/div[1]/div[1]/div[1]");
	By Buyer_Category=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[3]/a/div");
	By Buyer_Type=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[4]/a/div");
	By Buyer_SubCategory=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[5]/a/div");
	By Buyer_Price=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[7]/div[1]");
	By Buyer_CapeRate=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[8]/div[1]");
	By Buyer_Agent=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[13]/a/div");
	By Buyer_Market=By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[6]/a/div");
	By Buyer_CompanyName=By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[12]/a/div");
	
JavascriptExecutor js=(JavascriptExecutor) driver;
	
	
public BuyerTab ClickOnTheBuyerModule() {
	WebElement BuyerTab1=getElement(BuyerModuletab);
	BuyerTab1.click();
    return  getInstance(BuyerTab.class);	
}


public boolean Buyers_Heading() {
	WebElement Buyers_Heading1= getElement(BuyerHeading);
	boolean Buyersheading=Buyers_Heading1.isDisplayed();
	return Buyersheading;
}
	
	public boolean buyer_viewTab() {
		WebElement BuyersViewColumn= getElement(BuyerViewtab);
		boolean Buyersheading=BuyersViewColumn.isDisplayed();
		return Buyersheading;
	}
	
	public boolean buyer_Status() {
		WebElement buyerStatusTab= getElement(buyerStatus);
		boolean BuyersStatus=buyerStatusTab.isDisplayed();
		return BuyersStatus;
	}
	
	public boolean buyer_Category() {
		WebElement buyerCategoryTab= getElement(Buyer_Category);
		boolean BuyersCategory= buyerCategoryTab.isDisplayed();
		return BuyersCategory;
	}
	
	
	public boolean buyer_Type() {
		WebElement buyerTypeTab= getElement(Buyer_Type);
		boolean BuyersType=buyerTypeTab.isDisplayed();
		return BuyersType;
	}
	
	
	public boolean buyer_SubCategory() {
		WebElement buyerSubCategoryTab= getElement(Buyer_SubCategory);
		boolean BuyersSubCategoryTab=buyerSubCategoryTab.isDisplayed();
		return BuyersSubCategoryTab;
	}
	
	
	public boolean buyer_Market() {
		WebElement buyerMarket= getElement(Buyer_Market);
		boolean buyerMarketTab=buyerMarket.isDisplayed();
		return buyerMarketTab;
	}
	
	public boolean buyer_Price() {
		WebElement buyerPriceTab= getElement(Buyer_Price);
		boolean BuyersPrice=buyerPriceTab.isDisplayed();
		return BuyersPrice;
	}
	
	public boolean buyer_CapRate() {
		WebElement buyerCapeRate= getElement(Buyer_CapeRate);
		boolean BuyersCapeRate=buyerCapeRate.isDisplayed();
		return BuyersCapeRate;
	}
	
	public boolean buyer_FirstName() {
		WebElement buyerFirstNametab= getElement(Buyer_FirstName);
		boolean BuyersFirstNameTest=buyerFirstNametab.isDisplayed();
		return BuyersFirstNameTest;
		
	}
	
	public boolean buyer_LastName() {
		WebElement buyerLastNameTab= getElement(Buyer_LastName);
		boolean BuyersLastNameTest=buyerLastNameTab.isDisplayed();
		return BuyersLastNameTest;
	}
	
	public boolean buyer_Email() {
		WebElement buyerEmailTab= getElement(BuyerEmail);
		boolean BuyersEmailTabTest=buyerEmailTab.isDisplayed();
		return BuyersEmailTabTest;
		
	}
	
	
	public boolean buyer_Phone() {
		WebElement buyerPhoneNumTab= getElement(BuyerPhoneNum);
		boolean BuyersPhoneNum=buyerPhoneNumTab.isDisplayed();
		return BuyersPhoneNum;
	}
	
	public boolean buyer_CompanyName() {
		WebElement buyerCompanyName= getElement(Buyer_CompanyName);
		boolean buyerCompanyNameTab=buyerCompanyName.isDisplayed();
		return buyerCompanyNameTab;
	}
	
	
	public boolean buyer_Agent() {
		WebElement buyerStatusTab= getElement(Buyer_Agent);
		boolean BuyersStatus=buyerStatusTab.isDisplayed();
		return BuyersStatus;
	}
	
	
	public void ScrollDownTheBuyerPage() {
	WebElement scrollingtolastElement=getElement(scrollTOlastElementBuyer);
	js.executeScript("arguments[0].scrollIntoView(true);",scrollingtolastElement);
	// let element = driver.findElement(By.id('desiredElementId'));  
	//driver.executeScript("arguments[0].scrollIntoView(true);", element);  
	
	   }

	public void ScrollUpTheBuyerPage() {
		WebElement scrollingtoStartingElement=getElement(ScrollToStartingElement);
		js.executeScript("arguments[0].scrollIntoView(true);",scrollingtoStartingElement);
		// let element = driver.findElement(By.id('desiredElementId'));  
		//driver.executeScript("arguments[0].scrollIntoView(true);", element);  
		
		   }

	
	
	
	
	
	
	

}
