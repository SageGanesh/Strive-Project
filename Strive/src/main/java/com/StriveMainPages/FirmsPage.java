package com.StriveMainPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirmsPage extends StriveBasePage{

	public FirmsPage(WebDriver driver) {
		super(driver);
	}
	
	
	By FirmModuleButton=By.xpath("//*[@id=\"react-root\"]/div/div/div[1]/ul/li[8]/div/a[1]/span");
	By FirmViewtab=By.xpath("//div[text()='View']");
	By FirmCompany=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[2]/a/div");
	By FirmAddress=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[3]/a");
	By FirmCity=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[4]/a/div");
	By FirmState=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[4]/a/div");
	By Firmphone=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[4]/a/div");
	By Firmwebsite=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[7]/a/div");
	By FirmsPageHeader=By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div/div[1]/div/div[1]/div");
	
	
	
	
	public FirmsPage ClickOnFirmsModule() {
		WebElement FirmModulesymbolButton=getElement(FirmModuleButton);
		FirmModulesymbolButton.click();
		return getInstance(FirmsPage.class);
	}
		
	
	public String firmsPageHeader() {
		    String FirmsPageHeaderT=  getPageHeader(FirmsPageHeader);
		    return FirmsPageHeaderT;
		   }
	
	public void firm_View_Tab() {
		WebElement FirmViewModuleTab= getElement(FirmViewtab);
		FirmViewModuleTab.isDisplayed();
	}
	
	public void firm_company_Tab() {
		WebElement FirmCompanyModule= getElement(FirmCompany);
		FirmCompanyModule.isDisplayed();
	}
	
	public void firm_address_Tab() {
		WebElement FirmAddressModule= getElement(FirmAddress);
		FirmAddressModule.isDisplayed();
	}
	
	
	public void firm_city_Tab() {
		WebElement FirmCityModule= getElement(FirmCity);
		FirmCityModule.isDisplayed();
	}
	
	public void firm_state_Tab() {
		WebElement FirmStateModule= getElement(FirmState);
		FirmStateModule.isDisplayed();
	}
	
	public void firm_phone_Tab() {
		WebElement FirmphoneModule= getElement(Firmphone);
		FirmphoneModule.isDisplayed();
	}
	
	public void firm_Website_Tab() {
		WebElement FirmwebsiteModule= getElement(Firmwebsite);
		FirmwebsiteModule.isDisplayed();
		
	}
	
	
	
	
		
		
		
		
	}
	
	
	


