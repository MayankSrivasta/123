Meta:
Narrative:
Customer login to their BGE account.

Scenario: Customer login into his account with valid credentials
Meta:
@regression @login
Given Shyam, a customer
When Shyam, logs into his BGE account with <validEmail> and <validPassword> 
Then Shyam, should see his BGE account Dashboard
Examples:
|validEmail||validPassword|
|BGE123_0.rulez@gmx.net||password|

Scenario: Customer should not login to their account with incorrect credentials
Meta:
#@regression @login 
Given Shyam, is a BGE customer
When Shyam, logs into his BGE account with <invalidEmail> and <invalidPassword>
Then Shyam should see the error message as Incorrect username/password
When Shyam, logs into his BGE account with <validEmail> and  <invalidPassword>
Then Shyam should see the error message as Incorrect username/password.
When Shyam, logs into his BGE account with <invalidEmail> and  <validPassword>
Then Shyam should see the error message as Incorrect username/password.
When Shyam, logs into his BGE account without providing valid credentials(empty) and click sign in
Then Shyam, should see the error message as Please enter your email and Please enter your password
Examples:
|invalidEmail||invalidPassword||validEmail||validPassword|
|mayank@bordgais.ie||mayank||BGE123_0.rulez@gmx.net||password|
