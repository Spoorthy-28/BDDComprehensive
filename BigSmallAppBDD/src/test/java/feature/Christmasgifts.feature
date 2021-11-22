Feature: Validating if an item is moving from wishlist to the cart

Scenario: 
Given invoke the chrome driver
And navigate to "https://www.bigsmall.in/" site
And clicks on christmas gifts
When user clicks on star lights followed by add to wishlist 
And selects view wishlist followed by access wishlist followed by add to cart button
Then verify that the star lights are moved from wishlist to the cart
And close the driver

