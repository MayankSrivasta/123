package com.bge.dts.storysteps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.bge.dts.usersteps.HelpUserSteps;

public class HelpStorySteps {

	HelpUserSteps helpUserStep;

	@Given("Bob, customer is reading a long answer on the Help Section")
	public void tomaUser(){
		helpUserStep.openURL();
		
		
	}

	@When("Bob, select Read full answer")
	public void taptoRead(){
		helpUserStep.billsAndpayments();
		System.out.println("Bob, select Read full answer");		
		helpUserStep.readfullanswer();
	}


	@Then("Bob, should be redirected to page with full answer to the question")
	public void completeAnswer(){
		System.out.println("Bob, should be redirected to page with full answer to the question");
		helpUserStep.verifyCompletepage();

	}

	@Given("Bob, a customer")
	public void openURL(){
		helpUserStep.openURL();

	}

	@When("Bob, is on the Help Section main page")
	public void userOnHelpSection(){
		helpUserStep.userOnhelpsec();

	}

	@Then("Bob, should see the Dashboard with Topics")
	public void useronViewTopics(){
		helpUserStep.userViewstitles();

	}

	@When("Bob, selects a Topic from the Dasboard")
	public void userSelectsaTopic(){
		helpUserStep.taponMovinghome();

	}

	@Then("Bob, should see the FAQ's for that topic appear on the page")
	public void verifyFaq(){
		helpUserStep.verifyfreqQuest();

	}


}
