/**
 * 
 */
package com.myStore.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.myStore.utilsInterface.ElementUtilInterface;

/**
 * @author sumitshivhare
 *
 */
public class ElementUtil implements ElementUtilInterface {
	
	@Override
	public String getPageTitle(WebDriver driver) {
		try {
			System.out.println("Getting Page title");
			return driver.getTitle();
			
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
	
	@Override
	public boolean doSendKeys(WebElement ele, String text) {
		boolean flag = false;
		try {
			ele.sendKeys(text);
			flag = true;
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		finally {
			if(flag) {
				System.out.println("Send keys is performed");
			}
			else {
				System.out.println("Send keys is not performed");
			}
		}
	
	}
	
	@Override
	public boolean doClick(WebElement ele) {
			boolean flag = false;
			
			try {
				ele.click();
				flag = true;
				return true;
			} 
			catch (Exception e) {
				e.printStackTrace();
				return false;
			}
			finally {
				if(flag) {
					System.out.println("click action is preformed");
				}
				else {
					System.out.println("click action is not preformed");
				}
			}
	}
	
	
	@Override
	public boolean doIsDisplayed(WebElement ele) {
		boolean flag = false;
		
		try {
			if(ele.isDisplayed()) {
				flag = true;
				System.out.println("Element is displayed");
				return flag;
			}
			else {
				System.out.println("Element is not displayed");
				return false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	
	}
	
	
	@Override
	public boolean doClear(WebElement ele) {
		boolean flag = false;
		
		try {
			ele.clear();
			flag=true;
			return true;
			
		} catch (Exception e) {
			return false;
		}
		finally {
			if(flag) {
				System.out.println("Clear action is performed");
			}
			else {
				System.out.println("Clear action is not performed");
			}
		}
	}

	@Override
	public boolean doIsEnabled(WebElement ele) {
		boolean flag = false;
		try {
			
			if(ele.isEnabled()) {
				System.out.println("Element is Enabled");
				flag = true;
				return flag;
			}
			else {
				System.out.println("Element is not Enabled");
				return false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}


	@Override
	public boolean doIsSelected(WebElement ele) {
		boolean flag = false;
		try {
			if(ele.isSelected()) {
				System.out.println("Element is selected");
				flag = true;
				return flag;
			}
			else {
				System.out.println("Element is not selected");
				return false;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	
	}

	@Override
	public String getPageURL(WebDriver driver) {

		try {
			System.out.println("Getting current URL");
			return driver.getCurrentUrl();
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	
	
	
	
	
}
