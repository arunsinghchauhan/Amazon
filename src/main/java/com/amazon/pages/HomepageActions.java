package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.amazon.base.TestBase;
import com.amazon.utility.TestUtil;

public class HomepageActions extends TestBase{

	
	@FindBy(id="nav-xshop")
	WebElement navigationBar;
	
	
	
	
	
	
	
	
	public HomepageActions() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	public void verifyNavigationBarForDesktop() {
		Assert.assertEquals(navigationBar.isDisplayed(),"[Assertion Fail] : Navigation bar is not displayed");
		TestUtil.log("[Assertion pass]: Navigation bar is displayed");
	}

}
