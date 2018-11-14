package com.bge.dts.pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CustomerRegistrationPageObject extends PageObject{

	//css locator for Sign Up BGE text verification
	@FindBy (css="h1.main-title.normal-m-b") 
	public WebElementFacade txtSignUpBGE;		

	//css locator for txtRegistration Form
	@FindBy (css="h3[class=section-header__title]")
	public WebElementFacade txtRegistrationForm;

	//xpath locator for input type for Business Customer
	@FindBy (xpath="//label[@for='BUSINESS']")
	public WebElementFacade radioBusinessCustomer;

	//xpath locator for input type for Home Customer
	@FindBy (xpath="//label[@for='RESIDENTIAL']")
	public WebElementFacade radioHomeCustomer;

	//css locator for Account No
	@FindBy (css="input[name='accountNo']")
	public WebElementFacade txtBoxAccNo;

	//css locator for MPRN/GPRN
	@FindBy (css="#mprnGprn")
	public WebElementFacade txtBoxMPRNGPRN;

	//css locator for PhoneNo
	@FindBy (css="#phoneNo")
	public WebElementFacade txtBoxPhoneNo;

	//css locator for email
	@FindBy (css="#email")
	public WebElementFacade txtBoxEmail;

	//css locator for Register my account
	@FindBy (css=".button.arrow.primary-sub") 
	public WebElementFacade btnRegister;

	//css locator for btntryAgain
	@FindBy (css=".button.arrow.secondary.undefined") 
	public WebElementFacade btnTryAgain;
	
	@FindBy (xpath="//h1[@class='main-title normal-m-b']")
	public WebElementFacade signupBGE;

	//xpath locator for txtaccnorequired
	@FindBy (xpath="//span[contains(@class,'error-text')]  [contains(text(),'Account number required')]") 
	public WebElementFacade txtAccNoRequired;

	//xpath locator for txtMPRNGPRN
	@FindBy (xpath="//span[contains(@class,'error-text')]  [contains(text(),'MPRN/GPRN required')]") 
	public WebElementFacade txtMPRNGPRN;		

	//xpath locator for txtPhoneNo
	@FindBy (xpath="//span[contains(@class,'error-text')]  [contains(text(),'Phone number required.')]") 
	public WebElementFacade txtPhoneNo;

	//xpath locator for txteMail
	@FindBy (xpath="//span[contains(@class,'error-text')]  [contains(text(),'Email required')]") 
	public WebElementFacade txtEmail;

	//xpath locator for txtaccno10digits
	@FindBy (xpath="//span[contains(@class,'error-text')]  [contains(text(),'Account number should be 10 digits.')]") 
	public WebElementFacade txtAccNoDigits;

	//xpath locator for txtMPRNGPRN7/11Digits
	@FindBy (xpath="//span[contains(@class,'error-text')]  [contains(text(),'MPRN/GPRN should be 7/11 digits.')]") 
	public WebElementFacade txtMPRNGPRNDigits;

	//xpath locator for txtPhoneno4Digits
	@FindBy (xpath="//span[contains(@class,'error-text')]  [contains(text(),'Phone no. should be last 4 digits.')]") 
	public WebElementFacade txtPhoneNoDigits;

	//xpath locator for txtvalidEmail
	@FindBy (xpath="//span[contains(@class,'error-text')]  [contains(text(),'Please enter a valid email.')]") 
	public WebElementFacade txtValidEmail;

	//xpath locator for txtregistrationError
	@FindBy (xpath="//div//h3[contains(text(),'Ooops!! It looks like something wasn’t quite right.')]") 
	public WebElementFacade txtRegistrationError;

	//xpath locator for txtregistrationError
	@FindBy (xpath="//div//h3[contains(text(),'Ooops!! It looks like something wasn’t quite right.')]") 
	public WebElementFacade txtRegistrationError1;
	
	//Login Registrationform

	@FindBy(xpath="//div[contains(text(),'I am a Home customer')]")
	public WebElementFacade customer;

	@FindBy(xpath="//button[@class='button arrow primary-sub ']")
	public WebElementFacade registerMyAccount;

	@FindBy(xpath="//span[contains(text(),'Account number required')]")
	public WebElementFacade errAccountNumber;

	@FindBy(xpath="//span[contains(text(),'MPRN/GPRN required')]")
	public WebElementFacade errMPRNGPRN;

	@FindBy(xpath="//span[contains(text(),'Phone number required')]")
	public WebElementFacade errPhnNumber;

	@FindBy(xpath="//span[contains(text(),'Email required')]")
	public WebElementFacade errEmails;

	//Positive Scenarios
	@FindBy(xpath="//div[contains(text(),'I am a Home customer')]")
	public WebElementFacade homeCustomer;

	@FindBy(xpath="//input[@name='accountNo']")
	public WebElementFacade accountNum;

	@FindBy(xpath="//input[@name='mprnGprn']")
	public WebElementFacade mprnGprn;

	@FindBy(xpath="//input[@name='phoneNo']")
	public WebElementFacade phoneNum;

	@FindBy(xpath="//input[@id='email']")
	public WebElementFacade emailAddres;

	@FindBy(xpath="//button[@class='button arrow primary-sub ']")
	public WebElementFacade registerAccount;

	@FindBy(xpath="//h3[.='Registration successful! Nice work.']")
	public WebElementFacade regSuccessful;

	@FindBy(xpath="//div[@class='response-icon']")
	public WebElementFacade tickMark;
	
	//Incorrect values

	@FindBy(xpath="//div[contains(text(),'I am a Home customer')]")
	public WebElementFacade Customer;

	@FindBy(xpath="//input[@name='accountNo']")
	public WebElementFacade incrtAccountNum;

	@FindBy(xpath="//input[@name='mprnGprn']")
	public WebElementFacade incrtMprngprn;

	@FindBy(xpath="//input[@name='phoneNo']")
	public WebElementFacade incrtPhoneNum;

	@FindBy(xpath="//input[@id='email']")
	public WebElementFacade incrtEmailAddr;

	@FindBy(xpath="//button[@class='button arrow primary-sub ']")
	public WebElementFacade registerAcc;

	@FindBy(xpath="//div[@class='response-icon']")
	public WebElementFacade Oops;

	@FindBy(xpath="//button[@class='button arrow secondary']")
	public WebElementFacade tryAgain;
	
	@FindBy(xpath="//h3[.='Ooops!! It looks like something wasn’t quite right.']")
	public WebElementFacade oopsError;

	@FindBy(xpath="//input[@name='accountNo']")
	public WebElementFacade accountNumb;

	@FindBy(xpath="//input[@name='mprnGprn']")
	public WebElementFacade mprnGprnNumb;

	@FindBy(xpath="//input[@name='phoneNo']")
	public WebElementFacade phoneNumb;

	@FindBy(xpath="//input[@id='email']")
	public WebElementFacade emailid;

	@FindBy(xpath="//button[@class='button arrow primary-sub ']")
	public WebElementFacade registerAccoun;

	@FindBy(xpath="//span[contains(text(),'Account number should be 10 digits')]")
	public WebElementFacade acctErrorMessage;

	@FindBy(xpath="//span[contains(text(),'MPRN/GPRN should be 7/11 digits')]")
	public WebElementFacade mprnErrorMessage;

	@FindBy(xpath="//span[contains(text(),'Phone no. should be last 4 digits')]")
	public WebElementFacade phnErrorMessage;

	@FindBy(xpath="//span[contains(text(),'Please enter a valid email')]")
	public WebElementFacade emailErrorMessage;
}

