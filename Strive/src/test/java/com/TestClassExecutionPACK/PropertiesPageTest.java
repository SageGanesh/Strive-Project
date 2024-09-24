package com.TestClassExecutionPACK;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.StriveMainPages.AddNewPropertyPageStrive;
import com.StriveMainPages.StatsHomePage;
import com.StriveMainPages.StriveLogin;
import com.StriveMainPages.StrivePropertiesPage;

public class PropertiesPageTest extends BaseTest{
	
	
	StrivePropertiesPage pg;
	
	
	@Test(priority = 1)
	public void verify_propertiesPage_Title_Test() throws Exception {
		StatsHomePage LoginpageTest=page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		StrivePropertiesPage PropertiesPage1= page.getInstance(StrivePropertiesPage.class).clickonPropertiesPageLink();
		Thread.sleep(3000);
		String PropertiesPageTitleTest=page.getInstance(StrivePropertiesPage.class).PropertiesHomePageTitle();
		System.out.println("the properties page title is " + PropertiesPageTitleTest);
		Assert.assertEquals(PropertiesPageTitleTest, "STRIVE");

	}
	
	@Test(priority = 2)
	public void Verify_linksInpropertiesPageTest() throws IOException {
		
		try {
			StatsHomePage LoginpageTest2=page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
			StrivePropertiesPage PropertiesPage2 = page.getInstance(StrivePropertiesPage.class).clickonPropertiesPageLink();
			Thread.sleep(3000);
			util.check_Broken_Links();
			Thread.sleep(3000);
		} catch (Exception e) {
			
			System.out.println("some error occured while runing the code ");
			e.printStackTrace();
		}
		 
		
	}


	@Test(priority = 3)
	public void Verify_PropertiesPageHeaderTest() throws Exception {
		StatsHomePage LoginpageTest3=page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		StrivePropertiesPage PropertiesPage3 = page.getInstance(StrivePropertiesPage.class).clickonPropertiesPageLink();
		Thread.sleep(3000);
		String PropertiesHomepageHeader = page.getInstance(StrivePropertiesPage.class).PropertiespageHeader();
		System.out.println("the login page header is " + PropertiesHomepageHeader);
		Assert.assertEquals(PropertiesHomepageHeader,
				"\"STRIVE not to be a success, but rather to be of value.\" - Albert Einstein");

	}

	@Test(priority = 4)
	public void verify_propertiespage_headerTest() throws Exception {
		StatsHomePage LoginpageTest4=page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		StrivePropertiesPage PropertiesPage4 = page.getInstance(StrivePropertiesPage.class).clickonPropertiesPageLink();
		Thread.sleep(3000);
		String PropertiesHomepageHeaderTest = page.getInstance(StrivePropertiesPage.class).PropertiespageHeader();
		System.out.println("the propertiesPage" + PropertiesHomepageHeaderTest);
		Assert.assertEquals(PropertiesHomepageHeaderTest, "Properties");
	}

	@Test(priority = 5)
	public void Verify_PropertiesPage__scrollLast() throws Exception {
		StatsHomePage LoginpageTest5=page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		StrivePropertiesPage PropertiesPage5 = page.getInstance(StrivePropertiesPage.class).clickonPropertiesPageLink();
		Thread.sleep(3000);
		page.getInstance(StrivePropertiesPage.class).ScrollDownThePropertiesPage();
		
	}

	@Test(priority = 6)
	public void Verify_PropertiesPage_ScrollUp() throws Exception {
		StatsHomePage LoginpageTest5=page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		StrivePropertiesPage PropertiesPage5 = page.getInstance(StrivePropertiesPage.class).clickonPropertiesPageLink();
		Thread.sleep(3000);
	page.getInstance(StrivePropertiesPage.class).ScrollUpThePropertiesPage();
	
	}

	@Test(priority = 7)
	public void CheckWhetherAbleToTakeScreenShot() throws Exception {
		StatsHomePage LoginpageTest5=page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		StrivePropertiesPage PropertiesPage5 = page.getInstance(StrivePropertiesPage.class).clickonPropertiesPageLink();
		Thread.sleep(3000);
page.getInstance(StrivePropertiesPage.class).takeScreenShotOfPropertiesPage();
		
}

	@Test(priority = 8)
	public void Verify_PropertiesPageStatusCol() throws Exception {
		StatsHomePage LoginpageTest5=page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		StrivePropertiesPage PropertiesPage5 = page.getInstance(StrivePropertiesPage.class).clickonPropertiesPageLink();
		Thread.sleep(3000);
    page.getInstance(StrivePropertiesPage.class).Properties_StatusColumn();
		
	}
	
	@Test(priority = 9)
	public void Verify_PropertiesPageAgentCol() throws Exception {
		StatsHomePage LoginpageTest5=page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		StrivePropertiesPage PropertiesPage5 = page.getInstance(StrivePropertiesPage.class).clickonPropertiesPageLink();
		Thread.sleep(3000);
    page.getInstance(StrivePropertiesPage.class).Properties_AgentColumn();
		
	}
	
	@Test(priority = 10)
	public void Verify_PropertiesPageCategoryCol() throws Exception {
		StatsHomePage LoginpageTest5=page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		StrivePropertiesPage PropertiesPage5 = page.getInstance(StrivePropertiesPage.class).clickonPropertiesPageLink();
		Thread.sleep(3000);
    page.getInstance(StrivePropertiesPage.class).Properties_CategoryColumn();
		
	}
	
	@Test(priority = 11)
	public void Verify_PropertiesPageNameCol() throws Exception {
		StatsHomePage LoginpageTest5=page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		StrivePropertiesPage PropertiesPage5 = page.getInstance(StrivePropertiesPage.class).clickonPropertiesPageLink();
		Thread.sleep(3000);
    page.getInstance(StrivePropertiesPage.class).Properties_NameColumn();
		
	}
	
	@Test(priority = 12)
	public void Verify_PropertiesPageCityCol() throws Exception {
		StatsHomePage LoginpageTest5=page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		StrivePropertiesPage PropertiesPage5 = page.getInstance(StrivePropertiesPage.class).clickonPropertiesPageLink();
		Thread.sleep(3000);
    page.getInstance(StrivePropertiesPage.class).Properties_CityColumn();
		
	}
	
	@Test(priority = 13)
	public void Verify_PropertiesPageStateCol() throws Exception {
		StatsHomePage LoginpageTest5=page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		StrivePropertiesPage PropertiesPage5 = page.getInstance(StrivePropertiesPage.class).clickonPropertiesPageLink();
		Thread.sleep(3000);
    page.getInstance(StrivePropertiesPage.class).Properties_StateColumn();
		
	}
	
	
	@Test(priority = 14)
     public void takeScreenShotOfPropertiesPages() throws Exception {
		StatsHomePage LoginpageTest5=page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		StrivePropertiesPage PropertiesPage5 = page.getInstance(StrivePropertiesPage.class).clickonPropertiesPageLink();
		Thread.sleep(3000);
		pg=new StrivePropertiesPage(driver);
		pg.takeScreenShotOfPropertiesPage();
		
	}
	
	
	@Test(priority = 15)
	public AddNewPropertyPageStrive AddNewProperty() throws Exception {
		StatsHomePage LoginpageTest5=page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		StrivePropertiesPage PropertiesPage5 = page.getInstance(StrivePropertiesPage.class).clickonPropertiesPageLink();
		Thread.sleep(3000);
		pg=new StrivePropertiesPage(driver);
		return page.getInstance(AddNewPropertyPageStrive.class).AddNewPropertyPage();            
		
	}
	

}
