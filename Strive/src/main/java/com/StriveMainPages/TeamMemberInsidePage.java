package com.StriveMainPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TeamMemberInsidePage extends StriveBasePage{

	public TeamMemberInsidePage(WebDriver driver) {
		super(driver);
	}
	
	By TM_role=By.xpath("//*[@id=\"Team Member-form\"]/div/div[2]/div/div[1]/div[1]/div/label");
	By TM_FirstName=By.xpath("//*[@id=\"Team Member-form\"]/div/div[2]/div/div[1]/div[2]/label");
	By TM_LastName=By.xpath("//*[@id=\"Team Member-form\"]/div/div[2]/div/div[1]/div[3]/label");
	By TM_Email=By.xpath("//*[@id=\"Team Member-form\"]/div/div[2]/div/div[3]/div[1]/label");
	By TM_CellPhone=By.xpath("//*[@id=\"Team Member-form\"]/div/div[2]/div/div[3]/div[3]/label");
	
	By Territory=By.xpath("//*[@id=\"Team Member-form\"]/div/div[1]/div[1]/div[2]");
	
	
	public void TM_role() {
		WebElement TM_Role= getElement(TM_role);
		TM_Role.isDisplayed();
	}
	
	public void TM_FirstName() {
		WebElement TM_FirstName1= getElement(TM_FirstName);
		TM_FirstName1.isDisplayed();
	}
	
	public void TM_LastName() {
		WebElement TM_LastName1= getElement(TM_LastName);
		TM_LastName1.isDisplayed();
	}
	
	public void TM_Email() {
		WebElement TM_Email1= getElement(TM_Email);
		TM_Email1.isDisplayed();
	}
	
	public void TM_CellPhone() {
		WebElement TM_CellPhone1= getElement(TM_CellPhone);
		TM_CellPhone1.isDisplayed();
	}
	
	public TeamMemberTerritoryPage ClickOnTerritoryTab() {
		WebElement Territory1=getElement(Territory);
		Territory1.click();
		return getInstance(TeamMemberTerritoryPage.class);
		
		
	}
	
}
