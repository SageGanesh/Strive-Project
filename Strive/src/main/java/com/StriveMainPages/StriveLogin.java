package com.StriveMainPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StriveLogin extends StriveBasePage{

	public StriveLogin(WebDriver driver) {
		super(driver);
		
	}
	
	
	
	
	private By username=By.name("username");
	private By password=By.name("password");
	private By loginButton=By.xpath("//button[text()='Login']");
	private By header=By.xpath("//div[@class='Header_quote']");
	/**
	 * @return the username
	 */
	public WebElement getUsername() {
		return getElement(username);
		 }
	
public WebElement getPassword() {
		return getElement(password);
	}
	
	public WebElement getLoginButton() {
		return getElement(loginButton);
	}
	
	public WebElement getHeader() {
		return getElement(header);
	}
	
	public String getLoginPageTitle() {
		return getpageTitle();
	}
	
	public String getLoginPageHeader() {
		return getPageHeader(header);
	}
	
	
	
	public StatsHomePage DoLoginPage(String user, String pass) {
		
		getUsername().sendKeys(user);
		getPassword().sendKeys(pass);
		getLoginButton().click();
		
		return getInstance(StatsHomePage.class);
		
	}
	
	
	

}
