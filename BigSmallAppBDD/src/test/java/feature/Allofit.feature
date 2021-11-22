Feature: Validating the cash on delivery functionality.

Scenario: 
Given invoke the chrome driver
And navigate to "https://www.bigsmall.in/" site
And click on Allofit link
When user selects a christmas tree mug 
And enters the pincode followed by clicking on the check button
Then verify that COD is available or not for the enterd pincode
And close the driver

