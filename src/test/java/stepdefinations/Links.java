package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Links {
	
	
	WebDriver driver = Hook.driver;
	
	@Given("Open github")
	public void open_github() {
	    driver.navigate().to("https://github.com/");
	}

	@And("Click on sighup button")
	public void click_on_sighup_button() {
	    driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/a")).click();
	}

	@Then("Veryfy signup page")
	public void veryfy_signup_page() {
	    System.out.println("Signup page loaded successfully.");
	}
	
	@Given("Click on team")
	public void click_on_team() {
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/nav/ul/li[2]/a")).click();
	}

	@Then("Veryfy team page")
	public void veryfy_team_page() {
		System.out.println("Team page loaded successfully.");
	}
	
}
