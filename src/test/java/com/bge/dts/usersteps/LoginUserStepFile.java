package com.bge.dts.usersteps;

import com.bge.dts.pageobject.LoginLogoutPageObject;
import com.bge.dts.utils.UnifiedResourceLocator;


public class LoginUserStepFile extends LoginLogoutPageObject{


	public void openURL(){
		openAt(UnifiedResourceLocator.LOGIN_LOGOUT);
	}

	public void typeSearchText(String sSearchTerm){
	}

	public void clickLogin(){	
		if(element(loginButton).isCurrentlyVisible())
			element(loginButton).click();	
		else
			System.out.println("Login Button is not enabled.");
	}

	public void emailEnter(String email2){
		if(element(email).isCurrentlyVisible())
			element(email).sendKeys(email2);
		else
			System.out.println("Email TextBox is not enabled.");
	}

	public void passwordEnter(String password2){
		if(element(password).isCurrentlyVisible())
			element(password).sendKeys(password2);
		else 
			System.out.println("Password TextBox is not enabled.");
	}

	public void signInClick(){	
		if(element(signIn).isCurrentlyVisible())
			element(signIn).click();
		else
			System.out.println("SignIn Button is not visible");
	}


	public void logoutClick() {
		withAction().moveToElement($(logout)).perform();
		element(logout).isDisplayed();
			element(logout).click();
		
	}

	public void myAccountsPresent(){
		if(element(myAccounts).isCurrentlyVisible()){
			element(myAccounts).getText().equals("This will be where the user will eventually land when they log in... ");
		}
	}

	public void contactMessage(){
		if(element(contactUs).isCurrentlyVisible())
			element(contactUs).getText().equals("Contact us");
		else
			System.out.println("The Customer is not logged out of his Account");
	}

	public void incorrectUP(){
		if(element(errorMessage).isCurrentlyVisible())
			element(errorMessage).getText().equals("Incorrect username/password.");
		else
			System.out.println("Incorrect username/password is not visible");
	}

	public void enterEmailError(){
		if(element(enterYourEmailError).isCurrentlyVisible())
			element(enterYourEmailError).getText().equals("Please enter your email.");
		else 
			System.out.println("Enter your Email message is not present");
	}

	public void enterPassError(){
		if(element(enterYourPasswordError).isCurrentlyVisible())
			element(enterYourPasswordError).getText().equals("Please enter your password.");
		else
			System.out.println("Enter your Password message is not present");
	}	
}
