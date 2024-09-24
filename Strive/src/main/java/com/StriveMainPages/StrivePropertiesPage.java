package com.StriveMainPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StrivePropertiesPage extends StriveBasePage{

	public StrivePropertiesPage(WebDriver driver) {
		super(driver);
	}
	
	StriveUtility util;
	
	
	By propertieslink=By.xpath("//*[@id=\"react-root\"]/div/div/div[1]/ul/li[3]/div/a[1]");
	
	By PropertiespageHeader=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[1]/div/div[2]/div");
	
	By scrollTOlastElement=By.xpath("//a[text()='Black Bear Diner']");
	
	By scrollToUpElement=By.xpath("//a[text='Test Multi Tenant Test 23']");
	
    By PropertiesPageStatusCol=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[3]/div[1]/table/thead/tr/th[2]/a/div");
  //*[@id="react-root"]/div/div/div[2]/div/div[1]/div/div[3]/div[1]/table/thead/tr/th[4]/a/div
	
    By PropertiesPageAgentCol=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[3]/div[1]/table/thead/tr/th[4]/a/div\r\n");
    
    By PropertiesPageCategoryCol=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[3]/div[1]/table/thead/tr/th[5]/a/div");
    
    By PropertiesPageNameCol=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[3]/div[1]/table/thead/tr/th[7]/a/div");
    
    By PropertiesPageCityCol=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[3]/div[1]/table/thead/tr/th[10]/a/div");
    
    By PropertiesPageStateCol=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[3]/div[1]/table/thead/tr/th[11]/a/div");
    
   
    By AddNewProperty=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[1]/div/div[2]/div/a/div/span");
	
	By GaneshSoftwareSolution=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[3]/div[1]/table/tbody/tr[53]/td[7]/a");
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	
	public StrivePropertiesPage clickonPropertiesPageLink() {
	 getElement(propertieslink).click();
	 return getInstance(StrivePropertiesPage.class);
}
	
	public WebElement getHeader() {
		return getElement(PropertiespageHeader);
	}
	
	public String PropertiesHomePageTitle() {
		return getpageTitle();
	}
	
public String PropertiespageHeader() {
		return getPageHeader(PropertiespageHeader);
	}

public void ScrollDownThePropertiesPage() {
WebElement scrollingtolastElement=getElement(scrollTOlastElement);
js.executeScript("arguments[0].scrollIntoView(true);",scrollingtolastElement);
// let element = driver.findElement(By.id('desiredElementId'));  
//driver.executeScript("arguments[0].scrollIntoView(true);", element);  

   }

public void ScrollUpThePropertiesPage() {
	WebElement scrollingtoStartingElement=getElement(scrollToUpElement);
	js.executeScript("arguments[0].scrollIntoView(true);",scrollingtoStartingElement);
	// let element = driver.findElement(By.id('desiredElementId'));  
	//driver.executeScript("arguments[0].scrollIntoView(true);", element);  
	
	   }
	
public void takeScreenShotOfPropertiesPage() {
    util=new StriveUtility(driver);
	util.ScreenShot("propertyPage");	
}

public AddNewPropertyPageStrive addNewProperty() {
	WebElement newSymbol=getElement(AddNewProperty);
	newSymbol.click();
	return getInstance(AddNewPropertyPageStrive.class);
	}

public void Properties_StatusColumn() {
	WebElement PropertiesPageStatusColumn= getElement(PropertiesPageStatusCol);
	PropertiesPageStatusColumn.isDisplayed();
	
}

public void Properties_AgentColumn() {
	WebElement PropertiesPageAgentColumn= getElement(PropertiesPageAgentCol);
	PropertiesPageAgentColumn.isDisplayed();	
}

public void Properties_CategoryColumn() {
	WebElement PropertiesPageAgentColumn= getElement(PropertiesPageCategoryCol);
	PropertiesPageAgentColumn.isDisplayed();
	}

public void Properties_NameColumn() {
	WebElement PropertiesPageNameColumn= getElement(PropertiesPageNameCol);
	PropertiesPageNameColumn.isDisplayed();
	}

public void Properties_CityColumn() {
	WebElement PropertiesPageCityColumn= getElement(PropertiesPageCityCol);
	PropertiesPageCityColumn.isDisplayed();
	}

public void Properties_StateColumn() {
	WebElement PropertiesPageStateColumn= getElement(PropertiesPageStateCol);
	PropertiesPageStateColumn.isDisplayed();
	}

public GaneshPropertyPageInSide clickOnPropertyOnPropertiesPage() {
	WebElement ganeshproperty= getElement(GaneshSoftwareSolution);
	 ganeshproperty.click();
	  return getInstance(GaneshPropertyPageInSide.class);
	  
}




}
