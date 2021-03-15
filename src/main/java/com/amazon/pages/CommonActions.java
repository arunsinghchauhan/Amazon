package com.amazon.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.amazon.base.TestBase;
import com.amazon.utility.TestUtil;

public class CommonActions extends TestBase{

String PageTitle;
 
public CommonActions()
{
	super();
	PageFactory.initElements(driver, this);
	
}
public void validatePageTitle(String title)
{
	TestUtil.waitToSync();
	PageTitle=driver.getTitle();
	Assert.assertEquals(PageTitle, title);
	TestUtil.log("Page title is "+PageTitle);
}
	
}
