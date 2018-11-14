package com.bge.dts.usersteps;

import com.bge.dts.pageobject.CustomerRegistrationPageObject;
import com.bge.dts.utils.UnifiedResourceLocator;

import net.thucydides.core.annotations.Step;

public class CustomerRegistrationUserSteps extends CustomerRegistrationPageObject{

	@Step
	public void openURL(){
		openAt(UnifiedResourceLocator.REG_CUSTOMER);
	}

	public void typeSearchText(String sSearchTerm){

	}

	@Step
	public void loginPortalVerification(){
		element(txtSignUpBGE).waitUntilPresent();
		if (element(txtSignUpBGE).isCurrentlyVisible()){
			System.out.println("User is in BGE Sign Up Page and Registration link is enabled");
		} else {
			System.out.println("User is not in BGE Sign Up Page. Please check the BGE Energy portal services are up and running");
		}
	}

	@Step
	public void busCustomerRegistration(String accNo,String mprnGPRN,String phoneNo,String eMail){

		if (element(radioBusinessCustomer).isCurrentlyVisible()){
			element(radioBusinessCustomer).click();
		} else {
			System.err.println("Business Cutomer button is not enabled. Please check and try again");
		}

		if (element(txtBoxAccNo).isCurrentlyVisible()){
			element(txtBoxAccNo).sendKeys(accNo);
		} else {
			System.err.println("Account No field is not enabled or available. Please check and try again");
		}

		if (element(txtBoxMPRNGPRN).isCurrentlyVisible()){
			element(txtBoxMPRNGPRN).sendKeys(mprnGPRN);
		} else {
			System.err.println("MPRN/GPRN field is not enabled or available. Please check and try again");
		}

		if (element(txtBoxPhoneNo).isCurrentlyVisible()){
			element(txtBoxPhoneNo).sendKeys(phoneNo);
		} else {
			System.err.println("Phone No field is not enabled or available. Please check and try again");
		}

		if (element(txtBoxEmail).isCurrentlyVisible()){
			element(txtBoxEmail).sendKeys(eMail);
		} else {
			System.err.println("eMail field is not enabled or available. Please check and try again");
		}

		if (element(btnRegister).isCurrentlyVisible()){
			element(btnRegister).click();	
		} else {
			System.err.println("Register button is not enabled or available. Please check and try again");
		}

	}

	@Step
	public void registerVerification(){	
		element(regSuccessful).waitUntilVisible();
		element(regSuccessful).isDisplayed();
		withAction().moveToElement($(tickMark)).perform();
		element(tickMark).isDisplayed();
		
	}		

	@Step
	public void fieldValidation(String accNum,String mpgpRN,String contactNo,String mail){
		withAction().moveToElement($(signupBGE)).perform();
			element(radioBusinessCustomer).waitUntilVisible();
		if (element(radioBusinessCustomer).isCurrentlyVisible()){
			element(radioBusinessCustomer).click();
		} else {
			System.err.println("Business Cutomer button is not enabled. Please check and try again");
		}

		if (element(txtBoxAccNo).isCurrentlyVisible()){
			element(txtBoxAccNo).sendKeys(accNum);
		} else {
			System.err.println("Account No field is not enabled or available. Please check and try again");
		}

		if (element(txtBoxMPRNGPRN).isCurrentlyVisible()){
			element(txtBoxMPRNGPRN).sendKeys(mpgpRN);
		} else {
			System.err.println("MPRN/GPRN field is not enabled or available. Please check and try again");
		}

		if (element(txtBoxPhoneNo).isCurrentlyVisible()){
			element(txtBoxPhoneNo).sendKeys(contactNo);
		} else {
			System.err.println("Phone No field is not enabled or available. Please check and try again");
		}

		if (element(txtBoxEmail).isCurrentlyVisible()){
			element(txtBoxEmail).sendKeys(mail);
		} else {
			System.err.println("eMail field is not enabled or available. Please check and try again");
		}

		if (element(btnRegister).isCurrentlyVisible()){
			element(btnRegister).click();			
		} else {
			System.err.println("Register button is not enabled or available. Please check and try again");
		}

	}
	@Step
	public void accNo(){			
		if (element(txtAccNoDigits).isCurrentlyVisible()){
			element(txtAccNoDigits).getText().equals("Account number should be 10 digits.");	
		} else {
			System.out.println("Account number should be 10 digits.Please check and try with valid account number");
		}
	}

	@Step
	public void mprnGPRN(){
		if (element(txtMPRNGPRNDigits).isCurrentlyVisible()){
			element(txtMPRNGPRNDigits).getText().equals("MPRN/GPRN should be 7/11 digits.");	
			System.out.println("MPRN/GPRN number should be 7 or 11 digits respectively.Please check and try with valid MPRN/GPRN number");
		} 
	}

	@Step
	public void phoneNo(){
		if (element(txtPhoneNoDigits).isCurrentlyVisible()){
			element(txtPhoneNoDigits).getText().equals("Phone no. should be last 4 digits.");	
			System.out.println("Phone number should be 4 digits.Please check and try with valid Phone number");
		} 			
	}

	@Step
	public void eMail(){
		if (element(txtValidEmail).isCurrentlyVisible()){
			element(txtValidEmail).getText().equals("Please enter a valid email.");	
			System.out.println("Entered email is invaild.Please check and try with valid email");
		} 
	}

	@Step		
	public void registerwithEmpty(){

		if (element(radioHomeCustomer).isCurrentlyVisible()){
			element(radioHomeCustomer).click();
		}	

		if (element(radioBusinessCustomer).isCurrentlyVisible()){
			element(radioBusinessCustomer).click();
		}

		if (element(btnRegister).isCurrentlyVisible()){
			element(btnRegister).click();			
		} 
	}

	@Step
	public void validateEmpty(){

		element(txtAccNoRequired).waitUntilPresent();
		element(txtAccNoRequired).getText().equals("Account number required");
		System.out.println("Enter vaild Account Number");

		element(txtMPRNGPRN).waitUntilPresent();
		element(txtMPRNGPRN).getText().equals("MPRN/GPRN required");
		System.out.println("Enter vaild MPRN/GPRN");

		element(txtPhoneNo).waitUntilPresent();
		element(txtPhoneNo).getText().equals("Phone number required.");
		System.out.println("Enter vaild Phone No");		

		element(txtEmail).waitUntilPresent();
		element(txtEmail).getText().equals("Email required");
		System.out.println("Enter vaild eMail");			

	}

	String regError;
	@Step
	public void registerwithInvalidInputs(String accnumber,String GPRN,String phoneNumber,String email){

		if (element(radioHomeCustomer).isCurrentlyVisible()){
			element(radioHomeCustomer).click();
		}

		if (element(radioBusinessCustomer).isCurrentlyVisible()){
			element(radioBusinessCustomer).click();
		}


		if (element(txtBoxAccNo).isCurrentlyVisible()){
			element(txtBoxAccNo).sendKeys(accnumber);
		} 

		if (element(txtBoxMPRNGPRN).isCurrentlyVisible()){
			element(txtBoxMPRNGPRN).sendKeys(GPRN);
		}

		if (element(txtBoxPhoneNo).isCurrentlyVisible()){
			element(txtBoxPhoneNo).sendKeys(phoneNumber);
		} 

		if (element(txtBoxEmail).isCurrentlyVisible()){
			element(txtBoxEmail).sendKeys(email);
		} 

		if (element(btnRegister).isCurrentlyVisible()){
			element(btnRegister).click();
			element(txtRegistrationError).waitUntilVisible();
		}
	}

	@Step
	public void registrationError(){

		if (element(txtRegistrationError).isDisplayed()){
			regError = element(txtRegistrationError).getTextValue();
			System.out.println("Registration is not successfull and error occured.Please see the error message"+regError);
		}
	}

	public void openRegURL(){
		openAt(UnifiedResourceLocator.REG_CUSTOMER);
	}

	public void typeSearchText1(String sSearchTerm){
	}

	//Field Validation without filling mandatory details
	public void home() {
		element(customer).waitUntilPresent();
		element(customer).click();
	}

	public void regMyAccount() {
		element(registerMyAccount).waitUntilPresent();
		element(registerMyAccount).click();
	}

	public void errorMessage() {
		element(errAccountNumber).isDisplayed();
		element(errMPRNGPRN).isDisplayed();
		element(errPhnNumber).isDisplayed();
		element(errEmails).isDisplayed();
	}

	//Online Customer Registration (Home customer)
	public void homeCust() {
		element(homeCustomer).click();		
	}

	public void enterDetail1(String AccountNumber ,String MprnGprn , String PhoneNumber , String EmailAddrs) {
		withAction().moveToElement($(signupBGE)).perform();
		element(accountNum).sendKeys(AccountNumber);
		element(mprnGprn).sendKeys(MprnGprn);
		element(phoneNum).sendKeys(PhoneNumber);
		element(emailAddres).sendKeys(EmailAddrs);
	}

	public void registerMyAccount1() {
		element(registerAccount).click();
	}

	public void regSuccessfull() {
		element(regSuccessful).waitUntilVisible();
		element(regSuccessful).isDisplayed();
		withAction().moveToElement($(tickMark)).perform();
				
	}


	//Field Validation incorrect details for Customer Registration Form (Home customer)
	public void homeCus() {
	}

	public void enterDetail(String AccountNo ,String MprnGprn , String PhoneNo , String Email) {
		withAction().moveToElement($(signupBGE)).perform();
		element(incrtAccountNum).sendKeys(AccountNo);
		element(incrtMprngprn).sendKeys(MprnGprn);
		element(incrtPhoneNum).sendKeys(PhoneNo);
		element(incrtEmailAddr).sendKeys(Email);
		
	}

	public void registerMyAccount() {
		element(registerAcc).click();
		withAction().moveToElement($(oopsError)).perform();
		element(oopsError).isDisplayed();
		withAction().moveToElement($(tryAgain)).perform();
		element(tryAgain).isDisplayed();
		element(tryAgain).click();
		
	}

	//Enter invalid number of digits (Home customer)
	public void homeCustome() {
	}

	public void enterDetails(String AccountNo ,String MprnGprn , String PhoneNo, String Email ) {
		withAction().moveToElement($(signupBGE)).perform();
		element(accountNumb).sendKeys(AccountNo);
		element(mprnGprnNumb).sendKeys(MprnGprn);
		element(phoneNumb).sendKeys(PhoneNo);
		element(emailid).sendKeys(Email);
	}

	public void registerMyAcc() {
		withAction().moveToElement($(registerAccoun)).perform();
		element(registerAccoun).click();
		element(acctErrorMessage).isDisplayed();
		element(mprnErrorMessage).isDisplayed();	
		element(phnErrorMessage).isDisplayed();	
		withAction().moveToElement($(registerAccoun)).perform();
		element(emailErrorMessage).isDisplayed();
	}
}

