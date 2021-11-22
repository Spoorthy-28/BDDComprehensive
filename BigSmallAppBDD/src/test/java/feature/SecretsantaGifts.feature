Feature: Validating if secretsanta gifts are displaying in reverse alphabetic order.

Scenario: 
Given invoke the chrome driver
And navigate to "https://www.bigsmall.in/" site
When user clicks on secretsanta gifts 
And selects ZtoA from the Sort by dropdown
Then verify that the gifts are displayed in reverse alphabetic order
And close the driver

