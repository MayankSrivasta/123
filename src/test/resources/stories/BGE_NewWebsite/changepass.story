Meta:

Narrative:
As a Customer, I want the ability to change my Password in my Profile Settings, when I am logged into my Bord Gais account online


Scenario: Customer Resetting Password
Meta:@test123
Given Bob, is a customer logged into his Profile Settings on his online account with <email> and <currentPassword>
When Bob, changes his <currentPassword> on his online account with <newPassword>
Then Bob, should be able to log into online account with <email> using <newPassword>
Examples:
|email||currentPassword||newPassword|
|bge123_1mckennedy@eircom.net||Password@8||Password@9|


Scenario: Customer tries to try log into online account using old Password
Meta:@test123
Given Bob, is a Customer that has recently changed his Password  
When Bob, enters his <email> and <oldPassword> on the login screen
Then Bob, should see the error Invalid username or password
Examples:
|email||oldPassword|
|bge123_1mckennedy@eircom.net||Password@8|

Scenario: Customer tries to use an invalid Current Password
Meta:@test123
Given Bob, is a customer logged into his Profile Settings on his online account using <email> and <currentPassword>
When Bob, tries an <invalidCurrentPassword> and <newPassword>
Then Bob, should see an error message
Examples:
|email||currentPassword||invalidCurrentPassword||newPassword|
|bge123_1mckennedy@eircom.net||Password@9||123||Password@10|

Scenario: Customer tries to save a Password that does not meet criteria
Meta:@test123
Given Bob, is a customer logged into his Profile Settings on his online account  <email> and <currentPassword>
When Bob, enters current Password <currentPassword> and invalid New Password <invalidNewPassword>
Then Bob, should see error message
Examples:
|email||currentPassword||invalidNewPassword|
|bge123_1mckennedy@eircom.net||Password@9||123|

Scenario: Customer tries to save an invalid Re-typing of New Password
Meta:@test123
Given Bob, is a customer logged into his Profile Settings on his  account <email> and <currentPassword>
When Bob, enters a password in Re-type new password field that does not match New password <newPassword> and <invalidNewPassword>
Then Bob, should sees  error message
Examples:
|email||currentPassword||newPassword||invalidNewPassword|
|bge123_1mckennedy@eircom.net||Password@9||Password@10||123|

