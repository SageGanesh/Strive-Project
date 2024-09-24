package com.TestClassExecutionPACK;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.StriveMainPages.BuyerTab;
import com.StriveMainPages.SellerPage;
import com.StriveMainPages.StatsHomePage;
import com.StriveMainPages.StriveLogin;

public class BuyersTabTest extends BaseTest{
	
	
	
	@Test(priority = 1)
	public void verify_BuyersPage_Title_Test() throws Exception {
		StatsHomePage LoginpageTest = page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		page.getInstance(BuyerTab.class).ClickOnTheBuyerModule();
		Thread.sleep(3000);
		String BuyersPageTitleTest = page.getInstance(BuyerTab.class).getpageTitle();
		System.out.println("The Buyers page title is " + BuyersPageTitleTest);
		Assert.assertEquals(BuyersPageTitleTest, "STRIVE");

	}

	@Test(priority = 2)
	public void Verify_linksInSellersPageTest() throws IOException {

		try {
			StatsHomePage LoginpageTest = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
			Thread.sleep(3000);
			page.getInstance(BuyerTab.class).ClickOnTheBuyerModule();
			Thread.sleep(3000);
			util.check_Broken_Links();
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println("some error occured while runing the code ");
			e.printStackTrace();
		}

	}
	
	
	@Test(priority = 3)
	public void Verify_BuyersPageHeaderTest() throws Exception {
		StatsHomePage LoginpageTest = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
		page.getInstance(BuyerTab.class).ClickOnTheBuyerModule();
		Thread.sleep(3000);
		boolean BuyersPageHeadingTest = page.getInstance(BuyerTab.class).Buyers_Heading();
		String SellersPageHeading = "Buyers";
		Assert.assertEquals(BuyersPageHeadingTest, SellersPageHeading);

	}
	
	@Test(priority =4 )
	public void verify_viewTab_In_buyer() throws Exception {
		StatsHomePage LoginpageTest2 = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
		page.getInstance(BuyerTab.class).ClickOnTheBuyerModule();
		Thread.sleep(3000);
        boolean buyersPageViewTabTest = page.getInstance(BuyerTab.class).buyer_viewTab();
		String BuyersViewTab = "View";
		Assert.assertEquals(buyersPageViewTabTest, BuyersViewTab);

	}
	@Test(priority =5 )
	public void verify_Status_Tab_In_buyer() throws Exception {
		StatsHomePage LoginpageTest2 = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
		page.getInstance(BuyerTab.class).ClickOnTheBuyerModule();
		Thread.sleep(3000);
        boolean buyersPageStatusTabTest = page.getInstance(BuyerTab.class).buyer_Status();
		String BuyersStatusTab = "STATUS";
		Assert.assertEquals(buyersPageStatusTabTest, BuyersStatusTab);

	}
	
	@Test(priority =6 )
	public void verify_CategoryTab_In_buyer() throws Exception {
		StatsHomePage LoginpageTest2 = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
		page.getInstance(BuyerTab.class).ClickOnTheBuyerModule();
		Thread.sleep(3000);
        boolean buyersPageCategoryTabTest = page.getInstance(BuyerTab.class).buyer_Category();
		String BuyersCATEGORYTab = "CATEGORY";
		Assert.assertEquals(buyersPageCategoryTabTest, BuyersCATEGORYTab);

	}
	
	@Test(priority =7 )
	public void verify_TypeTab_In_buyer() throws Exception {
		StatsHomePage LoginpageTest2 = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
		page.getInstance(BuyerTab.class).ClickOnTheBuyerModule();
		Thread.sleep(3000);
        boolean buyersPageTypeTabTest = page.getInstance(BuyerTab.class).buyer_Type();
		String BuyersTypeTab = "TYPE";
		Assert.assertEquals(buyersPageTypeTabTest, BuyersTypeTab);

	}
	
		@Test(priority =8 )
		public void verify_SubCategoryTab_In_buyer() throws Exception {
			StatsHomePage LoginpageTest2 = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
			page.getInstance(BuyerTab.class).ClickOnTheBuyerModule();
			Thread.sleep(3000);
	        boolean buyersPageSubCategoryTabTest = page.getInstance(BuyerTab.class).buyer_SubCategory();
			String BuyerSubCategoryTab = "SUBCATEGORY";
			Assert.assertEquals(buyersPageSubCategoryTabTest, BuyerSubCategoryTab);
		}
	
		@Test(priority =9)
		public void verify_MarketTab_In_buyer() throws Exception {
			StatsHomePage LoginpageTest2 = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
			page.getInstance(BuyerTab.class).ClickOnTheBuyerModule();
			Thread.sleep(3000);
	        boolean buyersPageMarketTabTest = page.getInstance(BuyerTab.class).buyer_Market();
			String BuyersMarketTab = "MARKET";
			Assert.assertEquals(buyersPageMarketTabTest, BuyersMarketTab);
		
		}
		
		
		@Test(priority =10)
		public void verify_PriceTab_In_buyer() throws Exception {
			StatsHomePage LoginpageTest2 = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
			page.getInstance(BuyerTab.class).ClickOnTheBuyerModule();
			Thread.sleep(3000);
	        boolean buyersPagePriceTabTest = page.getInstance(BuyerTab.class).buyer_Price();
			String BuyersPriceTab = "PRICE";
			Assert.assertEquals(buyersPagePriceTabTest, BuyersPriceTab);
	
		}
		
		
		@Test(priority =11)
		public void verify_CapRateTab_In_buyer() throws Exception {
			StatsHomePage LoginpageTest2 = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
			page.getInstance(BuyerTab.class).ClickOnTheBuyerModule();
			Thread.sleep(3000);
	        boolean buyersPageCapRateTabTest = page.getInstance(BuyerTab.class).buyer_CapRate();
			String BuyersCapRateTab = "CAP RATE";
			Assert.assertEquals(buyersPageCapRateTabTest, BuyersCapRateTab);

			
		}
		
		
		@Test(priority =12)
		public void verify_FirstNameTab_In_buyer() throws Exception {
			StatsHomePage LoginpageTest2 = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
			page.getInstance(BuyerTab.class).ClickOnTheBuyerModule();
			Thread.sleep(3000);
	        boolean buyersPageFirstNameTabTest = page.getInstance(BuyerTab.class).buyer_FirstName();
			String BuyersFirstNameTab = "FIRST NAME";
			Assert.assertEquals(buyersPageFirstNameTabTest, BuyersFirstNameTab);

			
		}
		
		
		@Test(priority =13)
		public void verify_LastNameTab_In_buyer() throws Exception {
			StatsHomePage LoginpageTest2 = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
			page.getInstance(BuyerTab.class).ClickOnTheBuyerModule();
			Thread.sleep(3000);
	        boolean buyersPageLastNameTabTest = page.getInstance(BuyerTab.class).buyer_LastName();
			String BuyersLastNameTab = "LAST NAME";
			Assert.assertEquals(buyersPageLastNameTabTest, BuyersLastNameTab);

			
		}
		
		
		@Test(priority =14 )
		public void verify_EmailTab_In_buyer() throws Exception {
			StatsHomePage LoginpageTest2 = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
			page.getInstance(BuyerTab.class).ClickOnTheBuyerModule();
			Thread.sleep(3000);
	        boolean buyersPageEmailTabTest = page.getInstance(BuyerTab.class).buyer_Email();
			String BuyersEmailTab = "EMAIL";
			Assert.assertEquals(buyersPageEmailTabTest, BuyersEmailTab);

		}
	
	
	
		@Test(priority =15)
		public void verify_PhoneTab_In_buyer() throws Exception {
			StatsHomePage LoginpageTest2 = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
			page.getInstance(BuyerTab.class).ClickOnTheBuyerModule();
			Thread.sleep(3000);
	        boolean buyersPagePhoneTabTest = page.getInstance(BuyerTab.class).buyer_Phone();
			String BuyersPhoneTab = "PHONE";
			Assert.assertEquals(buyersPagePhoneTabTest, BuyersPhoneTab);

		}
	
		@Test(priority =16)
		public void verify_CompanyNameTab_In_buyer() throws Exception {
			StatsHomePage LoginpageTest2 = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
			page.getInstance(BuyerTab.class).ClickOnTheBuyerModule();
			Thread.sleep(3000);
	        boolean buyersPageCompanyNameTabTest = page.getInstance(BuyerTab.class).buyer_CompanyName();
			String BuyersCompanyNameTab = "COMPANY NAME";
			Assert.assertEquals(buyersPageCompanyNameTabTest, BuyersCompanyNameTab);

		}
	
		
		@Test(priority =17)
		public void verify_Agent_Tab_In_buyer() throws Exception {
			StatsHomePage LoginpageTest2 = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
			page.getInstance(BuyerTab.class).ClickOnTheBuyerModule();
			Thread.sleep(3000);
	        boolean buyersPageAgentTabTest = page.getInstance(BuyerTab.class).buyer_Agent();
			String BuyersAgentTab = "AGENT";
			Assert.assertEquals(buyersPageAgentTabTest, BuyersAgentTab);

		}
	
		
		@Test(priority =18)
		public void Verify_BuyersPageScrollingdownTest() throws Exception {
			StatsHomePage LoginpageTest2 = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
			page.getInstance(BuyerTab.class).ClickOnTheBuyerModule();
			Thread.sleep(3000);
			page.getInstance(BuyerTab.class).ScrollDownTheBuyerPage();
			
		}
	
		@Test(priority =19)
		public void Verify_BuyersPageScrollUpTest() throws Exception {
			StatsHomePage LoginpageTest2 = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
			page.getInstance(BuyerTab.class).ClickOnTheBuyerModule();
			Thread.sleep(3000);
			page.getInstance(BuyerTab.class).ScrollUpTheBuyerPage();
			
		}
	
	
	
	
	
	
	
	
	
	
	
	


}
