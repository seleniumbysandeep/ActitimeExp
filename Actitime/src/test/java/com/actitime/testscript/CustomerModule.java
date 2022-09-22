package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule {

	@Test
	public void createCustomer() {
		Reporter.log("createCustomer",true);
		WebDriver driver=new ChromeDriver();
	}
	
}
