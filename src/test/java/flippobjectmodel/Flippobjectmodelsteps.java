package flippobjectmodel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import flippobjectmodel.pages.*;

public class Flippobjectmodelsteps extends BaseDriver{
	
	
	@Given("Enter the Potal code and click enter")
	public void enter_the_potal_code_and_click_enter() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/allocen27/WebDriver/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://flipp.com");
		System.out.println("OPens Flipp");
		HomePage hp = new HomePage();
		hp.postCode().sendKeys("M9W7B9");
		hp.postCode().sendKeys(Keys.ENTER);
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(4000);
	}
	    @When("Enter item name")
	    public void enter_item_name() {
	     
	    }

	    @Then("show item with price")
	    public void show_item_with_price() {
	        // Write code here that turns the phrase above into concrete actions
	        throw new io.cucumber.java.PendingException();
	    }








}
