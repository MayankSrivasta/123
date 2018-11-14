Meta:

Narrative:
As a user
I should be able to see all th details in the contact us page

Scenario: Customer view Header on the new Contact Us page
Meta:
@regression @contactus
Given Tom, a customer
When Tom,is on the Contact Us page
Then Tom, should be able to see the Header on the page
When Tom, press the Home icon
Then Tom, should be re-directed back to the home page

Scenario: Customer viewing Emergency Number Contact details
Meta:
@regression @contactus
When Shane, goes to the Contact Us page
Then Shane, should see all the contact details for Emergency Numbers
Then Shane, should see all the contact details for Home Energy
Then Shane, should see all the contact details for Business Energy
Then Shane, should see all the contact details for Connection Numbers

Scenario: Customer view the Footer on the new Contact Us page
Meta:
@regression @contactus
Then Tom, should be able to see the Footer on the page

Scenario: Customer can be re-directed to the different link on the Footer
Meta:
@regression @contactus
When Tom, press a link in the Footer
Then Tom, should be re-directed back to the links page

Scenario: Customer can be re-directed to the Social Media Channels from the icons in the Footer
Meta: Social Media Links
@regression @contactus
Given Tom, a customer
When Tom,is on the Contact Us page
When Tom, press a social media link in the Footer
