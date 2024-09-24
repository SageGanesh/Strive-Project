package com.StriveMainPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddNewTeamMemberPage  extends StriveBasePage{

	public AddNewTeamMemberPage(WebDriver driver) {
		super(driver);
	}

	
	By FirstName=By.xpath("//*[@id=\"Team Member-form\"]/div/div[2]/div/div[1]/div[2]/div/input");
	By ClickOnTeamMemberModuleSymbol=By.xpath("//*[@id=\"react-root\"]/div/div/div[1]/ul/li[4]/div/a[1]/span");
	By TeamMemberHeader=By.xpath("//div[text()='Team Members' and @class='page-title']");
	By RoleInTeamMemberPage=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[2]/a/div");
	By NameInTeamMemberPage=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[3]/a/div");
	By WorkPhoneTeamMemberPage=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[4]/a/div");
	By StartDateTeamMemberPage=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[6]/a/div");
	By YearsAtStriveInTeamMemberPage=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[7]/a/div");
	By BirthDateInTeamMemberPage=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[8]/a/div");
	
	
	
	public AddNewTeamMemberPage ClickOnTeamMemberModuleSymbol() {
	WebElement TeamMemberModuleSymbol=getElement(ClickOnTeamMemberModuleSymbol);
	TeamMemberModuleSymbol.click();
	return getInstance(AddNewTeamMemberPage.class);
	
 }
	
	public void ValidatingTeamMemberHeader() {
		WebElement TeamMemberHeadertest=getElement(TeamMemberHeader);
		TeamMemberHeadertest.isDisplayed();
		
		}
	
	public void ValidatingRoleInTeamMemberPage() {
		WebElement RoleInTeamMemberPagetest=getElement(RoleInTeamMemberPage);
		RoleInTeamMemberPagetest.isDisplayed();	
	}

	public void ValidatingNameInTeamMemberPage() {
		WebElement NameInTeamMemberPagetest=getElement(NameInTeamMemberPage);
		NameInTeamMemberPagetest.isDisplayed();
		
}
	
	public void ValidatingWorkPhoneInTeamMemberPage() {
		WebElement WorkPhoneInTeamMemberPagetest=getElement(WorkPhoneTeamMemberPage);
		WorkPhoneInTeamMemberPagetest.isDisplayed();
		
}
	
	public void ValidatingStartDateInTeamMemberPage() {
		WebElement StartDateInTeamMemberPagetest=getElement(StartDateTeamMemberPage);
		StartDateInTeamMemberPagetest.isDisplayed();
		
}
	
	public void ValidatingYearsAtStriveInTeamMemberPage() {
		WebElement YearsAtStriveInTeamMemberPagetest=getElement(YearsAtStriveInTeamMemberPage);
		YearsAtStriveInTeamMemberPagetest.isDisplayed();
		
}
	
	public void ValidatingBirthDateInTeamMemberPage() {
		WebElement BirthDateInTeamMemberPagetest=getElement(YearsAtStriveInTeamMemberPage);
		BirthDateInTeamMemberPagetest.isDisplayed();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
