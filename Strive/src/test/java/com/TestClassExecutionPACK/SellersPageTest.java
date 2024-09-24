package com.TestClassExecutionPACK;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.StriveMainPages.SellerPage;
import com.StriveMainPages.StatsHomePage;
import com.StriveMainPages.StriveLogin;
import com.StriveMainPages.TeamMembers;

public class SellersPageTest extends BaseTest {

	
	
	
	
	@Test(priority = 1)
	public void verify_SellersPage_Title_Test() throws Exception {
		StatsHomePage LoginpageTest = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
		page.getInstance(SellerPage.class).clickOnSellerbutton();
		Thread.sleep(3000);
		String SellersPageTitleTest = page.getInstance(SellerPage.class).SellerPage_Title_Test();
		System.out.println("The Seller page title is " + SellersPageTitleTest);
		Assert.assertEquals(SellersPageTitleTest, "STRIVE");

	}

	@Test(priority = 2)
	public void Verify_linksInSellersPageTest() throws IOException {

		try {
			StatsHomePage LoginpageTest2 = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
			Thread.sleep(3000);
			page.getInstance(SellerPage.class).clickOnSellerbutton();
			Thread.sleep(3000);
			util.check_Broken_Links();
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println("some error occured while runing the code ");
			e.printStackTrace();
		}

	}

	@Test(priority = 3)
	public void Verify_SellersPageHeaderTest() throws Exception {
		StatsHomePage LoginpageTest2 = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
		page.getInstance(SellerPage.class).clickOnSellerbutton();
		Thread.sleep(3000);
		boolean sellersPageHeadingTest = page.getInstance(SellerPage.class).Sellers_Heading();
		String SellersPageHeading = "Sellers";
		Assert.assertEquals(sellersPageHeadingTest, SellersPageHeading);

	}

	@Test(priority = 4)
	public void Verify_SellersViewTabTest() throws Exception {
		StatsHomePage LoginpageTest2 = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
		page.getInstance(SellerPage.class).clickOnSellerbutton();
		Thread.sleep(3000);

		boolean sellersPageViewTabTest = page.getInstance(SellerPage.class).Seller_viewTab();
		String SellersPageviewTab = "View";
		Assert.assertEquals(sellersPageViewTabTest, SellersPageviewTab);

	}

	@Test(priority = 5)
	public void Verify_SellersStatusTabTest() throws Exception {
		StatsHomePage LoginpageTest2 = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
		page.getInstance(SellerPage.class).clickOnSellerbutton();
		Thread.sleep(3000);

		boolean sellersPageStatusTabTest = page.getInstance(SellerPage.class).Seller_StatusTab();
		String SellersPageStatusTab = "Status";
		Assert.assertEquals(sellersPageStatusTabTest, SellersPageStatusTab);

	}

	@Test(priority = 6)
	public void Verify_SellersFirstNameTabTest() throws Exception {
		StatsHomePage LoginpageTest2 = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
		page.getInstance(SellerPage.class).clickOnSellerbutton();
		Thread.sleep(3000);

		boolean sellersPageFirstNameTabTest = page.getInstance(SellerPage.class).Seller_FirstName();
		String SellersPageFirstNameTab = "FIRST NAME";
		Assert.assertEquals(sellersPageFirstNameTabTest, SellersPageFirstNameTab);

	}

	@Test(priority = 7)
	public void Verify_SellersLastNameTabTest() throws Exception {
		StatsHomePage LoginpageTest2 = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
		page.getInstance(SellerPage.class).clickOnSellerbutton();
		Thread.sleep(3000);

		boolean sellersPageLastNameTabTest = page.getInstance(SellerPage.class).Seller_LastName();
		String SellersPageLastNameTab = "LAST NAME";
		Assert.assertEquals(sellersPageLastNameTabTest, SellersPageLastNameTab);

	}

	@Test(priority = 8)
	public void Verify_SellersEmailTabTest() throws Exception {
		StatsHomePage LoginpageTest2 = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
		page.getInstance(SellerPage.class).clickOnSellerbutton();
		Thread.sleep(3000);

		boolean sellersPageEmailTabTest = page.getInstance(SellerPage.class).Seller_Email();
		String SellersPageEmailTab = "EMAIL";
		Assert.assertEquals(sellersPageEmailTabTest, SellersPageEmailTab);

	}

	@Test(priority = 9)
	public void Verify_SellersPhoneNumTabTest() throws Exception {
		StatsHomePage LoginpageTest2 = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
		page.getInstance(SellerPage.class).clickOnSellerbutton();
		Thread.sleep(3000);
		
		boolean sellersPagePhoneNumTabTest = page.getInstance(SellerPage.class).Seller_PhoneNum();
		String SellersPagePhoneNumTab = "PHONE";
		Assert.assertEquals(sellersPagePhoneNumTabTest, SellersPagePhoneNumTab);

	}

	@Test(priority = 10)
	public void Verify_SellersCompanyNameTabTest() throws Exception {
		StatsHomePage LoginpageTest2 = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
		page.getInstance(SellerPage.class).clickOnSellerbutton();
		Thread.sleep(3000);
	
		boolean sellersPageCompanyNameTabTest = page.getInstance(SellerPage.class).Seller_Company_Name();
		String SellersPageCompanyNameTab = "COMPANY NAME";
		Assert.assertEquals(sellersPageCompanyNameTabTest, SellersPageCompanyNameTab);

	}

	@Test(priority =11)
	public void Verify_SellersPageScrollingdownTest() throws Exception {
		StatsHomePage LoginpageTest2 = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
		page.getInstance(SellerPage.class).clickOnSellerbutton();
		Thread.sleep(3000);
		page.getInstance(SellerPage.class).ScrollDownTheSellerPage();
		
	}

	@Test(priority = 12)
	public void Verify_SellersPageScrollUpTest() throws Exception {
		StatsHomePage LoginpageTest2 = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
		page.getInstance(SellerPage.class).clickOnSellerbutton();
		Thread.sleep(3000);
		page.getInstance(SellerPage.class).ScrollUpTheSellerPage();
		
}

	
	
	

	
	
}
