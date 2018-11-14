package com.bge.dts.usersteps;

import org.openqa.selenium.Keys;

import com.bge.dts.pageobject.ChangePasswordPageObject;
import com.bge.dts.utils.UnifiedResourceLocator;

public class ChangePasswordUserSteps extends ChangePasswordPageObject{
	
	public void launchBGEPortal(){
		openAt(UnifiedResourceLocator.URL);
	}
public void typeSearchText(String sSearchTerm){
		

	}
	public void clickLogin(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(element(loginButton).isCurrentlyVisible())
			element(loginButton).click();	
		else
			System.out.println("Login Button is not enabled.");
			
	}
	public void emailEnter(String email2){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		
		if(element(signIn).isCurrentlyVisible()){
			element(signIn).click();
			}
		else
			System.out.println("SignIn Button is not visible");
		}
	
	public void errorInvalidUser(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(element(errorInvalidUserPass).isCurrentlyVisible()){
			element(errorInvalidUserPass).equals("Incorrect username/password.");
			}
		else
			System.out.println("Error Invalid UserPassword is not visible");
		}
	
	
	
	public void clickProfileIconButton(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		element(profileIcon).click();
		/*   if(element(profileIcon).isCurrentlyVisible()){
			element(profileIcon).click();
			}
		else
			System.out.println("ProfileIcon Button is not visible"); */
		}   
	
	public void clickProfileButton(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(element(profileButton).isCurrentlyVisible()){
			element(profileButton).click();
			}
		else
			System.out.println("ProfileButton Button is not visible");
		}
	public void clickChangePassButton(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(element(changeButton).isCurrentlyVisible()){
			element(changeButton).click();
			}
		else
			System.out.println("ChangeButton Button is not visible");
		}
	
	public void currentPasswordEnter(String currentPassword2){
		
		if(element(currentPassword).isCurrentlyVisible()){
			element(currentPassword).click();
			element(currentPassword).sendKeys(currentPassword2);
			}
		else
			System.out.println("Change Button  is not visible");
		}
	
	public void newPasswordEnter(String newPassword2){
		
		if(element(newPassword).isCurrentlyVisible()){
			element(newPassword).click();
			element(newPassword).sendKeys(newPassword2);
			}
		else
			System.out.println("NewPassword  is not visible");
		}
	
	public void errorInvalidCurrentPassMessage(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(element(errorInvalidCurrentPass).isCurrentlyVisible()){
			element(errorInvalidCurrentPass).equals("Incorrect current password.");
			}
		else
			System.out.println("Error Invalid Current Password  is not visible");
		}
	
	public void errorInvalidNewPassMessage(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(element(errorInvalidNewPass).isCurrentlyVisible()){
			element(errorInvalidNewPass).equals("Please enter a valid password");
			}
		else
			System.out.println("Error Invalid New Password  is not visible");
		}
	public void errorReEnterNewPassMessage(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(element(errorReEnterNewPass).isCurrentlyVisible()){
			element(errorReEnterNewPass).equals("Passwords do not match");
			}
		else
			System.out.println("Error ReEnter New Password  is not visible");
		}
	
	
	public void reNewPasswordEnter(String reNewPassword2){
		
		if(element(reNewPassword).isCurrentlyVisible()){
			element(reNewPassword).click();
			element(reNewPassword).sendKeys(reNewPassword2);
			}
		else
			System.out.println("ReEnter New Password is not visible");
		}
	
	
	public void savePasswordButton(){
		
		if(element(savePassword).isCurrentlyVisible()){
			element(savePassword).click();
			}
		else
			System.out.println("Save Password Button is not visible");
		}
	
	public void logoutButton(){
		
		try {
			Thread.sleep(2000);
		
			if(element(logout).isCurrentlyVisible()){				
				
				withAction().moveToElement($(logout)).perform();
				withAction().moveToElement($(logout)).perform();
				withAction().moveToElement($(logout)).perform();
				withAction().moveToElement($(logout)).perform();
				withAction().moveToElement($(logout)).perform();
				withAction().moveToElement($(logout)).perform();
				withAction().moveToElement($(logout)).perform();
				withAction().moveToElement($(logout)).perform();
				withAction().moveToElement($(logout)).perform();
				withAction().moveToElement($(logout)).perform();
				withAction().moveToElement($(logout)).perform();
				withAction().moveToElement($(logout)).perform();
				withAction().moveToElement($(logout)).perform();
				withAction().moveToElement($(logout)).perform();
				withAction().moveToElement($(logout)).perform();
				withAction().moveToElement($(logout)).perform();
				withAction().moveToElement($(logout)).perform();
				withAction().moveToElement($(logout)).perform();
				element(logout).isCurrentlyVisible();
				withAction().moveToElement($(logout)).perform();
				logout.isDisplayed();
				withAction().moveToElement($(logout)).perform();
				element(logout).click(); 
				}
			else
				System.out.println("Save Password Button is not visible");
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	
	public void ref(){
		element(loginButton).sendKeys(Keys.F5);
	}
	public void pageUP(){
		withAction().moveToElement($(loginButton)).perform();
		withAction().moveToElement($(loginButton)).perform();
		withAction().moveToElement($(loginButton)).perform();
		withAction().moveToElement($(loginButton)).perform();
		withAction().moveToElement($(loginButton)).perform();
		withAction().moveToElement($(loginButton)).perform();
		withAction().moveToElement($(loginButton)).perform();
		withAction().moveToElement($(loginButton)).perform();
		withAction().moveToElement($(loginButton)).perform();
		withAction().moveToElement($(loginButton)).perform();
		withAction().moveToElement($(loginButton)).perform();
		withAction().moveToElement($(loginButton)).perform();
		withAction().moveToElement($(loginButton)).perform();
		withAction().moveToElement($(loginButton)).perform();
		
	}
	public void top(){
		
	}
	
}
