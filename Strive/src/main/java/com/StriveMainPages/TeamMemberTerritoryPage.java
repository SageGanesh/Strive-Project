package com.StriveMainPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TeamMemberTerritoryPage extends StriveBasePage{

	public TeamMemberTerritoryPage(WebDriver driver) {
		super(driver);
	}
	
	By TerritoryName=By.xpath("//*[@id=\"Team Member-form\"]/div/div[2]/div/div/div/div/label");
	By AgentName=By.xpath("//*[@id=\"Team Member-form\"]/div/div[2]/div/div/div/div/div");
	By Forms=By.xpath("//*[@id=\"Team Member-form\"]/div/div[1]/div[1]/div[3]");
	
	
	public void TeamMember_TerritoryName() {
		WebElement TerritoryName1=getElement(TerritoryName);
		TerritoryName1.isDisplayed();
		}
	

	public void TeamMember_AgentName() {
		WebElement AgentName1=getElement(AgentName);
		AgentName1.isEnabled();
		
	}
	
public TeamMemberFormsPage ClickOnFormsButton() {
	WebElement forms1=getElement(Forms);
	forms1.click();
	return getInstance(TeamMemberFormsPage.class);	
}


}
