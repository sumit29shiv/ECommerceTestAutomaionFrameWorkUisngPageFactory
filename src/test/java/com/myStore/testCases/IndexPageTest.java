/**
 * 
 */
package com.myStore.testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myStore.base.BasePage;

public class IndexPageTest extends BasePage {
	
	@Test(priority = 1)
	public void verifyTitleTest() {
		String actualTitle = indexPage.getIndexPageTitle();
		Assert.assertEquals(actualTitle, "My Store");
	}
	
	
	@Test(priority = 3)
	public void verifyLoginPageNavigationTest() {
		loginPage = indexPage.navigateToLoginPage();
		String actualTitle = loginPage.getLoginPageTitle();
		Assert.assertEquals(actualTitle, "Login - My Store");

		
		
	}

	@Test(priority = 2)
	public void verfifyLogoTest() {
		boolean flag = indexPage.isLogoVisible();
		Assert.assertTrue(flag);
	}
	
}
