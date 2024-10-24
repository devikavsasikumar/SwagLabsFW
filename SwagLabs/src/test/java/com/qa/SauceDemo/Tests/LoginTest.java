package com.qa.SauceDemo.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.SauceDemo.BaseTest.BaseTest;
import com.qa.SauceDemo.Utils.Constants;

public class LoginTest extends BaseTest {

	@Test
	public void LoginPageTitleTest() {
		String actTitle = loginpage.getLoginPageTitle();
		System.out.println("Page title is" + actTitle);
		Assert.assertEquals(actTitle, Constants.LOGIN_PAGE_TITLE);

	}

	@Test
	public void LoginpageUrlTest() {
		String url = loginpage.getLoginPageUrl();
		System.out.println("The page Url is" + url);
		Assert.assertTrue(url.contains(Constants.LOGIN_PAGE_FRACTION_URL));
	}

	@Test
	public void doLoginTest() {
		String username = "standard_user";
		String password = "secret_sauce";
		loginpage.doLogin(username, password);

	}
}
