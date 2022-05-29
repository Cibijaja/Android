Feature: User registration

Scenario: user registration with different data

Given User is on registration page
When enters following user details
|name|job|
|naveen|automation|
|tom|manual|
|Jerry|Developer|
Then user registration should be successful 

