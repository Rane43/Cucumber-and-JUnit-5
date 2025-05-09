package com.prometheus.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTestStepsDefinitions { 
	private final Login login = new Login();
	
	private String username;
	private String password;
	private boolean result;
	

	@Given("my username is {string}")
	public void my_username_is(String string) {
	    username = string;
	}
	
	@Given("my password is {string}")
	public void my_password_is(String string) {
	    password = string;
	}
	
	@When("I enter login")
	public void i_enter_login() {
	    result = login.login(username, password);
	}
	
	@Then("the method returns {bool}")
	public void the_method_returns(boolean bool) {
		assertEquals(bool, result);
	}

}
