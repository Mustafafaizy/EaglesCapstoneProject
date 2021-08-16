Feature: lapTops and notebook scenario

Scenario: add and removing a mac book from cart
Given User is on retail website
When User hover the mosue on laptop and notebook tab
And User clicks on ahow all laptop and notebook option
And User clicks on macbook
And User clicks add to cart button
Then User should see a Message 'Success: You have added MacBook to your shoping cart!'
And User should see one item added to the cart
And User clicks on cart option
And User clicks on red X button to remove the item from cart
Then Item should be removed and cart shows 0 item
