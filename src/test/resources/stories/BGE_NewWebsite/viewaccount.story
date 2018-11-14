Narrative:
As a Customer, I want to view a overview of My Accounts, when logged into my Bord Gais account online

Scenario: When a customer logs into their online account they should see their Accounts
Meta:@accountOneCheck
Given Bob, is a customer with an online account  
When Bob, logs into his account with <email> and <currentPassword>
Then Bob, should see any accounts he is link to on the screen
Examples:
|email||currentPassword|
|bge123_10002044@studentmail.ul.ie||password|


Scenario: Customer has both Business and Home accounts linked to them
Meta:@accountOneCheck
Given Bob, is a online account customer with Residential and Business Accounts
When Bob, login  his account using <email> and <currentPassword>
Then Bob, should see any all accounts he is linked to on the screen 
Examples:
|email||currentPassword|
|bge123_10002044@studentmail.ul.ie||password|


Scenario: Customer online My Accounts has account that shouldn’t be showing
Meta:@accountOneCheck
Given Bob, is a customer with an online account and has a Level Pay account and has a Prepay account
When Bob, logs into his account <email> <currentPassword>
Then Bob, should see the Level pay account on the screen and should not see the Prepay account on the screen
Examples:
|email||currentPassword|
|bge123_10002044@studentmail.ul.ie||password|


Scenario: Customers online My Accounts doesn't show account linked to them
Meta:@accountOneCheck
Given Bob, is a customer with an online account and has a Level Pay account
When Bob, logins into his account  <email> and <currentPassword>
Then Bob, should see the Level pay account on the screen
Examples:
|email||currentPassword|
|bge123_10002044@studentmail.ul.ie||password|