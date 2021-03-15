package com.amazon.runner;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.amazon.base.TestBase;

import cucumber.api.CucumberOptions;

@CucumberOptions(features = "src/test/resources/featureFiles/", glue = "com.amazon.test", tags = {"@Homepage"}, plugin = {"json:target/cucumber/report.json" , "html:target/site/cucumber-pretty"})
	 
	public class RunnerClass extends AbstractTestNGCucumberTests {
	
	TestBase bst = new TestBase();
	
	@BeforeClass
	public void intiateSession() {
		System.out.println("start");
		TestBase.initialization();
	}
	 
	@AfterClass
	public void closeSession() {
		bst.closeBrowsers();
	}
	
	}
