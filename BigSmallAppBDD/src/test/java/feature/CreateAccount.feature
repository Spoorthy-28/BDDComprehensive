Feature: Validating the Login functionality.

Scenario: 
Given invoke the chrome driver
And navigate to "https://www.bigsmall.in/" site
And click on sign in followed by create account
When user enters email and password
And clicks on create button
Then verify that a new account is created for the user
And close the driver

