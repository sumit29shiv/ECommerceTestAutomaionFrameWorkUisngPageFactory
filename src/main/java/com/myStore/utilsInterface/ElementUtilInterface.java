/**
 * 
 */
package com.myStore.utilsInterface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author sumitshivhare
 *
 */
public interface ElementUtilInterface {
	
	
	public String getPageTitle(WebDriver driver);
	/**
	 * This method returns the title of a WebPage
	 * @author sumitshivhare
	 * @param driver 
	 * @return string
	 */
	
	public boolean doSendKeys(WebElement ele, String text);
	/**
	 * This method enters text in the field
	 * @author sumitshivhare
	 * @param webelement, String text
	 */
	
	public boolean doClick(WebElement ele);
	/**
	 * This method clicks on the button
	 * @author sumitshivhare
	 * @param webelement
	 * @return boolean
	 */
	
	public boolean doClear(WebElement ele);
	/**
	 * This method clears the field
	 * @author sumitshivhare
	 * @param webelement
	 * @return boolean
	 */
	
	public boolean doIsDisplayed(WebElement ele);
	/**
	 * This method checks the visiblilty of Element
	 * @author sumitshivhare
	 * @param webelement
	 * @return boolean
	 */
	
	public boolean doIsEnabled(WebElement ele);
	/**
	 * This method checks whether element is enabled or not
	 * @author sumitshivhare
	 * @param webelement
	 * @return boolean
	 */
	
	
	public boolean doIsSelected(WebElement ele);
	/**
	 * This method checks whether element is selected or not
	 * @author sumitshivhare
	 * @param webelement
	 * @return boolean
	 */
}
