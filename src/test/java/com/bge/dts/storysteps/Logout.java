package com.bge.dts.storysteps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import com.bge.dts.usersteps.LogoutUserStepFile;

import net.thucydides.core.annotations.Steps;

public class Logout {
	@Steps
	LogoutUserStepFile bgePO2;
	
	//LOGOUT POSITIVE
	
	
	@Given("Shyam a customer is logged into his BGE online account with <validEmail> and <validPassword>")
	public void loginClickSF(String validEmail,String validPassword){
		bgePO2.openURL();
		bgePO2.clickLogin();
		bgePO2.emailEnter(validEmail);
		bgePO2.passwordEnter(validPassword);
		bgePO2.signInClick();
		bgePO2.myAccountsPresent();
}	
	@When("Shyam, logs out of his BGE online account")
	public void logoutClick() throws InterruptedException{
		bgePO2.logoutClick();
		}
	
	@Then("Shyam, is out of his Bord Gais Account")
	public void seesResult(){	
	bgePO2.contactMessage();
	}
	
}