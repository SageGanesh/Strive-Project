package com.TestClassExecutionPACK;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.StriveMainPages.FirmsPage;
import com.StriveMainPages.StatsHomePage;
import com.StriveMainPages.StriveLogin;
import com.StriveMainPages.Tenants;

public class TenantsPageTest extends BaseTest{
	
	
	@Test(priority = 1)
	public void verify_TenantsPage_Title_Test() throws Exception {
		StatsHomePage LoginpageTest = page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		page.getInstance(Tenants.class).ClickOnTenantsModule();
		Thread.sleep(3000);
		String TenantsPageTitleTest = page.getInstance(Tenants.class).getpageTitle();
		System.out.println("The Firms page title is " + TenantsPageTitleTest);
		Assert.assertEquals(TenantsPageTitleTest, "STRIVE");

	}

	@Test(priority = 2)
	public void Verify_linksInAgentsPageTest() throws IOException {

		try {
			StatsHomePage LoginpageTest = page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
			Thread.sleep(3000);
			page.getInstance(Tenants.class).ClickOnTenantsModule();
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
		StatsHomePage LoginpageTest = page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		page.getInstance(Tenants.class).ClickOnTenantsModule();
		Thread.sleep(3000);
		String TenantsPageHeaderTest=page.getInstance(Tenants.class).TenantsPageHeader();
		String TenantsPageHeader = "TENANTS";
		Assert.assertEquals(TenantsPageHeaderTest, TenantsPageHeader);

	}
	
	@Test(priority =4 )
	public void verify_ViewTab_In_TenantsPage() throws Exception {
		StatsHomePage LoginpageTest2 = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
		page.getInstance(Tenants.class).ClickOnTenantsModule();
		Thread.sleep(3000);
       page.getInstance(Tenants.class).Tenants_View_Tab();
		
	}	
	
	
	
	@Test(priority =5)
	public void verify_TenantsTab_In_TenantsPage() throws Exception {
		StatsHomePage LoginpageTest2 = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
		page.getInstance(Tenants.class).ClickOnTenantsModule();
		Thread.sleep(3000);
       page.getInstance(Tenants.class).Tenants_Tab();
		
	}	
	
	@Test(priority =6)
	public void verify_Scrolldown_In_TenantsPage() throws Exception {
		StatsHomePage LoginpageTest2 = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
		page.getInstance(Tenants.class).ClickOnTenantsModule();
		Thread.sleep(3000);
       page.getInstance(Tenants.class).ScrollDownTheTenantsPage();
		
	}	
	
	
	@Test(priority =7)
	public void verify_ScrollUp_In_TenantsPage() throws Exception {
		StatsHomePage LoginpageTest2 = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
		page.getInstance(Tenants.class).ClickOnTenantsModule();
		Thread.sleep(3000);
       page.getInstance(Tenants.class).ScrollUpTheTenantsPage();
		
	}	
	
	
	
	
	
	
	
	

}
