package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {

	@Given("The user opens Register Page")
	public void the_user_opens_register_page() {
		
		
	    
		
	   
	}

	@When("The user clicks {string} button with all fields empty")
	public void the_user_clicks_button_with_all_fields_empty(String string) {
	    
	   
	}

	@Then("It should display an error {string} below Username textbox")
	public void it_should_display_an_error_below_username_textbox(String string) {
	    
	   
	}

	@When("The user clicks {string} button after entering Username with other fields empty")
	public void the_user_clicks_button_after_entering_username_with_other_fields_empty(String string) {
	    
	   
	}

	@Then("It should display an error {string} below Password textbox")
	public void it_should_display_an_error_below_password_textbox(String string) {
	    
	   
	}

	@When("The user clicks {string} button after entering Username and password with Password Confirmation field empty")
	public void the_user_clicks_button_after_entering_username_and_password_with_password_confirmation_field_empty(String string) {
	    
	   
	}

	@Then("It should display an error {string} below Password Confirmation textbox")
	public void it_should_display_an_error_below_password_confirmation_textbox(String string) {
	    
	   
	}

	@When("The user clicks {string} button after entering invalid username")
	public void the_user_clicks_button_after_entering_invalid_username(String string) {
	    
	   
	}

	@Then("It should display an error message {string}")
	public void it_should_display_an_error_message(String string) {
	    
	   
	}

	@When("The user clicks {string} button after entering different passwords in Password and Password Confirmation fields")
	public void the_user_clicks_button_after_entering_different_passwords_in_password_and_password_confirmation_fields(String string) {
	    
	   
	}

	@When("The user enters a Password with characters less than {int}")
	public void the_user_enters_a_password_with_characters_less_than(Integer int1) {
	    
	   
	}

	/*
	 * @When("It should display an error {string} below Password Confirmation textbox"
	 * ) public void
	 * it_should_display_an_error_below_password_confirmation_textbox(String string)
	 * {  throw
	 * new io.cucumber.java.PendingException(); }
	 */

	@Then("The user should be redirected to Homepage with the message {string}")
	public void the_user_should_be_redirected_to_homepage_with_the_message(String string) {
	    
	   
	}
	
	
	
}
