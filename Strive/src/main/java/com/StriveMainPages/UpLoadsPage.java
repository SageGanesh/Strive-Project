package com.StriveMainPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpLoadsPage extends StriveBasePage{

	public UpLoadsPage(WebDriver driver) {
		super(driver);
	}

	
	By UpLoadsButton=By.xpath("//*[@id=\"react-root\"]/div/div/div[1]/ul/li[11]/div/a/span");
	By BrowseButton=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div/div/button");
	By UpLoadsPageHeader=By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]");
	
	
	
	
	
	public UpLoadsPage ClickOnUpLoadsButton() {
		WebElement ClickOnUploadsButton=getElement(UpLoadsButton);
		ClickOnUploadsButton.click();
		return getInstance(UpLoadsPage.class);	
	}
	
	public String UploadsPageHeader() {
		String UploadsPageHead=getPageHeader(UpLoadsPageHeader);
		System.out.println("the uploads page header is " + UploadsPageHead);
		return UploadsPageHead;
		
	}
	
	public void ClickOnBrowseButton() throws Throwable {
		
		WebElement BrowseButton=driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[1]/ul/li[11]/div/a/span"));
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("arguments[0].scrollIntoView(true);", BrowseButton);
		  Thread.sleep(3000);
		  BrowseButton.click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div/div/button")).click();
		// Find file input element
			//WebElement inputelement = driver.findElement(By.cssSelector("input[type='file']"));

			// Make sure element is visible
			//((JavascriptExecutor) driver).executeScript("arguments[0].style.display = 'block';", inputelement);

			// Specify you local file path here
			//inputelement.sendKeys("");
			   
		  try {
			  
	          StringSelection ss = new StringSelection("C:\\Users\\Ganesh\\Downloads\\STNL_Comps");
	          
	          Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	          // paste file path in windows pop-up
	          Robot robot = new Robot();
	          
	          robot.delay(2000);
	          
	          robot.keyPress(KeyEvent.VK_CONTROL);
	          
	          robot.keyPress(KeyEvent.VK_V);
	          
	          robot.keyRelease(KeyEvent.VK_V);
	          
	          robot.keyRelease(KeyEvent.VK_CONTROL);
	          
	          robot.keyPress(KeyEvent.VK_ENTER);
	          
	          robot.keyRelease(KeyEvent.VK_ENTER);
	          
	          Thread.sleep(3000);
	          driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div/div/button")).click();
	          
	      } catch (AWTException e) {
	          e.printStackTrace();
	    
	  }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
