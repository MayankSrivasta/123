package com.bge.dts.storysteps;

import org.jbehave.core.annotations.*;

import com.bge.dts.usersteps.AddPersonalDetailUserSteps;

public class AddPersonalDetailStorySteps {

	AddPersonalDetailUserSteps  addPDetails;
	
	
	
	//scenario-2
	
	@Given("John, a customer is the main account holder on an account")
	public void openLinkTwo(){
		addPDetails.openURL();
		//addPDetails.refresh();
		//addPDetails.switchNowMoveUp();
	}
	
	@When("John, wants to add an additional person to his account")
	public void switchNowTwo(){
		addPDetails.switchNowClick();
		addPDetails.continueButtonClick();
	}
	@Then("John, should be able to add relevant details <firstName> <lastName> <email> <confirmEmail> <contactNo> to this person to his account")
	public void viewInfoTitleTwo(String firstName,String lastName,String email,String confirmEmail,String contactNo){
		addPDetails.title();
		addPDetails.firstNameUS(firstName);
		addPDetails.lastNameUS(lastName);
		addPDetails.day();
		addPDetails.month();
		addPDetails.year();
		addPDetails.emailUS(email);
		addPDetails.confirmEmailUS(confirmEmail);
		addPDetails.phone();
		addPDetails.contactNoUS(contactNo);
		addPDetails.nextClick();
	}
	
	
	//scenario -1
	@Given("Bob, is purchasing a product")
	public void openLinkOne(){
		addPDetails.openURL();
	}
	
	@When("Bob selects an offer on the BGE website")
	public void switchNowOne(){
		addPDetails.switchNowClick();
	}
	@Then("Bob should see various validation fields to be completed with personal data")
	public void viewInfoTitleOne(){
		addPDetails.viewInfoTitle();
	}
	
	

		
		
		
	
	
		
	
	
	
	
}
