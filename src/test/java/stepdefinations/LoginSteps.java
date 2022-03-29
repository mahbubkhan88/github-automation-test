package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.HomePageFactory;
import pages.Dashboard;
import pages.Home;

public class LoginSteps {
	
	WebDriver driver = Hook.driver;
	//Home home = new Home();
	HomePageFactory home = new HomePageFactory(driver);
	Dashboard dashboard = new Dashboard();
		
	@Given("Browse the website")
	public void browse_the_website() {
	    driver.navigate().to("https://github.com/");
	}

	@And("Click on sign-in button")
	public void click_on_sign_in_button() {
	    driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/div[2]/a")).click();
	}

	@When("^User has provide the valid credentials$")
	public void user_has_provide_the_valid_credentials() throws Throwable {
	    home.login("mahbubkhan88@gmail.com", "123456");
	}

	@Then("User shoul be able to login")
	public void user_shoul_be_able_to_login() {
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   dashboard.checkLogin();
	}
	
}
