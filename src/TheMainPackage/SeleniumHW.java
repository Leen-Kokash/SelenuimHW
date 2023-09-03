package TheMainPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.MyAccountPage;
import pages.Homepage;

public class SeleniumHW {

	public static void main(String[] args) {
        //Set property for webdriver 
		System.setProperty("webdriver.chrome.driver","C://Users//LeenKokash//Downloads//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
        //Navigate to the website
		driver.navigate().to("https://www.lancome-usa.com");
		// Maximize the chrome screen 
		driver.manage().window().maximize();
		
		
        // Home page
		Homepage theHomePage = new Homepage(driver);
		// Account page 
		MyAccountPage theAccountPage = new MyAccountPage(driver);

         // Check the Logo of Lancome site
		if (theHomePage.checkTheSiteLogo()) {
			System.out.println("Logo_is_checked_succssfully");
		}
		
         // Check the Sign Up
		if (theHomePage.checkTheSignUpEmail()) {

		    System.out.println("Email_signup_is_checked_succssfully");
		}
		
        // Check the Mini cart is exit
		if (theHomePage.checkTheMiniCart()) {

			System.out.println("Cart_checked_succssfully");
		}
         //Check My account and click on it 
		if (theHomePage.checkMyAccount()) {
			System.out.println("My_Aaccount_is_checked_succssfully");

			theHomePage.clickMyAccountLink();
			System.out.println("myAccount_link_is_clickable");
		}
        //Check the title of Login
		if (theAccountPage.getTheTitleForLogin().equals("Registered Members")) {
			System.out.println("The_Title_Of_Login_is_checked");
		} else {
			// If is not appears/different
			System.out.println("The_title_is_different");
		}
        // check my credentails (email/pass)
		if (theAccountPage.checkTheEmail()) {
			System.out.println("Email_is_checked");
			theAccountPage.enterTheEmail("leen.kokash@getnada.com");
			System.out.println("The_Email_is_Checked_succssfully");
		}
         // Check the password
		if (theAccountPage.checkThePassword()) {
			System.out.println("Password_is_checked");
			theAccountPage.enterThePassword("1234@Leen");
			System.out.println("Password_is_checked_succssefully");
		}
          //Check Signin button 
		if (theAccountPage.checkTheSigninButton()) {
			System.out.println("Sign_is_checked_succssfully");
			
			theAccountPage.clickSignInButton();
			System.out.println("Signin_is_clicked");
		}

	}

}
