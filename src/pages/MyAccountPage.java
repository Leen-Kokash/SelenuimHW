package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {
	WebDriver driver;
	public MyAccountPage(WebDriver webdriver) {
		super();
		this.driver = webdriver;
	}

	
	//CSS Selectors
	By LoginTitle = By.cssSelector
			("div.c-account__login-section > h2.c-account__title");
	By emailBox = By.cssSelector
			("form[name=login] > div.m-float > input.c-text-field__input[name=email]");
	By passwordBox = By.cssSelector
			("form[name=login] > div.m-float > input.c-text-field__input[name = password]");
	By signInButton= By.xpath
			("/html/body/div[8]/div[2]/div/div[2]/div[2]/div[1]/div/div/form/div[10]/button");

	//Methods
	public String getTheTitleForLogin() {
		return driver.findElement(LoginTitle).getText();
	}

	public boolean checkTheEmail() {
		return driver.findElement(emailBox).isDisplayed();
	}

	public void enterTheEmail(String email) {
		driver.findElement(emailBox).sendKeys(email);
	}

	public boolean checkThePassword() {
		return driver.findElement(passwordBox).isDisplayed();
	}

	public void enterThePassword(String password) {
		driver.findElement(passwordBox).sendKeys(password);
	}

	public boolean checkTheSigninButton() {
		return driver.findElement(signInButton).isDisplayed();
	}

	public void clickSignInButton() {
		driver.findElement(signInButton).click();
	}
}
