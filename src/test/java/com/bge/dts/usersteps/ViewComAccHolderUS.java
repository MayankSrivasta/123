package com.bge.dts.usersteps;
import com.bge.dts.utils.UnifiedResourceLocator;

import com.bge.dts.pageobject.ViewComAccHolderPO;


public class ViewComAccHolderUS  extends ViewComAccHolderPO {

	
	
	public void openURL(){
		
			openAt(UnifiedResourceLocator.URL);
		}

		
		public void clickLogin(){
			element(loginButtonNew).click();	
				}

		public void emailEnter(String emailTwo){
			if(element(email).isCurrentlyVisible())
				element(email).sendKeys(emailTwo);
			else
				System.out.println("Email TextBox is not enabled.");
		}

		public void passwordEnter(String passwordTwo){
			if(element(password).isCurrentlyVisible())
				element(password).sendKeys(passwordTwo);
			else 
				System.out.println("Password TextBox is not enabled.");
		}

		public void signInClick(){	
			if(element(signIn).isCurrentlyVisible())
				element(signIn).click();	
			else
				System.out.println("signIn Button is is not visible");
		//explicit wait
			
			
			
		}
		
		public void electricityAccountCheck(){	
			if(element(electricityAccount).isCurrentlyVisible())
			{   element(electricityAccount).click();	
				System.out.println("Customer can see his Account Details");
			}else
				System.out.println("Account is is not visible");
		}
		
		public void checkPaperless(){
			if(element(paperless).isCurrentlyVisible())
				System.out.println("PaperLess is Visible it should not be visible");
			
		}
		
		
}
