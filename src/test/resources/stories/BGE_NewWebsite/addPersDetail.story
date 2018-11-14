Narrative:
As a Customer who has selected an offer, I want to ability to provide my Personal Details.This story is for both New and Existing Customers.



Scenario: Customer is adding a joint account holder to their account where they are the Main account holder
Meta: @addPDetails321
Given John, a customer is the main account holder on an account
When John, wants to add an additional person to his account
Then John, should be able to add relevant details <firstName> <lastName> <email> <confirmEmail> <contactNo> to this person to his account
Examples:
|firstName||lastName||email||confirmEmail||contactNo|
|chris|brown||chrisborwn@gmx.net||chrisborwn@gmx.net||1234567891|





Scenario: Customer has selected an offer on the BGE website and has now been given relevant fields to complete

Given Bob, is purchasing a product
When Bob selects an offer on the BGE website
Then Bob should see various validation fields to be completed with personal data





