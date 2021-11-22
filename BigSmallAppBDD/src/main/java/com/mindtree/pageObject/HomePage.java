package com.mindtree.pageObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.mindtree.uistore.HomePageUI;
import com.mindtree.utilities.ExcelReader;
import com.mindtree.utilities.Log;

public class HomePage extends HomePageUI {
	public WebDriver driver;
	Log log = new Log();

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	public void getPersonilizedGifts() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(personalizedgifts).click();
	}
	public WebElement getSearch() {
		return driver.findElement(search);
	}
	public void validateSearch() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertTrue(driver.findElement(text1).isDisplayed());
	}
	public void clicksignin() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(sign_in).click();
	}
	public void getdetails() throws IOException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ExcelReader er = new ExcelReader();
		ArrayList<String> list = er.getExcelData();
		driver.findElement(email).sendKeys(list.get(1));
		driver.findElement(password).sendKeys(list.get(2));
	}
	public void getsigninbutton() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(sign_in_button).click();
	}
	public void validateLogin() throws IOException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			Assert.assertTrue(driver.findElement(text).isDisplayed());
		}
		catch(Exception e) {
			log.infoLog("Login unsuccessful");
		}
	}
	public void getsignin() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(sign_in).click();
		driver.findElement(createacc).click();
	}
	public void enterDetails() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(e_mail).sendKeys("fesbunyw@gmail.com");
		driver.findElement(pw).sendKeys("d23ek09");
	}
	public void clickcreate() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(create).click();
	}
	public void createAcc() throws IOException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			Assert.assertTrue(driver.findElement(text2).isDisplayed());
		}
		catch(Exception e) {
			log.infoLog("Account creation not successful");
		}
	}

}
