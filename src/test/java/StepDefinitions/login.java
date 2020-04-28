package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
	@Given("^Launch the app$")
	public void launch_the_app() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^<User(\\d+)> logs into the app$")
	public void user_logs_into_the_app(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^<User(\\d+)> gets successful login validation$")
	public void user_gets_successful_login_validation(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}
}
