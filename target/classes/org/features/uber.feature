Feature: Uber booking Feature

Background:
Given User wants to  select a car type "sedan" from uber app
When User selects car "Sedan" and pickup point "Bangalore" and drop location "Pune"

@Sanity
Scenario: Booking cab

Then Driver starts the journey
And Driver ends the journey
And User pays 1000 Dollar

@Regression @Smoke
Scenario: Booking cab
Then Driver starts the journey
And Driver ends the journey
And User pays 2000 Dollar

@Regression
Scenario: Booking cab
Then Driver starts the journey
And Driver ends the journey
And User pays 3000 Dollar
