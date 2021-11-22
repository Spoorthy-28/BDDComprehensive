package com.mindtree.pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.mindtree.uistore.HomePageUI;
import com.mindtree.uistore.ShopByCategoryPageUI;
import com.mindtree.utilities.Log;

public class ShopByCategoryPage extends ShopByCategoryPageUI {
	public WebDriver driver;
	Log log = new Log();

	public ShopByCategoryPage(WebDriver driver) {
		this.driver = driver;
	}
	public void selectuncorncrazy() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(shopbycategory)).build().perform();
		a.moveToElement(driver.findElement(shopbyperson)).build().perform();
		a.moveToElement(driver.findElement(unicorncrazy)).click().build().perform();
	}
	public void icrQty() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(unicornplushkeychain).click();
		driver.findElement(incqty).click();
	}
	public void clickadd2cart() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(addtocart).click();
	}
	public void exceededOrderQuantity() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertTrue(driver.findElement(text).isDisplayed());
	}

}
