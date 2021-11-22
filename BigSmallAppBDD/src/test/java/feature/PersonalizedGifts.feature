Feature: Validating AddToCart Functionality

Scenario: 
Given invoke the chrome driver
And navigate to "https://www.bigsmall.in/" site
And click on personized gifts
When user selects a personalized name plate 
And clicks on add to cart button leaving the name textbox blank
Then verify that user is unable to add the item into the cart
And close the driver
