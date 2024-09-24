package com.TestClassExecutionPACK;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.StriveMainPages.AgentsPage;
import com.StriveMainPages.BuyerTab;
import com.StriveMainPages.StatsHomePage;
import com.StriveMainPages.StriveLogin;

public class AgentsPageTest extends BaseTest{
	
	
	
	@Test(priority = 1)
	public void verify_AgentsPage_Title_Test() throws Exception {
		StatsHomePage LoginpageTest = page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		page.getInstance(AgentsPage.class).clickOnAgentbutton();
		Thread.sleep(3000);
		String AgentsPageTitleTest = page.getInstance(AgentsPage.class).getpageTitle();
		System.out.println("The Agents page title is " + AgentsPageTitleTest);
		Assert.assertEquals(AgentsPageTitleTest, "STRIVE");

	}

	@Test(priority = 2)
	public void Verify_linksInAgentsPageTest() throws IOException {

		try {
			StatsHomePage LoginpageTest = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
			Thread.sleep(3000);
			page.getInstance(AgentsPage.class).clickOnAgentbutton();
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
		page.getInstance(AgentsPage.class).clickOnAgentbutton();
		Thread.sleep(3000);
		boolean AgentsPageHeadingTest = page.getInstance(AgentsPage.class).Agents_Heading();
		String AgentsPageHeadTest = "Agents";
		Assert.assertEquals(AgentsPageHeadingTest, AgentsPageHeadTest);

	}
	
	@Test(priority =4 )
	public void verify_viewTab_In_AgentsPage() throws Exception {
		StatsHomePage LoginpageTest2 = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
		page.getInstance(AgentsPage.class).clickOnAgentbutton();
		Thread.sleep(3000);
       page.getInstance(AgentsPage.class).Agent_viewTab();
		
	}	
	
	@Test(priority =5)
	public void verify_FirstNameTab_In_AgentsPage() throws Exception {
		StatsHomePage LoginpageTest2 = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
		page.getInstance(AgentsPage.class).clickOnAgentbutton();
		Thread.sleep(3000);
        page.getInstance(AgentsPage.class).Agent_FirstName();
		
	}	
	
	@Test(priority =6)
	public void verify_LastNameTab_In_AgentsPage() throws Exception {
		StatsHomePage LoginpageTest2 = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
		page.getInstance(AgentsPage.class).clickOnAgentbutton();
		Thread.sleep(3000);
      page.getInstance(AgentsPage.class).Agent_LastName();
		
	}	
	
	
	@Test(priority =7)
	public void verify_EmailTab_In_AgentsPage() throws Exception {
		StatsHomePage LoginpageTest2 = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
		page.getInstance(AgentsPage.class).clickOnAgentbutton();
		Thread.sleep(3000);
         page.getInstance(AgentsPage.class).Agent_Email();
		
	}	
	
	
	@Test(priority =8)
	public void verify_WorkPhoneNumTab_In_AgentsPage() throws Exception {
		StatsHomePage LoginpageTest2 = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
		page.getInstance(AgentsPage.class).clickOnAgentbutton();
		Thread.sleep(3000);
      page.getInstance(AgentsPage.class).Agent_WorkPhoneNum();
		
	}	
	
	@Test(priority =9)
	public void verify_cellPhoneTab_In_AgentsPage() throws Exception {
		StatsHomePage LoginpageTest2 = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
		page.getInstance(AgentsPage.class).clickOnAgentbutton();
		Thread.sleep(3000);
       page.getInstance(AgentsPage.class).Agent_CellPhoneNum();
		
	}	
	
	@Test(priority =10)
	public void verify_FirmTab_In_AgentsPage() throws Exception {
		StatsHomePage LoginpageTest2 = page.getInstance(StriveLogin.class).DoLoginPage("gganesh", "Asdf1234!");
		page.getInstance(AgentsPage.class).clickOnAgentbutton();
		Thread.sleep(3000);
        page.getInstance(AgentsPage.class).Agent_Firm();
		
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
