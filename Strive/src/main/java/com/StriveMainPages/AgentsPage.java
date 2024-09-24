package com.StriveMainPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AgentsPage extends StriveBasePage{

	public AgentsPage(WebDriver driver) {
		super(driver);
	}

	By AgentHeading=By.xpath("//div[text()='Agents']");
	By AgentViewtab=By.xpath("//div[text()='View']");
	By AgentEmail=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[4]/a/div");
	By AgentWorkPhone=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[5]/a/div");
	By Agent_FirstName=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[2]/a/div");
	By Agent_LastName=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[2]/a/div");
    By scrollTOlastElementAgent=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/tbody/tr[50]/td[1]/a/span");
	By ScrollToStartingElement=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/tbody/tr[50]/td[1]/a/span");
    By AddAgentheadingInAddNewPage=By.xpath("//div[text()='Add seller']");
	By AgentModuletab=By.xpath("//*[@id=\"react-root\"]/div/div/div[1]/ul/li[6]/div/a[1]/span");
	By ClickOnAddNewAgentPlusSymbol=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[1]/div/div[1]/a/div/span");
	By Agents_Module=By.xpath("//*[@id=\"react-root\"]/div/div/div[1]/ul/li[7]/div/a[1]/span");
	By AgentCellPhone=By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[6]/a/div");
	By AgentFirm=By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[7]/a/div");
	
	
	
JavascriptExecutor js=(JavascriptExecutor) driver;
	
	
public AgentsPage clickOnAgentbutton() {
    WebElement AgentModuleButton=getElement(Agents_Module);
    AgentModuleButton.click();
	return getInstance(AgentsPage.class);
}

	public boolean Agents_Heading() {
		WebElement Agent_Heading1= getElement(AgentHeading);
		boolean AgentsPageHeading=Agent_Heading1.isDisplayed();
		return AgentsPageHeading;
	}
	
	public void Agent_viewTab() {
		WebElement AgentViewColumn= getElement(AgentViewtab);
		AgentViewColumn.isDisplayed();
		
	}
	
	
	public void Agent_FirstName() {
		WebElement AgentFirstNametab= getElement(Agent_FirstName);
	AgentFirstNametab.isDisplayed();
		
	}
	
	public void Agent_LastName() {
		WebElement AgentsPageLastNametab= getElement(Agent_LastName);
		AgentsPageLastNametab.isDisplayed();
	}
	
	public void Agent_Email() {
		WebElement AgentEmailtab= getElement(AgentEmail);
		AgentEmailtab.isDisplayed();
			
	}
	
	public void Agent_WorkPhoneNum() {
		WebElement AgentPhoneNum= getElement(AgentWorkPhone);
		AgentPhoneNum.isDisplayed();
	
	}

	
	public void Agent_CellPhoneNum() {
		WebElement AgentCellPhoneNum= getElement(AgentCellPhone);
		AgentCellPhoneNum.isDisplayed();
		}
	
	public void Agent_Firm() {
		WebElement AgentFirmtab= getElement(AgentFirm);
		AgentFirmtab.isDisplayed();
		
	}
	
	
	public void ScrollDownTheAgentPage() {
	WebElement scrollingtolastElement=getElement(scrollTOlastElementAgent);
	js.executeScript("arguments[0].scrollIntoView(true);",scrollingtolastElement);
	// let element = driver.findElement(By.id('desiredElementId'));  
	//driver.executeScript("arguments[0].scrollIntoView(true);", element);  
	
	   }

	public void ScrollUpTheAgentPage() {
		WebElement scrollingtoStartingElement=getElement(ScrollToStartingElement);
		js.executeScript("arguments[0].scrollIntoView(true);",scrollingtoStartingElement);
		// let element = driver.findElement(By.id('desiredElementId'));  
		//driver.executeScript("arguments[0].scrollIntoView(true);", element);  
		
		   }

	public void ClickOnTheAddNewAgentPagebutton() {
		
		WebElement AddNewBuyerPagebutton1=getElement(AddAgentheadingInAddNewPage);
		AddNewBuyerPagebutton1.click();
		getElement(AddAgentheadingInAddNewPage).isDisplayed();
		 
		
	}
	
	
	
	
	
	
}
