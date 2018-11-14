package com.bge.dts.usersteps;


import com.bge.dts.pageobject.NonMainAccountPageObject;
import com.bge.dts.utils.UnifiedResourceLocator;

public class NonMainAccUserSteps extends NonMainAccountPageObject{

	
	public void launchBGEPortal(){
		openAt(UnifiedResourceLocator.URL);
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
	
		if(element(signIn).isCurrentlyVisible()){
			element(signIn).click();
			}
		else
			System.out.println("SignIn Button is not visible");
		}
	public void viewAcc(){
		
		if(element(viewAccount).isCurrentlyVisible()){
			element(viewAccount).click();
			}
		else
			System.out.println("View Account Button is not visible");
		}
public void paperLessVisible(){
		
		if(element(paperLess).isCurrentlyVisible()){
			System.out.println("Customer doesn't not have the ability to switch 'Paperless' on or off becuase if paperless keyword is visible then paperless toggle button won't be visible");
			}
		else
			System.out.println("PaperLess is not visible");
		}
	
}
