package stepDefinition;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import io.cucumber.datatable.DataTable;

public class UserRegistrationSteps {
	@Given("User is on registration page")
	public void user_is_on_registration_page() {
	  
	}

	@When("enters following user details")
	public void enters_following_user_details(DataTable dataTable) {
	
	
	}

	@Then("user registration should be successful")
	public void user_registration_should_be_successful() {
		Assert.assertTrue(true);
		System.out.println("Hiiiii");
	}
	
	
	@After
	public void befor(Scenario s) {
		System.out.println("Hi");
	List<Integer> lines = s.getLines();
	for (Integer integer : lines) {
		System.out.println(integer);
	}
		System.out.println(s.getStatus());
	}
}
