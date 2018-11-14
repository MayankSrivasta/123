package com.bge.dts.storysteps;

import java.io.IOException;

import org.jbehave.core.annotations.*;

import com.bge.dts.usersteps.CustomerRegistrationUserSteps;

public class CustomerRegistrationStorySteps{

		//@ManagedPages
		CustomerRegistrationUserSteps customerregister;
			
		//Story steps for validate Positive scenarios in customer registration
		@Given("Bob, as Business Customer accessing Bord Gais website")	
		public void logintoBGEPortal(){			
			customerregister.openURL();
			customerregister.loginPortalVerification();
		}
		
		
		@When("Bob, register with valid inputs <accNo> <mprnGPRN> <phoneNo> <eMail> to create BGE Online account")
		public void registerBusinessCustomer(String accNo,String mprnGPRN,String phoneNo,String eMail){
			customerregister.busCustomerRegistration(accNo,mprnGPRN,phoneNo,eMail);
		}
		
		@Then("Bob, should be able to set up a BGE Online account successfully")
		public void verifyRegister(){
			customerregister.registerVerification();	
		}
		
		
		//Story steps for validate negative scenarios in customer registration	
		@Given ("Bob is a Business customer")
		public void logintoBGEBusPortal(){			
			customerregister.openURL();
			customerregister.loginPortalVerification();
		}
		
		@When("Bob trying to register with Invalid inputs <accNum> <mpgpRN> <contactNo> <mail>")
		public void registrationInvalidInputs(String accNum,String mpgpRN,String contactNo,String mail){
			customerregister.fieldValidation(accNum,mpgpRN,contactNo,mail);	
		}
		
		@Then("Bob should see the error message as Account number should be 10 digits and MPRN/GPRN should be 7/11 digits")
		public void verifyaccNo_MPRNGPRN(){
			customerregister.accNo();
			customerregister.mprnGPRN();
		}	
		
		@Then("Bob should see the error message as Phone no. should be last 4 digits")
		public void verifyPhoneNo(){
			customerregister.phoneNo();
		}
		
		@Then("Bob should see the error message as Please enter a valid email")
		public void verifyeMail(){
			customerregister.eMail();
		}
		
		@When("Bob trying to register with all mandate fields are empty")
		public void emptyinputsRegister(){
			customerregister.registerwithEmpty();
		}
		
		@Then("Bob should see the mandate fields needs to be given for registration error message")
		public void verifyEmpty(){
			customerregister.validateEmpty();
		}
		
		@When("Bob as a Business Customer, registering with invalid <accnumber> <GPRN> <phoneNumber> <email>")
		public void registerInvaild(String accnumber,String GPRN,String phoneNumber,String email){
			customerregister.registerwithInvalidInputs(accnumber,GPRN,phoneNumber,email);
		}
		
		@Then("Bob should see the registration error message as Ooops!! It looks like something wasn�t quite right and not allowed to register")
		public void verifyError(){
			customerregister.registrationError();
		}
		
		//Registration Form
		@Given("John, a customer")
		public void CustomerCust() {
			customerregister.openRegURL();
		}

		@When("John, without details to the registration for BGE Online account")
		public void registerAcc() {
			customerregister.home();	

		}

		@Then("John, should receive the error message Account number required,MPRN/GPRN required,Phone number required&Email required")
		public void errorMessage() {	
			customerregister.regMyAccount();
			
			customerregister.errorMessage();

		}	
		//Positive Scenarios

		@Given("John,is as BGE customer")
		public void Bbcustomer() {
		}

		@When("John, completes the registration <AccountNumber>,<MprnGprN>,<PhoneNumber>,<EmailAddrs>for BGE Online account")
		public void getRegisterDetails1(String AccountNumber ,String MprnGprN , String PhoneNumber , String EmailAddrs ) {
			customerregister.enterDetail1(AccountNumber,MprnGprN,PhoneNumber,EmailAddrs);
			customerregister.registerMyAccount1();

		}

		@Then("John, should be able to set up a BGE Online Home Customer account successfully")
		public void Registeracc() {
			customerregister.regSuccessfull();
			
		}

		//Incorrect details for Customer Registration Form

		@Given("John,is a BGE customer")
		public void Customercustomer() {
			customerregister.openRegURL();
		}

		@When("John, Enter incorrect details to the registration <AccountNo>,<MprnGprn>,<PhoneNo>,<Email>for BGE Online account")
		public void getRegistDetails(String AccountNo ,String MprnGprn , String PhoneNo , String Email ) {
			customerregister.enterDetail(AccountNo,MprnGprn,PhoneNo,Email);

		}

		@Then("John, should receive the error message Ooops!!It looks like something wasn't quite right.")
		public void registerAccoun() {
			customerregister.registerMyAccount(); 
			
		}
		
		// Enter invalid number of digits (Home customer)
		@Given("John, customer")
		public void CustomerCustomer() {
			customerregister.homeCustome();
		}

		@When("John, Enter the incorrect digits to the registration form by giving <AccountNo>,<MprnGprn>,<PhoneNo>,<Email>for BGE Online account")
		public void getRegisterDetails(String AccountNo ,String MprnGprn , String PhoneNo, String Email ) {
			customerregister.enterDetails(AccountNo,MprnGprn,PhoneNo,Email );

		}

		@Then("John, receive the error message Account number should be 10 digits.,MPRN/GPRN should be 7/11 digits.,Phone no. should be last 4 digits.,Please enter a valid email.")
		public void registerAccount() {
			customerregister.registerMyAcc(); 

		}

	}









