package steps;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashboardPage;
import pages.TestBase;

public class DashboardStepDefinition extends TestBase{
	DashboardPage dashboardPage;
	
	@Before
	public void beforeRunner() {
		initDriver();
		driver.get("https://techfios.com/test/107");
		dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
	}
	
	@Given("{string} button exists")
	public void button_exists(String button_type) {
		if(button_type.equalsIgnoreCase("Set SkyBlue Background")) {
			Assert.assertTrue(dashboardPage.validateBlueButton());
			
		} else if(button_type.equalsIgnoreCase("Set White Background")) {
			Assert.assertTrue(dashboardPage.validateWhiteButton());
			
		}else {
			System.out.println("Sorry please check the string" + button_type);
		}
		
	}
	@When("I click on the button")
	public void i_click_on_the_button() {
		
		if(dashboardPage.getCounter() == 0) {
			dashboardPage.clickOnSkyBlueButtonElement();
			dashboardPage.setCounter(1);
		}else {
			dashboardPage.clickOnSkyWhiteButtonElement();
		}
		
	}
	@Then("the background color will change to sky blue")
	public void the_background_color_will_change_to_sky_blue() {

	    Assert.assertTrue(dashboardPage.bodyBackgroundColor().equalsIgnoreCase("background-color: skyblue;"));	
	    System.out.println("color: " + dashboardPage.bodyBackgroundColor());
	    
	}

	@Then("the background color will change to white")
	public void the_background_color_will_change_to_white() {
	Assert.assertTrue(dashboardPage.bodyBackgroundColor().equalsIgnoreCase("background-color: white;"));	
	System.out.println("color: " + dashboardPage.bodyBackgroundColor());
    
	}

	@After
	public void closeBrowsers() {
		tearDown();
	}
	
}
