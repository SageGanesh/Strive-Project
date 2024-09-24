package com.TestClassExecutionPACK;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.StriveMainPages.AgentsPage;
import com.StriveMainPages.FirmsPage;
import com.StriveMainPages.StatsHomePage;
import com.StriveMainPages.StriveLogin;

public class FirmsPageTest extends BaseTest{
	
	
	
	@Test(priority = 1)
	public void verify_FirmsPage_Title_Test() throws Exception {
		StatsHomePage LoginpageTest = page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		page.getInstance(FirmsPage.class).ClickOnFirmsModule();
		Thread.sleep(3000);
		String FirmsPageTitleTest = page.getInstance(FirmsPage.class).getpageTitle();
		System.out.println("The Firms page title is " + FirmsPageTitleTest);
		Assert.assertEquals(FirmsPageTitleTest, "STRIVE");

	}

	@Test(priority = 2)
	public void Verify_linksInAgentsPageTest() throws IOException {

		try {
			StatsHomePage LoginpageTest = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
			Thread.sleep(3000);
			page.getInstance(FirmsPage.class).ClickOnFirmsModule();
				Thread.sleep(3000);
			util.check_Broken_Links();
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println("some error occured while runing the code ");
			e.printStackTrace();
		}

	}
	
	
	@Test(priority = 3)
	public void Verify_AgentsPageHeaderTest() throws Exception {
		StatsHomePage LoginpageTest = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
		page.getInstance(FirmsPage.class).ClickOnFirmsModule();
		Thread.sleep(3000);
		String FirmsPageHeaderTest=page.getInstance(FirmsPage.class).firmsPageHeader();
		String FirmPageHeader = "Agents";
		Assert.assertEquals(FirmsPageHeaderTest, FirmPageHeader);

	}
	
	@Test(priority =4 )
	public void verify_ViewTab_In_FirmPage() throws Exception {
		StatsHomePage LoginpageTest2 = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
		page.getInstance(FirmsPage.class).ClickOnFirmsModule();
		Thread.sleep(3000);
       page.getInstance(FirmsPage.class).firm_View_Tab();
		
	}	
	
	
	
	@Test(priority =5)
	public void verify_CompanyName_InFirmPage() throws Exception {
		StatsHomePage LoginpageTest2 = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
		page.getInstance(FirmsPage.class).ClickOnFirmsModule();
		Thread.sleep(3000);
		page.getInstance(FirmsPage.class).firm_company_Tab();
	}
	
	
	@Test(priority =6)
	public void verify_AddressTab_InFirmPage() throws Exception {
		StatsHomePage LoginpageTest2 = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
		page.getInstance(FirmsPage.class).ClickOnFirmsModule();
		Thread.sleep(3000);
		page.getInstance(FirmsPage.class).firm_address_Tab();
	}
	
	@Test(priority =7)
	public void verify_CityTab_InFirmPage() throws Exception {
		StatsHomePage LoginpageTest2 = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
		page.getInstance(FirmsPage.class).ClickOnFirmsModule();
		Thread.sleep(3000);
		page.getInstance(FirmsPage.class).firm_city_Tab();
	}
	
	@Test(priority =8)
	public void verify_StateTab_InFirmPage() throws Exception {
		StatsHomePage LoginpageTest2 = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
		page.getInstance(FirmsPage.class).ClickOnFirmsModule();
		Thread.sleep(3000);
		page.getInstance(FirmsPage.class).firm_state_Tab();
	}

	@Test(priority =9)
	public void verify_PhoneTab_InFirmPage() throws Exception {
		StatsHomePage LoginpageTest2 = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
		page.getInstance(FirmsPage.class).ClickOnFirmsModule();
		Thread.sleep(3000);
		page.getInstance(FirmsPage.class).firm_phone_Tab();
	}

	
	@Test(priority =10)
	public void verify_WebSiteTab_InFirmPage() throws Exception {
		StatsHomePage LoginpageTest2 = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
		page.getInstance(FirmsPage.class).ClickOnFirmsModule();
		Thread.sleep(3000);
		page.getInstance(FirmsPage.class).firm_Website_Tab();
		
	}

	
	
	
	
	
	
	
	
}
