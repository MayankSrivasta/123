Narrative:Clark View his account Detail

Scenario: Commercial Account holder view his account  
Meta:@comAccDet
Given Clark login <email> and <currentPassword>
When Clark click on his  account
Then Clark should see the account details for that account and not see reference Level Pay or Paperless
Examples:
|email||currentPassword|
|bge123_joe@theiveaghtrust.ie||password|