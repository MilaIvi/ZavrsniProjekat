package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoqaTbox {
	
	WebDriver driver;	
	public WebDriverWait wdwait;
	WebElement usernameField;
	WebElement emailField;
	WebElement currentAddress;
	WebElement permanentAddress;
	
	
	
	
	public DemoqaTbox(WebDriver driver, WebDriverWait wdwait) {
		this.driver = driver;
		this.wdwait = wdwait;
	}	
	
	
	public WebElement getusernameField() {
		return driver.findElement(By.id("userName"));
	}
	
	public WebElement getemailField() {
		return driver.findElement(By.id("userEmail"));
	}
	
	public WebElement getcurrentAddress() {
		return driver.findElement(By.id("currentAddress"));
	}
	
	
	public WebElement getpermanentAddress() {
		return driver.findElement(By.id("permanentAddress"));
	}
	
	public WebElement getsubmitButton() {
		return driver.findElement(By.id("submit"));
	}
	
    
	public void pressSubmitButton() {
		this.getsubmitButton().click();
	}
	
	public WebElement getMessage() {
		return driver.findElement(By.xpath("//*[@id=\"name\"]/text()[2]"));
	}
	
	public String textMessageLogIn() {
		return getMessage().getText();
	  
​
} 	

	
	
}