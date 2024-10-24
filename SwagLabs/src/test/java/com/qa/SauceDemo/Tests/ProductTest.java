package com.qa.SauceDemo.Tests;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.SauceDemo.BaseTest.BaseTest;
import com.qa.SauceDemo.Utils.Constants;

public class ProductTest extends BaseTest {
	@BeforeClass
	public void ProdpageSetup() {
		prodpage = loginpage.doLogin("standard_user", "secret_sauce");

	}

	@Test
	public void AproductnameTest() {
		String productName = prodpage.getproductname();
		System.out.println("Product Name: " + productName);
		Assert.assertEquals(productName, "Sauce Labs Bike Light");
		
	}

	@Test
	public void addToCartProductPage() {
		prodpage.AddtoCart();

	}
	@Test
	public void doCheckoutTest() {
		String FirstName="abcd";
		String LastName="efgh";
		String PostalCode="123456";
		prodpage.checkout(FirstName,LastName,PostalCode);

	}
	@Test
	public void finishtest()
	{
		prodpage.finish();
	}
	//@Test
	public void removefromCartProductPage() {
		prodpage.RemovfromCart();
	}

	
	@Test
	public void Bproductprice() {
		String price = prodpage.productprice();
		System.out.println("Product Price:"+price);
		Assert.assertEquals(price,"$9.99");

}
}
