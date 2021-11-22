Feature: Validating the Login functionality.

Scenario: 
Given invoke the chrome driver
And navigate to "https://www.bigsmall.in/" site
And click on sign in
When user enters invalid username and password
And clicks on sign in button
Then verify that the user is unable to log in to the page
And close the driver

