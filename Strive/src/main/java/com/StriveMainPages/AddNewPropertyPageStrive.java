package com.StriveMainPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddNewPropertyPageStrive extends StriveBasePage{
	
	StrivePropertiesPage  propertypage;
	
	
	public AddNewPropertyPageStrive(WebDriver driver) {
		super(driver);
	}
	
	By propertyName=By.xpath("//input[@name='NAME']");
	By address =By.xpath("//input[@name='ADDRESS']");
	By City =By.xpath("//input[@name='CITY']");
	By state =By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div[2]/form/div/div[2]/div/div[1]/div[4]/div/div/div/div/button[2]/span[1]/div");
	By ZIP =By.xpath("//input[@name='ZIP']");
	By YEAR_BUILT =By.xpath("//input[@name='YEAR_BUILT']");
	By source=By.xpath("//*[@id=\"mui-40408\"]");
	By transctiontype =By.xpath("//*[@id=\"mui-30852\"]");
	By market=By.xpath("//*[@id=\"mui-76097\"]");
	By sourcefeet=By.xpath("//input[@name='SQFT']");
	By propertyCategorydropdown=By.xpath("//*[@id=\"mui-82910\"]");
	By propertyTypeDropdown=By.xpath("//*[@id=\"mui-8959\"]");
    By Statusdropdown=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div[3]/div/div/div/div/button[2]");
	By addbuttonForAddingProperty=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div[2]/button");
	
	By StateDropDown=By.xpath("//*[@id=\"property-form\"]/div/div[2]/div/div[1]/div[4]/div/div/div/div/button[2]/span[1]/div/svg/path");
    
	
	public void ClickOnStateDropDown() throws Exception {
		WebElement StateDropdown=getElement(StateDropDown);
		Thread.sleep(3000);
		StateDropdown.click();
		Thread.sleep(3000);
		Select select=new Select(StateDropdown);
		select.selectByVisibleText("California");
		
		}
	
    public AddNewPropertyPageStrive AddNewPropertyPage() {
	propertypage=new StrivePropertiesPage(driver);
	propertypage.addNewProperty();
	return getInstance(AddNewPropertyPageStrive.class);
	
	}
	
    
	public WebElement ClickOnAddButtonForAddingNewProperty() {
		 return getElement(addbuttonForAddingProperty);	
	}
	
	
	
	
public void fillingTheDataInAddNewPropertytab(String pN,String Ad,String CT,String sT,
		String Zipcode,String Yearbuilt,String SQ) throws Throwable {
	
	WebElement PropertyNamefield=getElement(propertyName);
	PropertyNamefield.clear();
	PropertyNamefield.sendKeys(pN);
	Thread.sleep(3000);
	
	WebElement Addressfield=getElement(address);
	Addressfield.clear();
	Addressfield.sendKeys(Ad);
	Thread.sleep(3000);
	
	WebElement cityfield=getElement(City);
	cityfield.clear();
	cityfield.sendKeys(CT);
	Thread.sleep(3000);
	
	WebElement PropertStatefield=getElement(state);
	PropertStatefield.clear();
	PropertStatefield.click();
	Thread.sleep(3000);
	Select select=new Select(PropertStatefield);
	select.selectByVisibleText("California");
	Thread.sleep(3000);
	
	
	WebElement PropertyzipCodefield=getElement(ZIP);
	PropertyzipCodefield.clear();
	PropertyNamefield.sendKeys(Zipcode);
	Thread.sleep(3000);
	
	WebElement PropertyYearBuiltfield=getElement(YEAR_BUILT);
	PropertyYearBuiltfield.clear();
	PropertyNamefield.sendKeys(Yearbuilt);
	Thread.sleep(3000);
	
	
	WebElement Sourcedropdownfield=getElement(source);
	Sourcedropdownfield.click();
	Select select6=new Select(Sourcedropdownfield);
	select6.selectByVisibleText("STRIVE");
	Thread.sleep(3000);
	
	WebElement transactionTypedropdownfield=getElement(transctiontype);
	transactionTypedropdownfield.click();
	Select select1=new Select(Sourcedropdownfield);
	select.selectByVisibleText("Investment Sales");
	Thread.sleep(3000);
	
	
	WebElement Marketdropdownfield=getElement(market);
	Marketdropdownfield.click();
	Select select2=new Select(Sourcedropdownfield);
	select.selectByVisibleText("DFW");
	Thread.sleep(3000);
	
	WebElement Propertysquarefield=getElement(sourcefeet);
	Propertysquarefield.clear();
	Propertysquarefield.sendKeys(SQ);
	Thread.sleep(3000);
	
	WebElement propertyCategorydropdownfield=getElement(propertyCategorydropdown);
	propertyCategorydropdownfield.click();
	Select select3=new Select(Sourcedropdownfield);
	select.selectByVisibleText("Industrial");
	Thread.sleep(3000);
	
	WebElement propertyTypedropdownfield=getElement(propertyTypeDropdown);
	propertyTypedropdownfield.click();
	Select select4=new Select(Sourcedropdownfield);
	select.selectByVisibleText("Multi-Tenant");
	Thread.sleep(3000);
	

	WebElement TenantSubCategorydropdownfield=getElement(source);
	TenantSubCategorydropdownfield.click();
	Select select5=new Select(TenantSubCategorydropdownfield);
	select.selectByVisibleText("Data Center");
	

              }


	
   }
