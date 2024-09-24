package com.TestClassExecutionPACK;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.StriveMainPages.StatsHomePage;
import com.StriveMainPages.StriveLogin;

public class StatsHomePageTest extends BaseTest {

	
	
	@Test(priority = 1)
	public void verify_StatsHomePage_Title_Test() {
		StatsHomePage homepage1=page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		String Stat_Homepage_Title_test = page.getInstance(StatsHomePage.class).getStatsHomePageTitle();
		System.out.println("the statshome page title is " + Stat_Homepage_Title_test);
		Assert.assertEquals(Stat_Homepage_Title_test, "STRIVE");
		
}
	
	@Test(priority = 2)
	public void Verify_linksInStatsHomePageTest() throws IOException {
		
		try {
			StatsHomePage homepage2=page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
				Thread.sleep(3000);
			util.check_Broken_Links();
			
			} catch (Exception e) {
			
			e.printStackTrace();
		}
}

	@Test(priority = 3)
	public void Verify_StatsHomePageHeaderTest() {
		StatsHomePage homepage3=page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		String StatsHomepageHeader = page.getInstance(StatsHomePage.class).getStatsPageHeader();
		System.out.println("the stats_home page header is " + StatsHomepageHeader);
		Assert.assertEquals(StatsHomepageHeader,
				"Stats");

	}

	@Test(priority = 4)
	public void verify_closing_header_Stats_homepageTest() {
		StatsHomePage homepage4=page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		String closing_header_StatsHomepage = page.getInstance(StatsHomePage.class).closing_header_Stats_homepage();
		System.out.println("the closing header in the Stats page is" + closing_header_StatsHomepage);
		Assert.assertEquals(closing_header_StatsHomepage, "Closings - YTD");
	}

	@Test(priority = 5)
	public void Verify_ListedProperties_header_Stats_homepage() {
		StatsHomePage homepage5=page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		String ListedProperties_header_Stats_homepage = page.getInstance(StatsHomePage.class)
		.ListedProperties_header_Stats_homepage();
		System.out.println("the closing header in the Stats page is" + ListedProperties_header_Stats_homepage);
		Assert.assertEquals(ListedProperties_header_Stats_homepage, "Listed Properties");
	}

	@Test(priority = 6)
	public void Verify_CurrentInventory_Statshomepageheader() {
		StatsHomePage homepage6=page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		String CurrentInventory_Statshomepageheader = page.getInstance(StatsHomePage.class)
				.CurrentInventory_Statshomepageheader();
		System.out.println("the CurrentInventory in the Stats page is" + CurrentInventory_Statshomepageheader);
		Assert.assertEquals(CurrentInventory_Statshomepageheader, "Current Inventory");
	}

	@Test(priority = 7)
	public void Verify_BSB_Statshomepageheader() {
		StatsHomePage homepage7=page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		String BSB_Statshomepageheader = page.getInstance(StatsHomePage.class).BSB_Statshomepageheader();
		System.out.println("the Buyer State in the Stats page is" + BSB_Statshomepageheader);
		Assert.assertEquals(BSB_Statshomepageheader, "Buyer State Breakdown");
	}

	@Test(priority = 8)
	public void Verify_TUCINStatshomepageheader() {
		StatsHomePage homepage8=page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		String TUCINStatshomepageheader = page.getInstance(StatsHomePage.class).TUCINStatshomepageheader();
		System.out.println("the closing header in the Stats page is" + TUCINStatshomepageheader);
		Assert.assertEquals(TUCINStatshomepageheader, "Total Under Contract/In Negotiation");
	}
	
	
}
