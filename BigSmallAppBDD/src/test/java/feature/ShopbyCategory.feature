Feature: Validating if the item of exceeded quantity is added into the cart

Scenario: 
Given invoke the chrome driver
And navigate to "https://www.bigsmall.in/" site
And Hovers onto shopbycategory followed by shopbyperson followed by unicorncrazy
When user selects unicornplushkeychain and increments the quantity of it
And clicks on add to cart button
Then verify that the item is not added into the cart due to exceeded quantity
And close the driver

