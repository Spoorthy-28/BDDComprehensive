Feature: Validating contact us functionality in corporate gifts page

Scenario: 
Given invoke the chrome driver
And navigate to "https://www.bigsmall.in/" site
And click on corporate gifts
When user enters all the details and clicks on submit button
Then verify if contact us is successful or not
And close the driver

