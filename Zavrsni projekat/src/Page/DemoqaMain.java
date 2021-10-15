package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


	public class DemoqaMain {

	public WebDriver driver;	
		
	WebElement elements;
	
	WebDriverWait wdwait;
		
		
	public DemoqaMain(WebDriver driver, WebElement elements,WebDriverWait wdwait) {	
		
	this.driver=driver;
	this.elements=elements;
	this.wdwait=wdwait;
		
	}	
	
	
	WebElement element = driver.findElement(By.cssSelector(".avatar.mx-auto.white"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	Thread.sleep(500); 
	
	
		
	public WebElement clickElements() {

	return driver.findElement(By.cssSelector(".avatar.mx-auto.white"));
	


	}

    wdwait = new WebDriverWait(driver, 15);
	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".avatar.mx-auto.white"))).click();
	
	
	
	public void clickelements() {
		
		getelements().click();


	}

	private WebElement getelements() {
		// TODO Auto-generated method stub
		return null;
	}


	}
}