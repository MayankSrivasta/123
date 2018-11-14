package com.bge.dts.usersteps;

import com.bge.dts.pageobject.LoginLogoutPageObject;
import com.bge.dts.utils.UnifiedResourceLocator;

public class LogoutUserStepFile  extends LoginLogoutPageObject{

	public void openURL(){
		openAt(UnifiedResourceLocator.LOGIN_LOGOUT);
	}

	public void typeSearchText(String sSearchTerm){

	}

	public void clickLogin(){
		withAction().moveToElement($(loginButton)).perform();
		element(loginButton).isDisplayed();
		if(element(loginButton).isCurrentlyVisible())
			element(loginButton).click();	
		else
			System.out.println("Login Button is not enabled.");		
	}

	public void emailEnter(String email2){
		withAction().moveToElement($(email)).perform();
		element(email).isDisplayed();
		if(element(email).isCurrentlyVisible())
			element(email).sendKeys(email2);
		else
			System.out.println("Email TextBox is not enabled.");
	}

	public void passwordEnter(String password2){
		withAction().moveToElement($(password)).perform();
		element(password).isDisplayed();
		if(element(password).isCurrentlyVisible())
			element(password).sendKeys(password2);
		else 
			System.out.println("Password TextBox is not enabled.");
	}

	public void signInClick(){
		withAction().moveToElement($(signIn)).perform();
		element(signIn).isDisplayed();
		if(element(signIn).isCurrentlyVisible())
			element(signIn).click();
		else 
			System.out.println("SignIn Button is not enabled.");
	}

	public void myAccountsPresent(){
		withAction().moveToElement($(myAccounts)).perform();
		element(myAccounts).isDisplayed();
		if(element(myAccounts).isCurrentlyVisible()){
			element(myAccounts).getText().equals("This will be where the user will eventually land when they log in... ");
		}
	}


	public void logoutClick(){
		withAction().moveToElement($(logout)).perform();
		element(logout).isDisplayed();
		if(element(logout).isCurrentlyVisible())
			element(logout).click();
		else 
			System.out.println("LogOut Button is not enabled.");
	}

	public void contactMessage(){
		if(element(contactUs).isCurrentlyVisible());
	}

}
