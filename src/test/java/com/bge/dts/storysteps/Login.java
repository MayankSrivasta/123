package com.bge.dts.storysteps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.bge.dts.usersteps.LoginUserStepFile;

import net.thucydides.core.annotations.Steps;

public class Login {
	
	@Steps
	LoginUserStepFile loginUS;
	

	// LOGIN POSITIVE
	
	@Given("Shyam, a customer")
	public void loginClickSF(){
		loginUS.openURL();
		loginUS.clickLogin();
}	
	@When("Shyam, logs into his BGE account with <validEmail> and <validPassword>")
	public void enterCredentialsOne(String validEmail,String validPassword){
		loginUS.emailEnter(validEmail);
		loginUS.passwordEnter(validPassword);
		loginUS.signInClick();
		
	}
	@Then("Shyam, should see his BGE account Dashboard")
	public void seeAccount(){
		loginUS.myAccountsPresent();
		loginUS.logoutClick();
	}	
	
	
	// LOGIN NEGATIVE
	
	@Given("Shyam, is a BGE customer")
	public void customerBge() {		
		loginUS.openURL();
		loginUS.clickLogin();
	}
	@When("Shyam, logs into his BGE account with <invalidEmail> and <invalidPassword>")
	public void enterCredentialsTwo(String invalidEmail,String invalidPassword){
		loginUS.emailEnter(invalidEmail);
		loginUS.passwordEnter(invalidPassword);
		loginUS.signInClick();
	}
	@Then("Shyam should see the error message as Incorrect username/password")
	public void errorMessageOne(){
		loginUS.incorrectUP();
	}
	
	@When("Shyam, logs into his BGE account with <validEmail> and  <invalidPassword>")
	public void enterCredentialsThree(String validEmail,String invalidPassword){
		loginUS.openURL();
		loginUS.clickLogin();
		loginUS.emailEnter(validEmail);
		loginUS.passwordEnter(invalidPassword);
		loginUS.signInClick();
	}
	@Then("Then Shyam should see the error message as Incorrect username/password.")
	public void errorMessageTwo(){
		loginUS.incorrectUP();
	}
	@When("Shyam, logs into his BGE account with <invalidEmail> and  <validPassword>")
	public void enterCredentialsFour(String invalidEmail,String validPassword){
		loginUS.openURL();
		loginUS.clickLogin();
		loginUS.emailEnter(invalidEmail);
		loginUS.passwordEnter(validPassword);
		loginUS.signInClick();
	}
	@Then("Shyam should see the error message as Incorrect username/password.")
	public void errorMessageThree(){
		loginUS.incorrectUP();
	}
	@When("Shyam, logs into his BGE account without providing valid credentials(empty) and click sign in")
	public void enterCredentialsEmpty(){
		loginUS.openURL();
		loginUS.clickLogin();
		loginUS.signInClick();
	}
	@Then("Shyam, should see the error message as Please enter your email and Please enter your password")
	public void errorMessageEmpty(){
		loginUS.enterEmailError();
		loginUS.enterPassError();
		
	}
	
}