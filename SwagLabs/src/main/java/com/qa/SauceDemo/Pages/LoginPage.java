package com.qa.SauceDemo.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.SauceDemo.Utils.Constants;
import com.qa.SauceDemo.Utils.ElementUtil;
import com.qa.SauceDemo.Utils.JavaScriptUtil;

public class LoginPage {
	private WebDriver driver;
	private ElementUtil eleutil;
	private By emailId = By.id("user-name");
	private By Password = By.id("password");
	private By LoginBtn = By.id("login-button");

	public LoginPage(WebDriver driver) {
		eleutil = new ElementUtil(driver);
		this.driver = driver;

	}

	public String getLoginPageTitle() {
		return eleutil.waitForTitleIs(Constants.DEFAULT_TIME_OUT, Constants.LOGIN_PAGE_TITLE);
	}

	public String getLoginPageUrl() {
		return eleutil.waitForUrl(Constants.DEFAULT_TIME_OUT, Constants.LOGIN_PAGE_FRACTION_URL);
	}

	public ProductPage doLogin(String username, String password) {

		eleutil.getElement(emailId).sendKeys(username);
		eleutil.getElement(Password).sendKeys(password);
		eleutil.getElement(LoginBtn).click();
		return new ProductPage(driver);

	}

}
