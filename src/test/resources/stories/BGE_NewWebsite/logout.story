Meta:
Narrative:
As a user Customer log out from their account
 
Scenario: Customer logging out of their online account
Meta:
@regression @logout
Given Shyam a customer is logged into his BGE online account with <validEmail> and <validPassword>
When Shyam, logs out of his BGE online account
Then Shyam, is out of his Bord Gais Account
Examples:
|validEmail||validPassword|
|BGE123_0.rulez@gmx.net||password|

