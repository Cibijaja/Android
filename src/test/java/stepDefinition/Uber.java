package stepDefinition;

import cucumber.api.java.en.*;

public class Uber {
	
	@Given("User wants to  select a car type {string} from uber app")
	public void user_wants_to_select_a_car_type_from_uber_app(String string) throws Sample {
	 System.out.println(string);
	}

	@When("User selects car {string} and pickup point {string} and drop location {string}")
	public void user_selects_car_and_pickup_point_and_drop_location(String string, String string2, String string3) {
		 System.out.println(string + " " + string2 +" "+ string3);
	}

	@Then("Driver starts the journey")
	public void driver_starts_the_journey() {
	  
	}

	@Then("Driver ends the journey")
	public void driver_ends_the_journey() {
	    
	}

	@Then("User pays {int} Dollar")
	public void user_pays_Dollar(Integer int1) {
	    System.out.println(int1);
	}	
	
	

}
