package com.TestClassExecutionPACK;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.StriveMainPages.LendersPage;
import com.StriveMainPages.StatsHomePage;
import com.StriveMainPages.StriveLogin;
import com.StriveMainPages.Tenants;

public class LendersPageTest extends BaseTest{
	
	
	

	@Test(priority = 1)
	public void verify_LendersPage_Title_Test() throws Exception {
		StatsHomePage LoginpageTest = page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		page.getInstance(LendersPage.class).ClickOnLendersModule();
		Thread.sleep(3000);
		String LendersPageTitleTest = page.getInstance(LendersPage.class).getpageTitle();
		System.out.println("The Lenders page title is " + LendersPageTitleTest);
		Assert.assertEquals(LendersPageTitleTest, "STRIVE");

	}

	@Test(priority = 2)
	public void Verify_linksInAgentsPageTest() throws IOException {

		try {
			StatsHomePage LoginpageTest = page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
			Thread.sleep(3000);
			page.getInstance(LendersPage.class).ClickOnLendersModule();
				Thread.sleep(3000);
			util.check_Broken_Links();
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println("some error occured while runing the code ");
			e.printStackTrace();
		}

	}
	
	
	@Test(priority = 3)
	public void Verify_LendersPageHeaderTest() throws Exception {
		StatsHomePage LoginpageTest = page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		page.getInstance(LendersPage.class).ClickOnLendersModule();
		Thread.sleep(3000);
		String LendersPageHeaderTest=page.getInstance(LendersPage.class).LendersPageHeader();
		String LendersPageHeader = "TENANTS";
		Assert.assertEquals(LendersPageHeaderTest, LendersPageHeader);

	}
	
	@Test(priority =4 )
	public void verify_ViewTab_In_LendersPage() throws Exception {
		StatsHomePage LoginpageTest = page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		page.getInstance(LendersPage.class).ClickOnLendersModule();
		Thread.sleep(3000);
		page.getInstance(LendersPage.class).Lenders_View_Tab();
		
	}	
	
	@Test(priority =5)
	public void verify_LendersName_In_LendersPage() throws Exception {
		StatsHomePage LoginpageTest = page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		page.getInstance(LendersPage.class).ClickOnLendersModule();
		Thread.sleep(3000);
		page.getInstance(LendersPage.class).Lenders_Name_Tab();
		
	}	
	
	@Test(priority =6)
	public void verify_LenderCity_In_LendersPage() throws Exception {
		StatsHomePage LoginpageTest = page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		page.getInstance(LendersPage.class).ClickOnLendersModule();
		Thread.sleep(3000);
		page.getInstance(LendersPage.class).Lenders_City_Tab();
		
	}	
	
	@Test(priority =7)
	public void verify_LenderState_In_LendersPage() throws Exception {
		StatsHomePage LoginpageTest = page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		page.getInstance(LendersPage.class).ClickOnLendersModule();
		Thread.sleep(3000);
		page.getInstance(LendersPage.class).Lenders_State_Tab();
		
	}	
	
	@Test(priority =8)
	public void verify_LenderContactName_In_LendersPage() throws Exception {
		StatsHomePage LoginpageTest = page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		page.getInstance(LendersPage.class).ClickOnLendersModule();
		Thread.sleep(3000);
		page.getInstance(LendersPage.class).Lenders_LendersContactName_Tab();
		
	}	
	
	@Test(priority =9)
	public void verify_ContactPhone_In_LendersPage() throws Exception {
		StatsHomePage LoginpageTest = page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		page.getInstance(LendersPage.class).ClickOnLendersModule();
		Thread.sleep(3000);
		page.getInstance(LendersPage.class).Lenders_contactPhone_Tab();
		
	}	
	
	@Test(priority =10)
	public void verify_LenderEmail_In_LendersPage() throws Exception {
		StatsHomePage LoginpageTest = page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		page.getInstance(LendersPage.class).ClickOnLendersModule();
		Thread.sleep(3000);
		page.getInstance(LendersPage.class).Lenders_Email_Tab();
		
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
