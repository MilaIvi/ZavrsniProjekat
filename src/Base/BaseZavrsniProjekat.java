package Base;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;

	import PagesTel.DemoqaCheckBox;
	import PagesTel.DemoqaElements;
	import PagesTel.DemoqaMain;
	import PagesTel.DemoqaTbox;

	public class BaseZavrsniProjekat {
		
		
		
	public WebDriver driver;
	public WebDriverWait wdwait;
	public DemoqaMain demoqamain;
	public DemoqaElements demoqaelements;
	public DemoqaTbox demoqatbox;
	public DemoqaCheckBox demoqacheckbox;


	@BeforeClass

	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
			
		driver=new ChromeDriver();
		wdwait=new WebDriverWait(driver,5);
		demoqamain=new DemoqaMain(driver,wdwait);
		demoqaelements=new DemoqaElements(driver);
		demoqatbox=new DemoqaTbox(driver);
		demoqacheckbox=new DemoqaCheckBox(driver);
		
		
		
		
		

	}

	@AfterClass

	public void tearDown() {
		
	driver.close();	
	driver.quit();	



	}

	}

	
	
	
	
	

}
