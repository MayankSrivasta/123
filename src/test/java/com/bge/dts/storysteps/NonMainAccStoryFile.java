package com.bge.dts.storysteps;


import org.jbehave.core.annotations.*;
import com.bge.dts.usersteps.NonMainAccUserSteps;


public class NonMainAccStoryFile {


	NonMainAccUserSteps nonMain;
	
	@Given("Tina, a customer login into her account using <email> and <currentPassword> and is on her My Accounts Page and is not the main account holder on the account")
	public void login(String email,String currentPassword){
		nonMain.launchBGEPortal();
		nonMain.clickLogin();
		nonMain.emailEnter(email);
		nonMain.passwordEnter(currentPassword);
		nonMain.signInClick();
	}
	
	@When("Tina, clicks view account on one of her account")
	public void checks(){
		nonMain.viewAcc();
	}
	
	@Then("Tina, should see the account details for that account and should not have the ability to switch Paperless on or off")
	public void paperLessCheck(){
		nonMain.paperLessVisible();
	}
}
