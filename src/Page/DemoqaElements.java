package Page;

public class DemoqaElements {
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	import org.openqa.selenium.support.ui.Select; 

	public class DemoqaElements {
		
		
	public WebDriver driver;	
		
	public WebElement elements;	




		
		
	public DemoqaElements(WebDriver driver,WebElement elements ) {

		this.driver=driver;
		this.elements=elements;

	}

	public WebElement getElementDropDown() {


	return driver.findElement(By.xpath(//*[@id="app"]/div/div/div[2]/div[1]/div/div/div[1]/span/div/div[1]/span/svg/path));

	}


	Select dropdown = new Select(driver.findElement(By.xpath(//*[@id="app"]/div/div/div[2]/div[1]/div/div/div[1]/span/div/div[1]/span/svg/path));
	dropdown.selectByVisibleText("Text Box");



	}
	
	
	
	

}
