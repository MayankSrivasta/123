Meta:
Narrative:As a Customer, I want the ability to view my Account Details when logged into my Bord Gais account online

Scenario: Non Main account holder viewing their account details online 

Meta: @noMainAcc
Given Tina, a customer login into her account using <email> and <currentPassword> and is on her My Accounts Page and is not the main account holder on the account
Then Tina, clicks view account on one of her account
When Tina, should see the account details for that account and should not have the ability to switch Paperless on or off
Examples:
|email||currentPassword|
|bge123_iehmoeieh@hotmail.com||Password1|