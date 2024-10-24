package com.qa.SauceDemo.BaseTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.SauceDemo.Factory.DriverFactory;
import com.qa.SauceDemo.Pages.LoginPage;
import com.qa.SauceDemo.Pages.ProductPage;
import com.qa.SauceDemo.Utils.ElementUtil;

public class BaseTest {
	public DriverFactory df;
	public WebDriver driver;
	public LoginPage loginpage;
	public ProductPage prodpage;
	public ElementUtil eleutil;
	@BeforeTest
	public void setup()
	{
		df=new DriverFactory();
		driver=df.init_driver("chrome");
		loginpage=new LoginPage(driver);
		
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
	

}
