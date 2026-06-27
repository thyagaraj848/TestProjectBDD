Feature: OrangeHRM Login

Background:
Given User opens OrangeHRM Login page

Scenario: Login with valid credentials
Given User enters valid username and password
When User clicks Login button
Then Dashboard should be displayed

Scenario: Login with invalid password
Given User enters valid username and invalid password
When User clicks Login button
Then Invalid Credentials message should be displayed

Scenario: Login without username
Given User leaves username empty and enters password
When User clicks Login button
Then Required message should be displayed