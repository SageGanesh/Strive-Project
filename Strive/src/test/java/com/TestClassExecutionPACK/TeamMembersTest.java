package com.TestClassExecutionPACK;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.StriveMainPages.StatsHomePage;
import com.StriveMainPages.StriveLogin;
import com.StriveMainPages.StrivePropertiesPage;
import com.StriveMainPages.TeamMembers;

public class TeamMembersTest extends BaseTest {
	
	
	
	/*
	@Test(priority = 1)
	public void verify_TeamMembersPage_Title_Test() throws Exception {
		StatsHomePage LoginpageTest=page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		page.getInstance(TeamMembers.class).clickOnTeamMemberbutton();
		Thread.sleep(3000);
		String TeamMemberpageTitle=page.getInstance(TeamMembers.class).getpageTitle();
		System.out.println("The TeamMember page title is " + TeamMemberpageTitle);
		Assert.assertEquals(TeamMemberpageTitle, "STRIVE");

	}
	
	@Test(priority = 2)
	public void Verify_linksInTeamMembersPageTest() throws IOException {
		
		try {
			StatsHomePage LoginpageTest2=page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
			TeamMembers TeamMembersPage2 = page.getInstance(TeamMembers.class).clickOnTeamMemberbutton();
			Thread.sleep(3000);
			util.check_Broken_Links();
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println("some error occured while runing the code ");
			e.printStackTrace();
		}
		 
		
	}


	@Test(priority = 3)
	public void Verify_TeamMembersPageHeaderTest() throws Exception {
		StatsHomePage LoginpageTest2=page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		TeamMembers TeamMembersPage2 = page.getInstance(TeamMembers.class).clickOnTeamMemberbutton();
		Thread.sleep(3000);
		 page.getInstance(TeamMembers.class).validateTeamMemberPageHeader();
		
	}
	
	@Test(priority = 4)
	public void Verify_TeamMembersPageRoleTest() throws Exception {
		StatsHomePage LoginpageTest2=page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		TeamMembers TeamMembersPage2 = page.getInstance(TeamMembers.class).clickOnTeamMemberbutton();
		Thread.sleep(3000);
		 page.getInstance(TeamMembers.class).validateTeamMemberPageRole();
		
	}
	
	@Test(priority = 5)
	public void Verify_TeamMembersPageNameTest() throws Exception {
		StatsHomePage LoginpageTest2=page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		TeamMembers TeamMembersPage2 = page.getInstance(TeamMembers.class).clickOnTeamMemberbutton();
		Thread.sleep(3000);
		 page.getInstance(TeamMembers.class).validateTeamMemberPageName();
		
	}
	
	@Test(priority = 6)
	public void Verify_TeamMembersPageWorkPhoneTest() throws Exception {
		StatsHomePage LoginpageTest2=page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		TeamMembers TeamMembersPage2 = page.getInstance(TeamMembers.class).clickOnTeamMemberbutton();
		Thread.sleep(3000);
		 page.getInstance(TeamMembers.class).validateTeamMemberPageWorkPhone();
		
	}
	
	@Test(priority = 7)
	public void Verify_TeamMembersPageCellPhoneTest() throws Exception {
		StatsHomePage LoginpageTest2=page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		TeamMembers TeamMembersPage2 = page.getInstance(TeamMembers.class).clickOnTeamMemberbutton();
		Thread.sleep(3000);
		 page.getInstance(TeamMembers.class).validateTeamMemberPageCellPhone();
		
	}
	
	@Test(priority = 8)
	public void Verify_TeamMembersPageStartDateTest() throws Exception {
		StatsHomePage LoginpageTest2=page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		TeamMembers TeamMembersPage2 = page.getInstance(TeamMembers.class).clickOnTeamMemberbutton();
		Thread.sleep(3000);
		 page.getInstance(TeamMembers.class).validateTeamMemberPageStartDate();
		
	}
	
	@Test(priority = 9)
	public void Verify_TeamMembersPageYearsAtStriveTest() throws Exception {
		StatsHomePage LoginpageTest2=page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		TeamMembers TeamMembersPage2 = page.getInstance(TeamMembers.class).clickOnTeamMemberbutton();
		Thread.sleep(3000);
		 page.getInstance(TeamMembers.class).validateTeamMemberPageYearsAtStrive();
		
	}
	
	@Test(priority = 10)
	public void Verify_TeamMembersPageBirthDateTest() throws Exception {
		StatsHomePage LoginpageTest2=page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		TeamMembers TeamMembersPage2 = page.getInstance(TeamMembers.class).clickOnTeamMemberbutton();
		Thread.sleep(3000);
		 page.getInstance(TeamMembers.class).validateTeamMemberPageBirthDate();
		
	}
	
	
	@Test(priority = 11)
	public void Verify_TeamMembersPageOnPhonesTest() throws Exception {
		StatsHomePage LoginpageTest2=page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		TeamMembers TeamMembersPage2 = page.getInstance(TeamMembers.class).clickOnTeamMemberbutton();
		Thread.sleep(3000);
		 page.getInstance(TeamMembers.class).validateTeamMemberPageOnPhones();
		
	}
	
	@Test(priority =12)
	public void Verify_TeamMembersPageInPoolsTest() throws Exception {
		StatsHomePage LoginpageTest2=page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		TeamMembers TeamMembersPage2 = page.getInstance(TeamMembers.class).clickOnTeamMemberbutton();
		Thread.sleep(3000);
		 page.getInstance(TeamMembers.class).validateTeamMemberPageInPools();
		
	}
	
	@Test(priority = 13)
	public void Verify_TeamMembersPage1st_ListingTest() throws Exception {
		StatsHomePage LoginpageTest2=page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		TeamMembers TeamMembersPage2 = page.getInstance(TeamMembers.class).clickOnTeamMemberbutton();
		Thread.sleep(3000);
		 page.getInstance(TeamMembers.class).validateTeamMemberPage1st_Listing();
		
	}
	
	@Test(priority =14)
	public void Verify_TeamMembersPage1st_ClosingTest() throws Exception {
		StatsHomePage LoginpageTest2=page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		TeamMembers TeamMembersPage2 = page.getInstance(TeamMembers.class).clickOnTeamMemberbutton();
		Thread.sleep(3000);
		 page.getInstance(TeamMembers.class).validateTeamMemberPage1st_Closing();
		
	}
	
	@Test(priority = 15)
	public void Verify_TeamMembersPageAddressTest() throws Exception {
		StatsHomePage LoginpageTest2=page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		TeamMembers TeamMembersPage2 = page.getInstance(TeamMembers.class).clickOnTeamMemberbutton();
		Thread.sleep(3000);
		 page.getInstance(TeamMembers.class).validateTeamMemberPageAddress();
		
	}
	
	@Test(priority = 16)
	public void Verify_TeamMembersPageCityTest() throws Exception {
		StatsHomePage LoginpageTest2=page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		TeamMembers TeamMembersPage2 = page.getInstance(TeamMembers.class).clickOnTeamMemberbutton();
		Thread.sleep(3000);
		 page.getInstance(TeamMembers.class).validateTeamMemberPageCity();
		 
	}
	
	@Test(priority = 17)
	public void Verify_TeamMembersPageZipCodeTest() throws Exception {
		StatsHomePage LoginpageTest2=page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		TeamMembers TeamMembersPage2 = page.getInstance(TeamMembers.class).clickOnTeamMemberbutton();
		Thread.sleep(3000);
		 page.getInstance(TeamMembers.class).validateTeamMemberPageZipCode();
		 
	}
	
	*/
	
	
	@Test(priority = 1)
	public void Verify_TeamMembersPageDropDownTest() throws Throwable {
		StatsHomePage LoginpageTest2=page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		TeamMembers TeamMembersPage2 = page.getInstance(TeamMembers.class).clickOnTeamMemberbutton();
		Thread.sleep(3000);
		 page.getInstance(TeamMembers.class).Verify_TeamMemberPageDropDown();
		
	}
	
	
	
	

}
