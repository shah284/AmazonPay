Feature: Amazon Login and Proceed to Payment
 
Scenario: User logs into Amazon and proceeds to payment
Given the user is on the Amazon homepage
When the user clicks on the Login button
And the user enter valid credential
Then the user should be logged in successfully
When the user searches for a product in the search bar
Then the user should see a list of products related to the search
When the user selects a product from the results
And the user clicks on the Add to Cart button
Then the product should be added to the cart successfully
When the user clicks on the Cart icon
And the user clicks on the Proceed to Buy button
Then the user should be navigated to the delivery details page
When the user selects a delivery address
And the user clicks on the Continue button
And the user selects a payment method
Then the user should be able to review the order and proceed to payment
