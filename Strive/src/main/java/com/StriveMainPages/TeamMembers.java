package com.StriveMainPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TeamMembers extends StriveBasePage {

	public TeamMembers(WebDriver driver) {
		super(driver);
	}
	
	
	By TeamMemberSymbolButton1=By.xpath("//*[@id=\"react-root\"]/div/div/div[1]/ul/li[4]/div/a[1]/span");
	By lastRecordOfTeamMemberList1=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[2]/table/tbody/tr[95]/td[1]/a/span");
	By AddNewTeamMemberPagebutton=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[1]/div/div[1]/a/div/span");
	By Seller=By.xpath("//*[@id=\"react-root\"]/div/div/div[1]/ul/li[5]/div/a[1]/span");
	By TeamMemberPageHeader=By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div/div[1]/div/div[1]/div");
	By TeamMemberPageRole=By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[2]/a/div");
	By TeamMemberPageName=By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[3]/a/div");
	By TeamMemberPageWorkPhone=By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[4]/a/div");
	By TeamMemberPageCellPhone=By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[5]/a/div");
	By TeamMemberPageStartDate=By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[6]/a/div");
	By TeamMemberPageYearsAtStrive=By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[7]/a/div");
	By TeamMemberPageBirthDate=By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[8]/a/div");
	By TeamMemberPageOnPhones=By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[9]/a/div");
	By TeamMemberPageInPools=By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[10]/a/div");
	By TeamMemberPage1stListing=By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[11]/a/div");
	By TeamMemberPage1stClosing=By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[12]/a/div");
	By TeamMemberPageAddress=By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[13]/a/div");
	By TeamMemberPageCity=By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[14]/a/div");
	By TeamMemberPageZipCode=By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div/div[2]/table/thead/tr/th[15]/a/div");
    By TeamMemberPagedropdown=By.cssSelector("div.dropdown-container:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > button:nth-child(2) > span:nth-child(1) > div:nth-child(1) > svg:nth-child(1)");
	By SearchPanel=By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div[1]/div");
	
	
	
	
	
	public TeamMembers clickOnTeamMemberbutton() {
	    WebElement TeamMemberSymbolButton=getElement(TeamMemberSymbolButton1);
	    TeamMemberSymbolButton.click();
		return getInstance(TeamMembers.class);
}

	public TeamMemberInsidePage ScrollIntoViewOfTeamMemberPage() {
	 WebElement editbuttonOfLastRecord=getElement(lastRecordOfTeamMemberList1);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView();", editbuttonOfLastRecord);
		 editbuttonOfLastRecord.click();
		  return getInstance(TeamMemberInsidePage.class);
		 	 
	}
	
	public void ClickOnAddNewTeamMemberPagebutton() {
		WebElement AddNewTeamMemberPagebutton1= getElement(AddNewTeamMemberPagebutton);
		AddNewTeamMemberPagebutton1.click();	
	}
	
	public void validateTeamMemberPageHeader() {
	WebElement TeamMembersPageHeader=getElement(TeamMemberPageHeader);
	TeamMembersPageHeader.isDisplayed();
		}
	
	public void validateTeamMemberPageRole() {
		WebElement TeamMembersPageRole=getElement(TeamMemberPageRole);
		TeamMembersPageRole.isDisplayed();
			}
		
	public void validateTeamMemberPageName() {
		WebElement TeamMembersPageName=getElement(TeamMemberPageName);
		TeamMembersPageName.isDisplayed();
			}
		
	public void validateTeamMemberPageWorkPhone() {
		WebElement TeamMembersPageWorkPhone=getElement(TeamMemberPageWorkPhone);
		TeamMembersPageWorkPhone.isDisplayed();
			}
		
	public void validateTeamMemberPageCellPhone() {
		WebElement TeamMembersPageCellPhone=getElement(TeamMemberPageCellPhone);
		TeamMembersPageCellPhone.isDisplayed();
			}
	
	public void validateTeamMemberPageStartDate() {
		WebElement TeamMembersPageStartDate=getElement(TeamMemberPageStartDate);
		TeamMembersPageStartDate.isDisplayed();
			}
	
	public void validateTeamMemberPageYearsAtStrive() {
		WebElement TeamMembersPageYearsAtStrive=getElement(TeamMemberPageYearsAtStrive);
		TeamMembersPageYearsAtStrive.isDisplayed();
			}
	
	public void validateTeamMemberPageBirthDate() {
		WebElement TeamMembersPageBirthDate=getElement(TeamMemberPageBirthDate);
		TeamMembersPageBirthDate.isDisplayed();
			}
	
	public void validateTeamMemberPageOnPhones() {
		WebElement TeamMembersPageOnPhones=getElement(TeamMemberPageOnPhones);
		TeamMembersPageOnPhones.isDisplayed();
			}
	
	public void validateTeamMemberPageInPools() {
		WebElement TeamMembersPageInPools=getElement(TeamMemberPageInPools);
		TeamMembersPageInPools.isDisplayed();
			}
	
	public void validateTeamMemberPage1st_Listing() {
		WebElement TeamMembersPage1st_Listing=getElement(TeamMemberPage1stListing);
		TeamMembersPage1st_Listing.isDisplayed();
			}
	
	public void validateTeamMemberPage1st_Closing() {
		WebElement TeamMembersPage1st_Closing=getElement(TeamMemberPage1stClosing);
		TeamMembersPage1st_Closing.isDisplayed();
			}
	
	public void validateTeamMemberPageAddress() {
		WebElement TeamMembersPageAddress=getElement(TeamMemberPageAddress);
		TeamMembersPageAddress.isDisplayed();
			}
	
	public void validateTeamMemberPageCity() {
		WebElement TeamMembersPageCity=getElement(TeamMemberPageCity);
		TeamMembersPageCity.isDisplayed();
			}
	
	public void validateTeamMemberPageZipCode() {
		WebElement TeamMembersPageZipCode=getElement(TeamMemberPageZipCode);
		TeamMembersPageZipCode.isDisplayed();
			}
	
	
	
	public SellerPage ClickOnSellerPage() {
		WebElement SellerPage1=getElement(Seller);
		SellerPage1.click();
		return getInstance(SellerPage.class);
		
	}
	
	
	public void Verify_TeamMemberPageDropDown() throws Throwable {
		WebElement dropdown=getElement(TeamMemberPagedropdown);
		dropdown.click();
		Thread.sleep(3000);
		getElement(SearchPanel).click();
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
