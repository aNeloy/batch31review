@smokeTestGK
Feature: Verify purchasing of dynamic items on GreenKart web application
	Scenario: User successfully purchases second and third most expensive dynamic item on GreenKart web application
		Given User goes to GreenKart home page
		And User verifies the text "GREENKART"
		And User sorts and prints the items in descending order
		When User adds second most expensive item to cart
		And User adds third most expensive item to cart		
		Then User clicks on the shopping bag icon
		And User clicks on the Proceed to Checkout button
		And User verifies "Total Amount : "
		And User clicks on the Place Order Button
		And User selects Ship To United States from the drop down
		And User checks the terms and conditions checkbox
		And User clicks on the Proceed button
		And User verifies the "Thank you, your order has been placed successfully" text
		And User is redirected to the home page
		
		