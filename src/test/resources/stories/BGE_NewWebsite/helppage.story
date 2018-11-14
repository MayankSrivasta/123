Meta:
Narrative:Feature: 
FAQ long answer

Scenario: Answer on the FAQ is too long for the section, the customer select the 'Read full answer' the customer is redirected to a page with the full answer
Meta:help and support long answer reading
@regression @help
Given Bob, customer is reading a long answer on the Help Section
When Bob, select Read full answer
Then Bob, should be redirected to page with full answer to the question

Scenario: Customer opening Help Section Dashboard
Meta:Help Section Dashboard
@regression @help
Given Bob, a customer
When Bob, is on the Help Section main page
Then Bob, should see the Dashboard with Topics

Scenario: Customer select a Topic on the help section dashboard
Meta: FAQ Block
@regression @help
Given Bob, a customer
When Bob, selects a Topic from the Dasboard
Then Bob, should see the FAQ's for that topic appear on the page