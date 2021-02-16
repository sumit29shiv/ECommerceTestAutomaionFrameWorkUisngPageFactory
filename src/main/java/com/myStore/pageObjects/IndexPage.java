package com.myStore.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myStore.base.BasePage;
import com.myStore.utils.ElementUtil;

public class IndexPage extends BasePage {
	
	public ElementUtil eleUtil;

	
	
	//create WebElement using FindBy(Page facttory concept)
	@FindBy(xpath="//a[contains(text(),'Sign in')]") 
	private WebElement signInBtn;
	
	@FindBy(xpath="//img[contains(@class,\"logo img-responsive\")]")
	private WebElement myStoreLogo;
	
	@FindBy(id="search_query_top") 
	private WebElement searchProductField;
	
	@FindBy(xpath="//button[@name='submit_search']")
	private WebElement searchProductBtn;
	
	
	//initialize above webelements using intiElements methhod in PageFactory class
	public IndexPage() {
		PageFactory.initElements(driver, this);
		eleUtil = new ElementUtil();
	}
	
	 
	//user actions of Index Page
	public String getIndexPageTitle() {
		return eleUtil.getPageTitle(driver);
	}
	
	public LoginPage navigateToLoginPage() {
		//signInBtn.click();
		eleUtil.doClick(signInBtn);
		return new LoginPage();
	 
	}
	
	public boolean isLogoVisible() {
		return eleUtil.doIsDisplayed(myStoreLogo);
	}
	
	
	public SearchResultPage searchProduct(String productName) {
		searchProductField.clear();
		searchProductField.sendKeys(productName);
		searchProductBtn.click();
		return new SearchResultPage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

	
	
	
	
	
	
	
	
	
