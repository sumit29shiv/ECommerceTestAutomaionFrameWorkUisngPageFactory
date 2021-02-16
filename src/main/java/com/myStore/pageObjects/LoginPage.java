package com.myStore.pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myStore.base.BasePage;
import com.myStore.utils.ElementUtil;

public class LoginPage extends BasePage {
	
	public ElementUtil eleUtil;
	
	
	@FindBy(xpath="//section[@id='block_various_links_footer']/ul/li/a")
	List<WebElement> listOfInformation;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
		eleUtil = new ElementUtil();
	}
	
	//page actions
	public String getLoginPageTitle() {
		return eleUtil.getPageTitle(driver);
	}
	
	public void getListofInformation() {
		
		for(int i=0;i<listOfInformation.size();i++) {
			String text = listOfInformation.get(i).getText();
			System.out.println(text);
		}
	}

}
