package com.StriveMainPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SellerPage extends StriveBasePage{

	public SellerPage(WebDriver driver) {
		super(driver);
	}
	 
	By sellerHeading=By.xpath("//div[text()='Sellers']");
	By sellerViewtab=By.xpath("//div[text()='View']");
	By SellerStatus=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[2]/a/div");
	By SellerEmail=By.className("SortTable_th_name active");
	By PhoneNum=By.className("SortTable_th_name ");
	By SellerSymbolButton1=By.xpath("//*[@id=\"react-root\"]/div/div/div[1]/ul/li[4]/div/a[1]/span");
	By SellerButton1=By.xpath("//*[@id=\"react-root\"]/div/div/div[1]/ul/li[4]/div/a[1]/span");
	By lastRecordOfSellerList1=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/tbody/tr[95]/td[1]/a/span");
	By Seller=By.xpath("//*[@id=\"react-root\"]/div/div/div[1]/ul/li[5]/div/a[1]/span");
	By Seller_FirstName=By.className("SortTable_th_name ");
	By Seller_LastName=By.className("SortTable_th_name active");
    By scrollTOlastElement=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/tbody/tr[50]/td[1]/a/span");
	By ScrollToStartingElement=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/tbody/tr[1]/td[1]/a/span");
   By AddSellerheadingInAddNewPage=By.xpath("//div[text()='Add seller']");
	
	By CompanyName=By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[6]/a/div");
	
	
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	
	public SellerPage clickOnSellerbutton() {
	    WebElement SellerButton=getElement(SellerSymbolButton1);
	    SellerButton.click();
		return getInstance(SellerPage.class);
}
	
	public String SellerPage_Title_Test() {
		String SellerPageTitle=getpageTitle();
		return SellerPageTitle;
	}
	
	
	public boolean Sellers_Heading() {
		WebElement Seller_Heading1= getElement(sellerHeading);
		boolean sellerheading=Seller_Heading1.isDisplayed();
		return sellerheading;
	}
	
	public boolean Seller_viewTab() {
		WebElement SellerViewColumn= getElement(sellerViewtab);
		boolean SellerPageViewTab=SellerViewColumn.isDisplayed();
		return SellerPageViewTab;
	}
	
	public boolean Seller_StatusTab() {
		WebElement SellerStatusTab= getElement(SellerStatus);
		boolean SellerPageStatusTab=SellerStatusTab.isDisplayed();
		return SellerPageStatusTab;
	}
	
	public boolean Seller_FirstName() {
		WebElement SellerFirstNametab= getElement(Seller_FirstName);
		boolean SellerPageFirstNameTab=SellerFirstNametab.isDisplayed();
		return SellerPageFirstNameTab;
	}
	
	public boolean Seller_LastName() {
		WebElement SellerLastNametab= getElement(Seller_LastName);
		boolean SellerPageLastNameTab=SellerLastNametab.isDisplayed();
		return SellerPageLastNameTab;
	}
	
	
	
	public boolean Seller_Email() {
		WebElement SellerEmailtab= getElement(SellerEmail);
		boolean SellerPageEmailTab=SellerEmailtab.isDisplayed();
		return SellerPageEmailTab;
		
	}
	
	public boolean Seller_PhoneNum() {
		WebElement seller_PhoneNum= getElement(PhoneNum);
		boolean SellerPagePhoneNumTab=seller_PhoneNum.isDisplayed();
		return SellerPagePhoneNumTab;
		
	}

	public boolean Seller_Company_Name() {
		WebElement seller_CompanyName= getElement(CompanyName);
		boolean SellerPageCompanyNameTab=seller_CompanyName.isDisplayed();
		return SellerPageCompanyNameTab;
		
	}

	public void ScrollDownTheSellerPage() {
	WebElement scrollingtolastElement=getElement(scrollTOlastElement);
	js.executeScript("arguments[0].scrollIntoView(true);",scrollingtolastElement);
	// let element = driver.findElement(By.id('desiredElementId'));  
	//driver.executeScript("arguments[0].scrollIntoView(true);", element);  
	}

	public void ScrollUpTheSellerPage() {
		WebElement scrollingtoStartingElement=getElement(ScrollToStartingElement);
		js.executeScript("arguments[0].scrollIntoView(true);",scrollingtoStartingElement);
		// let element = driver.findElement(By.id('desiredElementId'));  
		//driver.executeScript("arguments[0].scrollIntoView(true);", element);  	
}

	
	
	
	
	
}
