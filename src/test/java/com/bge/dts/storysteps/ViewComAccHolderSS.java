package com.bge.dts.storysteps;
import org.jbehave.core.annotations.*;
import com.bge.dts.usersteps.ViewComAccHolderUS;
public class ViewComAccHolderSS {
	
	ViewComAccHolderUS viewAcc;
	
	
	@Given("Clark login <email> and <currentPassword>")
	public void loginClicks(String email,String currentPassword){
		viewAcc.openURL();
		viewAcc.clickLogin();
		viewAcc.emailEnter(email);
		viewAcc.passwordEnter(currentPassword);
		viewAcc.signInClick();
	}
	
	@When("Clark click on his  account")
	public void enterCredentials(){
		viewAcc.electricityAccountCheck();
	}
		
		
	@Then("Clark should see the account details for that account and not see reference Level Pay or Paperless")
	public void seeAccountDetails(){
		viewAcc.checkPaperless();
	}	
		
		
}
