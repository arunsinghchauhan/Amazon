package com.amazon.utility;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.amazon.base.TestBase;
import org.testng.Reporter;


public class TestUtil extends TestBase {

	public static int PAGE_LOAD_TIMEOUT = 70;
	public static int IMPLICIT_WAIT = 30;

	public static void waitToSync() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void selectDropdownValueByText(WebElement element, String text) {
		Select drop = new Select(element);
		drop.selectByVisibleText(text);
	}

	public static void resetImplicitTimeout(int newTimeOut) {
		driver.manage().timeouts().implicitlyWait(newTimeOut, TimeUnit.SECONDS);
	}

	public static boolean elementBoolean(WebElement element) {
		resetImplicitTimeout(5);
		boolean flag = true;

		try {
			element.isDisplayed();
		} catch (NoSuchElementException e) {
			flag = false;
		}
        
		resetImplicitTimeout(IMPLICIT_WAIT);
		return flag;

	}
	
	public static String log(String logValue) {
		Reporter.log(logValue, true);
		return logValue;
		
	}

}
