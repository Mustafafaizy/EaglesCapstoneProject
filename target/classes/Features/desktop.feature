Feature: Desktop


Background:
Given User is on Retail website
When User clicks on desktop tab
And User clicks on show all desktop
And User clicks on Add to cart option on Canon EOS5D


@Desktop
Scenario: verification of all items under desktop tab
Then User should see all items present in desktop page



@hplp
Scenario: User add HPLP3065 to the shopping Cart

And User clicks Add To Cart option on HpLP3065 item
And User Select quantity '1'
And User clicks add to cart button
Then User should see a message Succees you have added HPLP3065 to your shoping cart


@CanonEOS5D
Scenario: Canon EOS5D


And User select color from dropdown 'Red'
And User select quantity '1'
And User click on add to cart button
Then User should see a message You have added Canon EOS5D to your shoping cart 


@Review
Scenario: User Review on Canon Camera

And User clicks on write a Review Link
And User fill the review information with belwo information
|yourName|yourReview|Rating|
|JackMa|i found everthing very easy and the UI is very user friendly|good|
And User clicks on continue button
Then User sould see a messege with Thank you for your review. it has been submitted to the webMaster for approval








