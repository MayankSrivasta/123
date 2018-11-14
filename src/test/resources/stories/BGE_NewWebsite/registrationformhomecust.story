Scenario: Field Validation without filling mandatory details for Customer Registration Form (Home customer)
Meta:
@regression @homecustomer

Given John, a customer
When John, without details to the registration for BGE Online account
Then John, should receive the error message Account number required,MPRN/GPRN required,Phone number required&Email required

Scenario:Online Customer Registration Form (Home customer)
Meta:
@regression @homecustomer

Given John,is as BGE customer
When John, completes the registration <AccountNumber>,<MprnGprN>,<PhoneNumber>,<EmailAddrs>for BGE Online account
Then John, should be able to set up a BGE Online Home Customer account successfully

Examples:
|AccountNumber| |MprnGprN| |PhoneNumber| |EmailAddrs|
|8295079066| |1187327| |0411| |bge123_test87@atest.ie|

Scenario:Field Validation incorrect details for Customer Registration Form (Home customer)
Meta:
@regression @homecustomer

Given John,is a BGE customer
When John, Enter incorrect details to the registration <AccountNo>,<MprnGprn>,<PhoneNo>,<Email>for BGE Online account
Then John, should receive the error message Ooops!!It looks like something wasn't quite right.

Examples:
|AccountNo| |MprnGprn| |PhoneNo| |Email|
|8112482000| |1166310| |8144| |BGE123_0.rulez@gmx.net|


Scenario: System throws an error message if the user enter invalid number of digits (Home customer)
Meta:
@regression @homecustomer

Given John, customer
When John, Enter the incorrect digits to the registration form by giving <AccountNo>,<MprnGprn>,<PhoneNo>,<Email>for BGE Online account
Then John, receive the error message Account number should be 10 digits.,MPRN/GPRN should be 7/11 digits.,Phone no. should be last 4 digits.,Please enter a valid email.

Examples:
|AccountNo| |MprnGprn| |PhoneNo| |Email|
|12482000| |1310| |44| |BGE123_0.rulez@gmx|


