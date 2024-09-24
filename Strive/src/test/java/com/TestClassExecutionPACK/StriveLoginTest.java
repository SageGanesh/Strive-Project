package com.TestClassExecutionPACK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.StriveMainPages.StatsHomePage;
import com.StriveMainPages.StriveLogin;


public class StriveLoginTest extends BaseTest{
	
	
	@Test(priority=1)
	public void verify_loginpage_Title_Test()
	{
		String loginTitle=page.getInstance(StriveLogin.class).getLoginPageTitle();
		System.out.println("the login page title is : " + loginTitle);
		Assert.assertEquals(loginTitle, "STRIVE");	
		
 }
	
	@Test(priority=2)
	public void Verify_loginPageHeaderTest() {
	String loginpageHeader=	page.getInstance(StriveLogin.class).getLoginPageHeader();
	System.out.println("the login page header is : " + loginpageHeader);
	Assert.assertEquals(loginpageHeader, "\"STRIVE not to be a success, but rather to be of value.\" - Albert Einstein");
	
	}
	
	@Test(priority=3)
	public void verify_LoginpageTest(){
		StatsHomePage homepage=page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		String statshomepageheader=homepage.getStatsPageHeader();
		System.out.println("the header of the stats page is : " + statshomepageheader);
		Assert.assertEquals(statshomepageheader, "Stats");	
		
	}
	
	
/*
	@Test(priority=4)
	public void verify_LoginpageTest1(){
		StatsHomePage homepage=page.getInstance(StriveLogin.class).DoLoginPage("","");
		String statshomepageheader=homepage.getStatsPageHeader();
		System.out.println("the header of the stats page is " + statshomepageheader);
		Assert.assertEquals(statshomepageheader, "Stats");	
		
	}
	@Test(priority=5)
	public void verify_LoginpageTest(String name, String word,String click){
		StatsHomePage homepage=page.getInstance(StriveLogin.class).DoLoginPage("ffffufytfytfy","fhgfhfhgf!");
		String statshomepageheader=homepage.getStatsPageHeader();
		System.out.println("the header of the stats page is " + statshomepageheader);
		Assert.assertEquals(statshomepageheader, "Stats");	
		
	}
	
	*/
	
	
	
}
