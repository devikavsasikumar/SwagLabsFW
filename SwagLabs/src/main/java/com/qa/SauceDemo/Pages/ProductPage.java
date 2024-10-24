package com.qa.SauceDemo.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import com.qa.SauceDemo.Utils.Constants;
import com.qa.SauceDemo.Utils.ElementUtil;

public class ProductPage {
	private WebDriver driver;
	private ElementUtil eleutil;
	private By productName = By.xpath("//div[@class='inventory_item_name' and text()='Sauce Labs Bike Light']");
	private By addToCart = By.xpath("//div[@class='inventory_item_label']//div[@class='inventory_item_name' and text()='Sauce Labs Bike Light']//ancestor::div[@class='inventory_item']//following-sibling::div[@class='pricebar']//button[text()='ADD TO CART']");
	private By removeFromCart = By.xpath("//div[@class='inventory_item_label']//div[@class='inventory_item_name' and text()='Sauce Labs Bike Light']//ancestor::div[@class='inventory_item']//following-sibling::div[@class='pricebar']//button[text()='REMOVE']");
	private By productPrice = By.xpath("//div[@class='inventory_item_name' and text()='Sauce Labs Bike Light']//ancestor::div[@class='inventory_item']//following-sibling::div[@class='pricebar']//div");
	//private By cartIcon=By.xpath("//*[local-name()='svg' and @data-icon='shopping-cart']");
	private By cartIcon=By.xpath("//span[@class='fa-layers-counter shopping_cart_badge' and text() = '1']");
	private By checkout=By.xpath("//a[@class='btn_action checkout_button' and text() = 'CHECKOUT']");
	private By firstname=By.id("first-name");
	private By lastname=By.id("last-name");
	private By postalcode=By.id("postal-code");
	private By continuee=By.xpath("//input[contains(@class, 'btn_primary') and contains(@class, 'cart_button')]");
	private By finish=By.xpath("//a[contains(@class, 'btn_action') and contains(@class, 'cart_button')]");

	public ProductPage(WebDriver driver) {
		this.driver = driver;
		eleutil = new ElementUtil(driver);
	}

	public String getproductname() {
		return eleutil.doElementGetText(productName);
	}

	public void AddtoCart() {
		eleutil.doClick(addToCart);
		eleutil.doClick(cartIcon);
		eleutil.doClick(checkout);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void checkout(String FirstName,String LastName,String PostalCode)
	{
		eleutil.getElement(firstname).sendKeys("FirstName");
		eleutil.getElement(lastname).sendKeys("LastName");
		eleutil.getElement(postalcode).sendKeys("PostalCode");
		eleutil.getElement(continuee).click();	
	}
	public void finish()
	{
		eleutil.doClick(finish);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
  
       
	public void RemovfromCart() {
		eleutil.doClick(removeFromCart);
	}

	public String productprice() {
		return eleutil.doElementGetText(productPrice);

	}
}