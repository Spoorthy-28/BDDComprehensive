package com.mindtree.pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.mindtree.uistore.AllofitPageUI;
import com.mindtree.utilities.Log;

public class AllofitPage extends AllofitPageUI {
	public WebDriver driver;
	Log log = new Log();

	public AllofitPage(WebDriver driver) {
		this.driver = driver;
	}
	public void clickAllofitLink() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(allofit).click();
	}
	public void getChristmasmug() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(christmas_mug).click();
	}
	public void check() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(cod).sendKeys("500059");
		driver.findElement(check).click();
	}
	
	public void validateCOD() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		try {
			Assert.assertTrue(driver.findElement(text2).isDisplayed());
			log.infoLog("COD is available");
		}catch(Exception e) {
			log.infoLog("COD not available, enter valid pincode");
		}
	}
	
}
