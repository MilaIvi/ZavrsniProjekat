package Page;

public class DemoqaCheckBox {
	

public WebDriver driver;	
	
	
 public WebElement elements;	
	
	
 public DemoqaCheckBox (WebDriver driver, WebElement elements) {	
	
	this.driver=driver;
	this.elements=elements;
	
	
 }	
	
 public WebElement clickCheckBox() {

 return driver.findElement(By.xpath("//*[@id=\"item-1\"]/span"));

 
 }
 
 public void clickCheckBox() {
		
 getCheckBox().click();
 
 }
 
 public WebElement getMessage() {
	 
 
 return driver.findElement(By.xpath("//*[@id=\"result\"]/span[1]"));
}


 public String textMessageCheckBox() {
	 
 
 return getMessage().getText();

}

}