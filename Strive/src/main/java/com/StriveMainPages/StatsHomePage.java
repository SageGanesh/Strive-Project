package com.StriveMainPages;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v109.page.Page;

public class StatsHomePage extends StriveBasePage{

	
	public StatsHomePage(WebDriver driver) {
		super(driver);
		}
	
	StriveBasePage  basePage;
	//div[text()='Stats' and @class='page-title']
	By Statshomepageheader=By.xpath("//div[text()='Stats' and @class='page-title']");
	By closing_header_Stats_homepage =By.xpath("//a[text()='Closings - YTD']");
	By ListedProperties_header_Stats_homepage =By.xpath("//a[text()='Listed Properties']");
	By CurrentInventory_Statshomepageheader=By.xpath("//a[text()='Current Inventory']");
	By BSB_Statshomepageheader=By.xpath("//a[text()='Buyer State Breakdown']");
    By TUCINStatshomepageheader=By.xpath("//a[text()='Total Under Contract/In Negotiation']");
	
	/*
	public WebElement getHeader() {
		return getElement(Statshomepageheader);
	}
	*/
    
    
	public String getStatsHomePageTitle() {
		return getpageTitle();
	}
	
public String getStatsPageHeader() {
	waitForElementPresent(Statshomepageheader);
		return getPageHeader(Statshomepageheader);
	}


public String   closing_header_Stats_homepage() {
	waitForElementPresent(closing_header_Stats_homepage);
	return getPageHeader(closing_header_Stats_homepage);
}

public String   ListedProperties_header_Stats_homepage() {
	waitForElementPresent(ListedProperties_header_Stats_homepage);
	return getPageHeader(ListedProperties_header_Stats_homepage);
}

public String   CurrentInventory_Statshomepageheader() {
	       waitForElementPresent(CurrentInventory_Statshomepageheader);
	return getPageHeader(CurrentInventory_Statshomepageheader);
}

public String   BSB_Statshomepageheader() {
	return getPageHeader(BSB_Statshomepageheader);
}

public String   TUCINStatshomepageheader() {
	waitForElementPresent(TUCINStatshomepageheader);
	return getPageHeader(TUCINStatshomepageheader);
}


public void clickOnPropertiesPage() {

}

		
		
	}
	
	
	












