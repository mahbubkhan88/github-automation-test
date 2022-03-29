package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import stepdefinations.Hook;



public class Home {

	WebDriver driver = Hook.driver;
	
	By email = By.name("login");
	By password = By.name("password");
	By signinButton = By.name("commit");
	
	public void login (String user, String pass) {
		driver.findElement(email).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(signinButton).click();
	}
	
	
}

