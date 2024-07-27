package stepsDefinitions;

import org.junit.Test;

import core.DriverFectory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.RegisterPage;

import static org.junit.Assert.assertEquals;

public class RegisterSteps {
	
	private RegisterPage registerPage = new RegisterPage(DriverFectory.getDriver());

	@Test
	@Given("^I am on the system dashboard and I click on the recruitment side menu$")
	public void iAmOnTheSystemDashboardAndIClickOnTheRecruitmentSideMenu() throws Throwable {
		registerPage.clickRecruitment();
	}

	@When("^When I click on add on the recruitment screen$")
	public void whenIClickOnAddOnTheRecruitmentScreen() throws Throwable {
		registerPage.addButton();
	}

	@Then("^the system redirects the user to the registration screen$")
	public void theSystemRedirectsTheUserToTheRegistrationScreen() throws Throwable {
		String confirmForm=registerPage.getNameScreen();
		assertEquals("Add Candidate",confirmForm);
	}
	@Test
	@Given("^that I am on the registration screen$")
	public void that_I_am_on_the_registration_screen() throws Throwable {

    }

	@When("^I fill in all the fields correctly$")
	public void i_fill_in_all_the_fields_correctly() throws Throwable {
     	registerPage.registerCandidate();
	}

	@When("^click the Save button$")
	public void click_the_Save_button() throws Throwable {
		registerPage.clickSave();

	}

	@Then("^the system displays the success message and the new candidate on the screen$")
	public void the_system_displays_the_success_message_and_the_new_candidate_on_the_screen() throws Throwable {

		String confirm= registerPage.getConfirmRegistration();
		assertEquals("Application stage",confirm);
	}


}
