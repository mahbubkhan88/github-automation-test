package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageFactory {
	
	WebDriver driver;
	
	public HomePageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="login")
	WebElement txtEmail;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(name="commit")
	WebElement btnLogin;
	
	public void login(String user, String pass) {
		txtEmail.sendKeys(user);
		txtPassword.sendKeys(pass);
		btnLogin.click();
	}
	
	
}
