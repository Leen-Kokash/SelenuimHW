package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {

	WebDriver driver;

	public Homepage(WebDriver driver) {
		super();
		this.driver = driver;
	}
// Selctores for all cases 
	By siteLogo = By.className("c-logo");
	By theCart = By.className("c-minicart-icon__link");
	By myAccount = By.className("c-user__link");
	By signUpEmail = By.className("c-signup-link");

// Check Logo
	public boolean checkTheSiteLogo() {
		return driver.findElement
				(By.className("c-logo")).isDisplayed();
	}
// Signup Email
	public boolean checkTheSignUpEmail() {
		return driver.findElement
				(signUpEmail).isDisplayed();
	}
// Cart
	public boolean checkTheMiniCart() {
		return driver.findElement
				(theCart).isDisplayed();
	}
	// My account
	public boolean checkMyAccount() {
		return driver.findElement
				(myAccount).isDisplayed();
	}
//myAccount link
	public void clickMyAccountLink() {
		driver.findElement
		(myAccount).click();
	}
}
