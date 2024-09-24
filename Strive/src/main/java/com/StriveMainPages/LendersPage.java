package com.StriveMainPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LendersPage extends StriveBasePage{

	public LendersPage(WebDriver driver) {
		super(driver);
		
	}
	
	By LendersModule=By.xpath("//*[@id=\"react-root\"]/div/div/div[1]/ul/li[10]/div/a[1]/span");
	By LendersViewtab=By.xpath("//div[text()='View']");
	By LenderName=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[2]/a/div");
    By  LendersCity=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[4]/a/div");
	By  LendersState=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[4]/a/div");
	By  Lendersphone=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[4]/a/div");
	By  LendersEmail=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[7]/a/div");
	By  LendersContactName=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[4]/a/div");
	By LendersHeader=By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div/div[1]/div/div[1]/div");
	
	
	
	public LendersPage ClickOnLendersModule() {
		WebElement LendersModulesymbolButton=getElement(LendersModule);
		LendersModulesymbolButton.click();
		return getInstance(LendersPage.class);
		
	}
	
	public String LendersPageHeader() {
	    String LendersPageHeaderT=  getPageHeader(LendersHeader);
	    return LendersPageHeaderT;
	   }
	
	
	public void Lenders_View_Tab() {
		WebElement LendersViewModuleTab= getElement(LendersViewtab);
		LendersViewModuleTab.isDisplayed();
		
	}
	
	public void Lenders_Name_Tab() {
		WebElement LendersViewModuleTab= getElement(LenderName);
		LendersViewModuleTab.isDisplayed();
		
	}
	
	public void Lenders_City_Tab() {
		WebElement LendersViewModuleTab= getElement(LendersCity);
		LendersViewModuleTab.isDisplayed();
		
	}
	
	public void Lenders_State_Tab() {
		WebElement LendersStateModuleTab= getElement(LendersState);
		LendersStateModuleTab.isDisplayed();
		
	}
	
	public void Lenders_LendersContactName_Tab() {
		WebElement LendersphoneModuleTab= getElement(LendersContactName);
		LendersphoneModuleTab.isDisplayed();
		
	}
	public void Lenders_contactPhone_Tab() {
		WebElement LendersphoneModuleTab= getElement(Lendersphone);
		LendersphoneModuleTab.isDisplayed();
		
	}
	
	public void Lenders_Email_Tab() {
		WebElement LendersphoneModuleTab= getElement(LendersEmail);
		LendersphoneModuleTab.isDisplayed();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

	
	
	
	
	
	