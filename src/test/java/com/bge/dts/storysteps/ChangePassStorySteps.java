package com.bge.dts.storysteps;
import org.jbehave.core.annotations.*;
import com.bge.dts.usersteps.ChangePasswordUserSteps;

public class ChangePassStorySteps {

	ChangePasswordUserSteps chanPass;
	
	
	
	
	//1
	@Given("Bob, is a customer logged into his Profile Settings on his online account with <email> and <currentPassword>")
	public void loginOne(String email,String currentPassword){
		chanPass.launchBGEPortal();
		chanPass.clickLogin();
		chanPass.emailEnter(email);
		chanPass.passwordEnter(currentPassword);
		chanPass.signInClick();
	
	}
	
	@When("Bob, changes his <currentPassword> on his online account with <newPassword>")
	public void change(String currentPassword,String newPassword){
		chanPass.clickProfileIconButton();
		chanPass.clickProfileButton();
		chanPass.clickChangePassButton();
		chanPass.currentPasswordEnter(currentPassword);
		chanPass.newPasswordEnter(newPassword);
		chanPass.reNewPasswordEnter(newPassword);
		chanPass.savePasswordButton();
		chanPass.logoutButton(); 
	
		
	}
	@Then("Bob, should be able to log into online account with <email> using <newPassword>")
	public void loginNewPass(String email,String newPassword){
		//chanPass.launchBGEPortal();
		chanPass.clickLogin();
		chanPass.emailEnter(email);
		chanPass.passwordEnter(newPassword);
		chanPass.signInClick();	
		chanPass.logoutButton();
	
		
	}
	//2
	@Given("Bob, is a Customer that has recently changed his Password")
	public void loginTwo(){
		
		chanPass.clickLogin();		
	}
	
	@When("Bob, enters his <email> and <oldPassword> on the login screen")
	public void changeTwo(String email,String oldPassword){
		chanPass.emailEnter(email);
		chanPass.passwordEnter(oldPassword);
		chanPass.signInClick();
	}
	@Then("Bob, should see the error Invalid username or password")
	public void seeError(){
	
		chanPass.errorInvalidUser();
		
	}
	//3

	@Given("Bob, is a customer logged into his Profile Settings on his online account using <email> and <currentPassword>")
	public void loginThree(String email,String currentPassword){
		chanPass.launchBGEPortal();
		chanPass.clickLogin();
		chanPass.emailEnter(email);
		chanPass.passwordEnter(currentPassword);
		chanPass.signInClick();
	}
	
	
	@When("Bob, tries an <invalidCurrentPassword> and <newPassword>")
	public void changeCurrentPassword(String newPassword,String invalidCurrentPassword){
		chanPass.clickProfileIconButton();
		chanPass.clickProfileButton();
		chanPass.clickChangePassButton();
		chanPass.currentPasswordEnter(invalidCurrentPassword);
		chanPass.newPasswordEnter(newPassword);
		chanPass.reNewPasswordEnter(newPassword);
	}
	@Then("Bob, should see an error message")
	public void seeErrorTwo(){
		chanPass.savePasswordButton();
		chanPass.errorInvalidCurrentPassMessage(); 
		chanPass.logoutButton();
	}
	
	//4
	
			@Given("Bob, is a customer logged into his Profile Settings on his online account  <email> and <currentPassword>")
			public void loginFour(String email,String currentPassword){
			//	chanPass.launchBGEPortal();
				chanPass.clickLogin();
				chanPass.emailEnter(email);
				chanPass.passwordEnter(currentPassword);
				chanPass.signInClick();
			}
			@When("Bob, enters current Password <currentPassword> and invalid New Password <invalidNewPassword>")
			public void changePass(String currentPassword,String invalidNewPassword){
				chanPass.clickProfileIconButton();
				chanPass.clickProfileButton();
				chanPass.clickChangePassButton();
				chanPass.currentPasswordEnter(currentPassword);
				chanPass.newPasswordEnter(invalidNewPassword);
				chanPass.reNewPasswordEnter(invalidNewPassword);
			}
			@Then("Bob, should see error message")
			public void seeErrorThree(){
				chanPass.savePasswordButton();
				chanPass.errorInvalidNewPassMessage();
				chanPass.logoutButton();
			}

			//5

				@Given("Bob, is a customer logged into his Profile Settings on his  account <email> and <currentPassword>")
				public void loginFive(String email,String currentPassword){
					
					chanPass.launchBGEPortal();
					chanPass.ref();
					chanPass.pageUP();
					chanPass.clickLogin();
					chanPass.emailEnter(email);
					chanPass.passwordEnter(currentPassword);
					chanPass.signInClick();
				}
				@When("Bob, enters a password in Re-type new password field that does not match New password <newPassword> and <invalidNewPassword>")
				public void changePassTwo(String currentPassword,String newPassword,String invalidNewPassword){
					chanPass.clickProfileIconButton();
					chanPass.clickProfileButton();
					chanPass.clickChangePassButton();
					chanPass.currentPasswordEnter(currentPassword);
					chanPass.newPasswordEnter(newPassword);
					chanPass.reNewPasswordEnter(invalidNewPassword);
				}
				@Then("Bob, should sees  error message")
				public void seeErrorFour(){
					chanPass.errorReEnterNewPassMessage();
					chanPass.savePasswordButton();
					chanPass.logoutButton();
				}
			
	
}
