package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class TestBase {
	
	static WebDriver driver;
	
	
	public static WebDriver initDriver(){
		return driver;
	}
	@Before
	public void setUp() throws Exception{		
		System.out.println("*********** inside setUp method of Hooks_StepDefination ********");	
		System.setProperty("webdriver.chrome.driver",
				"src/main/java/resources/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.freecrm.com/index.html");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("email")).sendKeys("rj89862@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Alto@123");
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
	}
	
	@After
	public void tearDown(){
		System.out.println("*********** inside tearDown method of Hooks_StepDefination ********");
		driver.quit();
	}

}
