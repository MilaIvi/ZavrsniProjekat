package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import Base.BaseZavrsniProjekat;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class TestDemoqa extends BaseZavrsniProjekat {


		
		@BeforeMethod
		public void pageSetUp() {
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/");
			
		}	
		
	@Test
	public void successfulLogIn() {
		
	}
		        String text="Name:Draginja";
		        ​
				String username = ExcelReader.getStringData("LoginTest", 1, 1);
				String email = ExcelReader.getStringData("LoginTest", 1, 3);
				String currentSddress = ExcelReader.getStringData("LoginTest", 2, 7);
				String permanentAddress = ExcelReader.getStringData("LoginTest", 1, 6);
		​
		        demoqaTbox.insertUsernameField(userName);
		        demoqaTbox.insertemailField(userEmail);
		        demoqaTbox.insertcurrentAddress(currentAddress);
		        demoqaTbox.insertpermanentAddress(permanentAddress);
				demoqaTbox.clicksubmitButton(submit);
		
		
		      Assert.assertTrue(demoqaTbox.textMessageLogIn().contains(text));
		
		@Test
		
		
		@AfterMethod
		public void deleteCookies() {
			driver.manage().deleteAllCookies();
		}
			
		
		
		
	}	
		
		