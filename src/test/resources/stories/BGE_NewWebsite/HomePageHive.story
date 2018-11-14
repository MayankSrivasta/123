Feature: Smart Home page


Scenario: Customer can view the Smart Home page from the Home header
Meta:@hive
Given Tom, a customer is in the Home section of the BGE site
When Tom, clicks on Smart Home tab in the Home Header 
Then Tom, should sees the Smart Home page


Scenario: Customer can view the Smart Home page directly from the url
Meta:@hive
Given Tom, a customer who knows the url for the Smart Home page
When Tom, goes to the Smart Home url  
Then Tom, should see the Smart Home page