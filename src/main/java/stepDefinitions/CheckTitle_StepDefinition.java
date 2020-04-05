package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.CheckTitlePage;
import org.openqa.selenium.WebDriver;

public class CheckTitle_StepDefinition {
	
	WebDriver driver1; //=TestBase.initDriver();
	
	public CheckTitle_StepDefinition(){
		
		driver1=TestBase.initDriver();
	}
	
	//WebDriver driver1=TestBase.initDriver();
	
	//CheckTitlePage checkTitle_Page1=new CheckTitlePage(driver1);	
	
	CheckTitlePage checkTitle_Page1;//=new CheckTitlePage(driver1);	
	
	
	@Given("^user is on home page$")
	public void user_already_on_login_page() {	
		checkTitle_Page1=new CheckTitlePage(driver1);
		System.out.println("***** inside Given method ********");
	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_free_CRM() {		
		String title = checkTitle_Page1.getTitle();		
		Assert.assertEquals("Cogmento CRM", title);
	}

	@Then("^user clicks on logout button$")
	public void user_clicks_on_logout_button() throws Throwable {		
		Thread.sleep(5000);
		checkTitle_Page1.logout();	    
	}
	
}
