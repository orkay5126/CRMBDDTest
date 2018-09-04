package stepDefinitions;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import crm.qa.pom.pages.HomePage;
import crm.qa.pom.pages.LoginPage;
import crm.qa.utils.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class login_stepdefinitions extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	
	WebDriver driver;
	
	
		
	@Given("^User already on the login page$")
	public void User_already_on_the_login_page() throws Throwable {
		driver = TestBase.initialization();
		loginpage = new LoginPage(driver);
		String logintitle = loginpage.validateLoginPageTitle();
		Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", logintitle);
		System.out.println("User already on the login page");
	}
	
	
	@When("^User enters the username and password$")
	public void User_enters_the_username_and_password() throws Throwable{
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		
		homepage = loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
		System.out.println("User enters the username and passwor");
		
	}
		
	@Then("^user successfully logged into the CRM site$")
	public void user_successfully_logged_into_the_CRM_site() throws Throwable{
		String homepagetitle = homepage.validateHomePageTitle();
		Assert.assertEquals("CRMPRO", homepagetitle);
		Assert.assertEquals(homepage.VerifyCorrectUserName(), true);
		System.out.println("user successfully logged into the CRM site");
	}
	
}
