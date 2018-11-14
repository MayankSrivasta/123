Scenario: Customer selects 'Dual Fuel' Tab and is viewing applicable offers and sees Discounted Unit Rate specific to each offer
Meta:@offer123
Given Bob, is on the 'Our Plans' page and selects the 'Dual Fuel' Tab
When Bob, views the applicable offers available to him
Then Bob, should see the discounted unit rate for Gas and Electricity relevant to the offers 

Scenario: Customer selects 'Gas' Tab and is viewing applicable offers and sees Discounted Unit Rate specific to each offer
Meta:@offer123
Given Bob,is on the 'Our Plans' page and selects the 'Gas' Tab
When Bob,view the applicable offer  to him
Then Bob, should see the discounted unit rate for Gas relevant to the offers

Scenario: Customer selects 'Electricity' Tab and is viewing applicable offers and sees Discounted Unit Rate specific to each offer
Meta:@offer123
Given Bob, is on the Our Plan page and selects the 'Electricity' Tab
When Bob, views the applicable offers  to him
Then Bob, should see the discounted unit rate for Electricity relevant to the offers