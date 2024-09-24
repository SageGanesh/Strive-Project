package com.StriveMainPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Tenants extends StriveBasePage{

	public Tenants(WebDriver driver) {
		super(driver);
	}
	
	JavascriptExecutor js=(JavascriptExecutor) driver;

	By TenantsModuleButton=By.xpath("//*[@id=\"react-root\"]/div/div/div[1]/ul/li[9]/div/a[1]/span");
	By TenantsViewtab=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/tbody/tr[50]/td[1]/a/span");
	By scrollTOlastElementTenants=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/tbody/tr[50]/td[1]/a/span");
	By ScrollToStartingElementTenants=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/tbody/tr[50]/td[1]/a/span");
	By ClickOnAddNewTenantsPlusSymbol=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[1]/div/div[1]/a/div/span");
	By TenantsTab=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[2]/a/div");
	By ClickOnAddNewTenantsButton=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[1]/div/div[1]/a/div/span");
	By TenantsPageHeader=By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div/div[1]/div/div[1]/div");
	
	
	public Tenants ClickOnTenantsModule() {
		WebElement TenantsModulesymbolButton=getElement(TenantsModuleButton);
		TenantsModulesymbolButton.click();
		return getInstance(Tenants.class);
	}
	
	public String TenantsPageHeader() {
	    String TenantsPageHeaderT=  getPageHeader(TenantsPageHeader);
	    return TenantsPageHeaderT;
	   }
	
	
	public void Tenants_View_Tab() {
		WebElement TenantsViewModuleTab= getElement(TenantsViewtab);
		TenantsViewModuleTab.isDisplayed();
	}
	
	public void Tenants_Tab() {
		WebElement TenantsModuleTab= getElement(TenantsTab);
		TenantsModuleTab.isDisplayed();
	}
	
   public void ClickOnAddNewTenantsButton() {
	    WebElement AddNewTenantsModule=getElement(ClickOnAddNewTenantsButton);
	   AddNewTenantsModule.click();
	   
   }
	
	public void ScrollDownTheTenantsPage() {
		WebElement scrollingtolastElement=getElement(scrollTOlastElementTenants);
		js.executeScript("arguments[0].scrollIntoView(true);",scrollingtolastElement);
		// let element = driver.findElement(By.id('desiredElementId'));  
		//driver.executeScript("arguments[0].scrollIntoView(true);", element);  
		
		   }

		public void ScrollUpTheTenantsPage() {
			WebElement scrollingtoStartingElement=getElement(ScrollToStartingElementTenants);
			js.executeScript("arguments[0].scrollIntoView(true);",scrollingtoStartingElement);
			// let element = driver.findElement(By.id('desiredElementId'));  
			//driver.executeScript("arguments[0].scrollIntoView(true);", element);  
			
			   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
