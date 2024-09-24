package com.StriveMainPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TeamMemberFormsPage extends StriveBasePage{

	public TeamMemberFormsPage(WebDriver driver) {
		super(driver);
	}
	
	By W4=By.xpath("//*[@id=\"Team Member-form\"]/div/div[2]/div/div/div[1]/label");
    By payroll=By.xpath("//*[@id=\"Team Member-form\"]/div/div[2]/div/div/div[2]/label");
	By BackNavigationButton=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[2]/div[1]/div/div[1]/span");
    
	
	public void Forms_w4() {
    	WebElement w4_forms=getElement(W4);
    	w4_forms.isDisplayed();
    	
    	 }
	
    public void Forms_payroll() {
    	WebElement payroll_forms=getElement(payroll);
    	payroll_forms.isDisplayed();
    	
    	 }
	
	public TeamMembers backNavigationButton() {
		 WebElement backNavigationbutton1=getElement(BackNavigationButton);
		 backNavigationbutton1.click();
		 return getInstance(TeamMembers.class);
		 
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
