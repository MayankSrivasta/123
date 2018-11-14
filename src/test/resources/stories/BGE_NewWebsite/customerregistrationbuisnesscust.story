Meta:
Narrative:
Customer trying to register BGE Online account with valid credentials and able to register. 

Scenario: Registration with valid inputs
Meta:
@regression @register
Given Bob, as Business Customer accessing Bord Gais website
When Bob, register with valid inputs <accNo> <mprnGPRN> <phoneNo> <eMail> to create BGE Online account
Then Bob, should be able to set up a BGE Online account successfully
Examples:
|accNo||mprnGPRN||phoneNo||eMail|
|5306342407||10007133158||4808||bge123_test86@atest.ie|


Scenario: Registration with invalid inputs
Meta:
@regression @register
Given Bob is a Business customer
When Bob trying to register with Invalid inputs <accNum> <mpgpRN> <contactNo> <mail>
Then Bob should see the error message as Account number should be 10 digits and MPRN/GPRN should be 7/11 digits
Then Bob should see the error message as Phone no. should be last 4 digits
Then Bob should see the error message as Please enter a valid email
When Bob trying to register with all mandate fields are empty
Then Bob should see the mandate fields needs to be given for registration error message
When Bob as a Business Customer, registering with invalid <accnumber> <GPRN> <phoneNumber> <email>
Then Bob should see the registration error message as Ooops!! It looks like something wasn�t quite right and not allowed to register

Examples:
|accNum||mpgpRN||contactNo||mail||accnumber||GPRN||phoneNumber||email|
|4157||256||1||test||5241639874||4152639||5874||test@bordgais.ie|