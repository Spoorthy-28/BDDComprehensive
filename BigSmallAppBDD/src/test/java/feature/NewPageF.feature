Feature: Validating if an item in New page is getting added into the cart.

Scenario: 
Given invoke the chrome driver
And navigate to "https://www.bigsmall.in/" site
When user clicks on New link 
And selects christmas postcards followed by clicking on addtocart button
Then verify that the christmas postcard is added into the cart
And close the driver

