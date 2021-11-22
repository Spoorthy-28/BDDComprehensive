Feature: Validating Search Results

Scenario Outline: 
Given invoke the chrome driver
And navigate to "https://www.bigsmall.in/" site
When user enters <text> in the search bar and press enter
Then verify that the searched item is displayed in the search results
And close the driver

Examples:
|text		 |
|vintage travel journal|	
