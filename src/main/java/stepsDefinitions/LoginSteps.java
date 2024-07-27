package stepsDefinitions;

import static org.junit.Assert.assertEquals;

import core.DriverFectory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Test;
import pages.LoginPage;

public class LoginSteps {


	private LoginPage loginPage = new LoginPage(DriverFectory.getDriver());

	@Test
	@Given("^I am on the login screen and see the login$")
	public void i_am_on_the_login_screen_and_see_the_login() throws Throwable {
		String screenLogin= loginPage.loginScreen();
		assertEquals("Login",screenLogin);

	}
	@When("^I input the username\"([^\"]*)\"$")
	public void i_input_the_username(String user) throws Throwable {
		loginPage.inputUser(user);

	}
	@When("^I input the userpassword\"([^\"]*)\"$")
	public void i_input_the_userpassword(String password) throws Throwable {
		loginPage.inputPassword(password);

	}
	@When("^I click the button Login$")
	public void i_click_the_button_Login() throws Throwable {
       loginPage.sendButton();
	}

	@Then("^I go to the main screen and see the name \"([^\"]*)\"$")
	public void i_go_to_the_main_screen_and_see_the_name(String arg1) throws Throwable {

	}
}
