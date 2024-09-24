package com.TestClassExecutionPACK;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.StriveMainPages.LendersPage;
import com.StriveMainPages.StatsHomePage;
import com.StriveMainPages.StriveLogin;
import com.StriveMainPages.UpLoadsPage;

public class UpLoadsPageTest extends BaseTest {

	
	
	
	@Test(priority = 1)
	public void verify_UpLoadspage_Title_Test() throws Exception {
		StatsHomePage LoginpageTest = page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		page.getInstance(UpLoadsPage.class).ClickOnUpLoadsButton();
		Thread.sleep(3000);
		String UploadsPageTitleTest = page.getInstance(UpLoadsPage.class).getpageTitle();
		System.out.println("The uploads page title is " + UploadsPageTitleTest);
		Assert.assertEquals(UploadsPageTitleTest, "STRIVE");

	}

	@Test(priority = 2)
	public void Verify_linksInUploadsPageTest() throws IOException {

		try {
			StatsHomePage LoginpageTest = page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
			Thread.sleep(3000);
			page.getInstance(UpLoadsPage.class).ClickOnUpLoadsButton();
				Thread.sleep(3000);
			util.check_Broken_Links();
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println("some error occured while runing the code ");
			e.printStackTrace();
		}

	}
	
	
	@Test(priority = 3)
	public void Verify_UploadsPageHeaderTest() throws Exception {
		StatsHomePage LoginpageTest = page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		page.getInstance(UpLoadsPage.class).ClickOnUpLoadsButton();
		Thread.sleep(3000);
		String UpLoadsPageHeaderTest=page.getInstance(UpLoadsPage.class).UploadsPageHeader();
		String LendersPageHeader = "Upload .csv file";
		Assert.assertEquals(UpLoadsPageHeaderTest, LendersPageHeader);

	}
	
	@Test(priority =4 )
	public void verify_that_Is_Uploads_Of_CSV_File_is_Successful_In_UpLoadsPage() throws Throwable {
		StatsHomePage LoginpageTest = page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		page.getInstance(UpLoadsPage.class).ClickOnUpLoadsButton();
		Thread.sleep(3000);
		page.getInstance(UpLoadsPage.class).ClickOnBrowseButton();
		
	}	
	
	
	
	
	
	
	
}
