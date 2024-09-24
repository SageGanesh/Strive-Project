package com.TestClassExecutionPACK;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.StriveMainPages.AddNewPropertyPageStrive;
import com.StriveMainPages.StatsHomePage;
import com.StriveMainPages.StriveLogin;
import com.StriveMainPages.StrivePropertiesPage;

public class AddNewPropertyPageStriveTest extends BaseTest{

	
	
	@Test(priority=1, dataProvider="AddNewPropertyPageData", description="filling the add new property page data with valid and invalid data to validate the scenario")
	public void Verify_AddNewPropertyPageTest(String PropertyName,String Address,String city,String State,String zipCode,String YearBuilt,String SquareFeet) throws Throwable {
		StatsHomePage LoginTest1=page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
		StrivePropertiesPage clickingOnPropertiesPageTest2 = page.getInstance(StrivePropertiesPage.class).clickonPropertiesPageLink();
		Thread.sleep(6000);
		AddNewPropertyPageStrive AddNewPropertyPageStriveheader=	page.getInstance(AddNewPropertyPageStrive.class).AddNewPropertyPage();
		Thread.sleep(6000);
	page.getInstance(AddNewPropertyPageStrive.class).fillingTheDataInAddNewPropertytab(PropertyName, Address, city, State, zipCode, YearBuilt, SquareFeet);
	Thread.sleep(6000);
	
 }
	
	@org.testng.annotations.DataProvider(name="AddNewPropertyPageData")
    public  String[][]  FillingTheDataInAddNewPropertyPage() {
    	
		String  NewPropertyPageData[][]= {
    			
   		{"GaneshAutomationLabs","1818 El Capitan Dr","Dallas","California","501301","2020","50"},
    			{"  ","   ","	   ","   ","   ","  ","   "},
    			{"123456","%^^","	1233654","%^","PPOOII","^%","^%"}
    					
    };
    	return NewPropertyPageData;
    	
    }

@Test(priority=2)
public void verify_AddNewPropertyTitle_Title_Test() throws Exception
{
	StatsHomePage LoginTest3=page.getInstance(StriveLogin.class).DoLoginPage("gganesh","Asdf1234!");
	StrivePropertiesPage clickingOnPropertiesPageTest3 = page.getInstance(StrivePropertiesPage.class).clickonPropertiesPageLink();
	Thread.sleep(3000);
	AddNewPropertyPageStrive AddNewPropertyPageStriveheader=	page.getInstance(AddNewPropertyPageStrive.class).AddNewPropertyPage();
	String AddNewPropertyTitle=page.getInstance(AddNewPropertyPageStrive.class).getpageTitle();
	System.out.println("the login page title is : " + AddNewPropertyTitle);
	Assert.assertEquals(AddNewPropertyTitle, "STRIVE");	
   
}

	
}
