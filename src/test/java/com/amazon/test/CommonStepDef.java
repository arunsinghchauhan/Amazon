package com.amazon.test;

import com.amazon.base.TestBase;
import com.amazon.pages.CommonActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CommonStepDef extends TestBase{

	CommonActions commonActions= new CommonActions();
	
	@Given("^User is on the homepage of Amazon$")
     public void launchApplication()
		{
		super.launchApplication();
		}
	

	@Then("^Validate page title is '(.*)'$")
	public void validatePageTitle(String PageTitle) {
       commonActions.validatePageTitle(PageTitle);
	}

}
