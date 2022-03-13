package com.mytests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceTest extends BaseTest {

	public void doLogin() {
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//button[@data-cookiebanner='accept_button']")).click();
		
		driver.findElement(By.id("email")).sendKeys("123");
		driver.findElement(By.id("pass")).sendKeys("456");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

	@Test(priority = 1)
	public void checkInventoryItemTest() {
		doLogin();
		
		
		//Assert.assertTrue(driver.findElements(By.cssSelector(".inventory_item")).size() == 6);
	}

	@Test(priority = 2)
	public void checkAddToCartButtonTest() {
		doLogin();
		//Assert.assertTrue(driver.findElements(By.xpath("//button[text()='ADD TO CART']")).size() == 6);
	}

}
