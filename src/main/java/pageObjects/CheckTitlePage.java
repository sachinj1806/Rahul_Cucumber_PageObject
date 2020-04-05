package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import stepDefinitions.TestBase;

public class CheckTitlePage extends TestBase {

	WebDriver driver;	
		
	public CheckTitlePage(WebDriver driver) {
		
		System.out.println("******** inside contructor ******* ");

		this.driver = driver;
	}

    WebElement topHeaderMenu=driver.findElement(By.xpath("//*[@id='top-header-menu']/div[3]/div[2]/div/i"));
	
	WebElement logout_btn= driver.findElement(By.xpath("//span[contains(text(),'Log Out')]"));
	
	
	public String getTitle(){
		
		System.out.println(" title = " + driver.getTitle());
		
		return driver.getTitle();
	}
	
	public void logout(){
		
		topHeaderMenu.click();
		logout_btn.click();
	}
}
