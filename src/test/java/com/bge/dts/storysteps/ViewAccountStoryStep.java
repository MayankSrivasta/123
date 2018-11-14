package com.bge.dts.storysteps;
import org.jbehave.core.annotations.*;

import com.bge.dts.usersteps.ViewAccountUserStep;

public class ViewAccountStoryStep {

	ViewAccountUserStep viewAccUS;
	
	//scenario -1
	@Given("Bob, is a customer with an online account")
	public void loginClickOne(){
		viewAccUS.openURL();
		viewAccUS.clickLogin();
}	
	@When("Bob, logs into his account with <email> and <currentPassword>")
	public void enterCredentialsOne(String email,String currentPassword){
		viewAccUS.emailEnter(email);
		viewAccUS.passwordEnter(currentPassword);
		viewAccUS.signInClick();
	}
	@Then("Bob, should see any accounts he is link to on the screen")
	public void seeAccountOne(){
		
		viewAccUS.myAccountHeaderTextCheck();
		viewAccUS.logoutButtonClick();
	}		

	//scenario -2
	@Given("Bob, is a online account customer with Residential and Business Accounts")
	public void loginClickTwo(){
		//viewAccUS.openURL();
		viewAccUS.clickLogin();
}	
	@When("Bob, login  his account using <email> and <currentPassword>")
	public void enterCredentialsTwo(String email,String currentPassword){
		viewAccUS.emailEnter(email);
		viewAccUS.passwordEnter(currentPassword);
		viewAccUS.signInClick();
	}
	@Then("Bob, should see any all accounts he is linked to on the screen")
	public void seeAccountTwo(){
		viewAccUS.myAccountHeaderTextCheck();
		viewAccUS.gasAccountCheck();
		viewAccUS.backButtonClick();
		viewAccUS.electricityAccountCheck();
		viewAccUS.backButtonClick();
		viewAccUS.logoutButtonClick();
	}	
	
	//scenario-3
	@Given("Bob, is a customer with an online account and has a Level Pay account and has a Prepay account")
	public void loginClickThree(){
		viewAccUS.clickLogin();
	}
	
	@When("Bob, logs into his account <email> <currentPassword>")
	public void enterCredentialsThree(String email,String currentPassword){
		viewAccUS.emailEnter(email);
		viewAccUS.passwordEnter(currentPassword);
		viewAccUS.signInClick();
	}
	
	@Then("Bob, should see the Level pay account on the screen and should not see the Prepay account on the screen")
	public void seeAccountThree(){
		viewAccUS.myAccountHeaderTextCheck();
		viewAccUS.gasAccountCheck();
		viewAccUS.levelPayCheck();
		viewAccUS.logoutButtonClick();
	}
	//scenario -4
	@Given("Bob, is a customer with an online account and has a Level Pay account")
	public void loginClickFour(){
		//viewAccUS.openURL();
		//viewAccUS.refresh();
		viewAccUS.clickLogin();
}	
	@When("Bob, logins into his account  <email> and <currentPassword>")
	public void enterCredentialsFour(String email,String currentPassword){
		viewAccUS.emailEnter(email);
		viewAccUS.passwordEnter(currentPassword);
		viewAccUS.signInClick();
	}
	@Then("Bob, should see the Level pay account on the screen")
	public void seeAccountFour(){
		viewAccUS.myAccountHeaderTextCheck();
		viewAccUS.gasAccountCheck();
		viewAccUS.levelPayCheck();
	}	
	
}
