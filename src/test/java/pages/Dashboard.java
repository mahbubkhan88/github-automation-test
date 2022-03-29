package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.junit.Assert;
import stepdefinations.Hook;

public class Dashboard {
	
	WebDriver driver = Hook.driver;
	
	By loginInfo = By.cssSelector(".note");
	
	public void checkLogin() {
		String exp_message = "When you take actions across GitHub, we’ll provide links to that activity here.";
		String accual = driver.findElement(loginInfo).getText();
		System.out.println(accual);
		Assert.assertEquals(exp_message, accual);
	}
	
}
