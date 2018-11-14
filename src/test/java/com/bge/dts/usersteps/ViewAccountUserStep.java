package com.bge.dts.usersteps;

import org.openqa.selenium.Keys;

import com.bge.dts.pageobject.ViewAccountPageObject;
import com.bge.dts.utils.UnifiedResourceLocator;

public class ViewAccountUserStep  extends ViewAccountPageObject{


	public void openURL(){
	//openAt("https://qa.bordgaisenergynew.ie/sign-in");
		openAt(UnifiedResourceLocator.URL);
	}

	public void typeSearchText(String sSearchTerm){
	}

	public void clickLogin(){
		element(loginButtonNew).click();	
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
			System.out.println("signIn Button is is not visible");
	}
	

	public void myAccountHeaderTextCheck(){	
		try {
			Thread.sleep(3000);
			if(element(myAccountHeaderText).isCurrentlyVisible())
				System.out.println("Customer can see his Accounts");
			else
				System.out.println("My Account Header Text is not visible");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void gasAccountCheck(){	
		if(element(gasAccount).isCurrentlyVisible())
		{   element(gasAccount).click();	
			System.out.println("Customer can see his Account Details");
		}else
			System.out.println("Account is is not visible");
	}
	
	public void electricityAccountCheck(){	
		if(element(electricityAccount).isCurrentlyVisible())
		{   element(electricityAccount).click();	
			System.out.println("Customer can see his Account Details");
		}else
			System.out.println("Account is is not visible");
	}
	
	public void backButtonClick(){
		element(backButton).click();
	}
	
	public void logoutButtonClick(){
		element(logout).click();
	}
	public void levelPayCheck(){
		if(element(levelPay).isVisible())
			System.out.println("Level Pay is visible");
		else System.out.println("Level Pay is not visible");
		
	}
	public void refresh(){
		element(loginButtonNew).sendKeys(Keys.F5);
	}
}
