package com.StriveMainPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StriveUtility {
	
	
	
	TakesScreenshot ts;

	WebDriver driver;

	public StriveUtility(WebDriver driver) {
		this.driver=driver;
		
	}

	public String  ScreenShot(String filename) {

		try {

			ts = (TakesScreenshot) driver;
			File fname = ts.getScreenshotAs(OutputType.FILE);
			File destination=new File("./Html_Reports/ScreenShots/" + filename + ".jpeg");
			String absolutepath=destination.getCanonicalPath();
            FileUtils.copyFile(fname,destination);
					
            return absolutepath;
            
            
		} catch (Exception e) {

			e.printStackTrace();

		}
		return filename;
		
	}

	// Function to Make border
	public void MakeBorder(WebElement Element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border = '3px solid red'", Element);

	}
	
	
	 public void uploadFileWithRobot (String imagePath) {
		 
	        StringSelection stringSelection = new StringSelection(imagePath);
	        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	        clipboard.setContents(stringSelection, null);
	        Robot robot = null;
	        try {
	            robot = new Robot();
	        } catch (AWTException e) {
	            e.printStackTrace();
	        }
	        robot.delay(250);
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.keyRelease(KeyEvent.VK_ENTER);
	        robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_V);
	        robot.keyRelease(KeyEvent.VK_V);
	        robot.keyRelease(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.delay(150);
	        robot.keyRelease(KeyEvent.VK_ENTER);
	        
	    }
	

	 public void check_Broken_Links() {
		  List<WebElement> linksList=driver.findElements(By.tagName("a"));
		    linksList.addAll(driver.findElements(By.tagName("img")));
			System.out.println("The number of links available  " + linksList.size());
			List<WebElement>  activeLinkList=new ArrayList<WebElement>();
			// iterate the linkList and exclude the links which doesn,t have the href property.
			for(int i=0; i<linksList.size(); i++) {
				if(linksList.get(i).getAttribute("href")!=null && (! linksList.get(i).getAttribute("href").contains("javascript"))) {
					activeLinkList.add(linksList.get(i));
				}
			}
		// printing the active link list which have the "href" property.
			System.out.println("the size of the activelinkslist in the statspage is " +activeLinkList.size());
			
					//check the href url, with httpconnection api
			
					for(int j=0;j<activeLinkList.size();j++) {
						HttpURLConnection connection = null;
						try {
							connection = (HttpURLConnection)new URL(activeLinkList.get(j).getAttribute("href")).openConnection();
						} catch (MalformedURLException e) {
							
							e.printStackTrace();
						} catch (IOException e) {
							
							e.printStackTrace();
						}
						try {
							connection.connect();
						} catch (IOException e) {
							
							e.printStackTrace();
						}
					String response = null;
					try {
						response = connection.getResponseMessage();
					int statusCode=	connection.getResponseCode();
					if(statusCode==200) {
						System.out.println("the link is working fine : " + statusCode);
					}else
					{
						System.out.println("the link is broken : " + statusCode);
					}
					} catch (IOException e) {
						
						e.printStackTrace();
					}
					connection.disconnect();
					System.out.println(activeLinkList.get(j).getAttribute("href") + "--------->" +response);
					
					}
					
					}
			
	 }

