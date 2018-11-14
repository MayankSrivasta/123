package com.bge.dts.storysteps;

import org.jbehave.core.annotations.*;
import com.bge.dts.usersteps.ContactUsUserSteps;


public class ContactUsStorySteps {


	ContactUsUserSteps contactUserSteps;
	
	@Given("Tom, a customer")
	public void tomaUser(){
		contactUserSteps.openContactusURL();
	}

	@When("Tom,is on the Contact Us page")
	public void tomonContactUs(){
		contactUserSteps.headerVerification();
	}

	@Then("Tom, should be able to see the Header on the page")
	public void tomAbleToViewHeader(){
		contactUserSteps.headerVerification();
	}
	
	@When("Tom, press the Home icon")
	public void tapHomeImage(){
		contactUserSteps.taphomeImage();
	}
	

	@Then("Tom, should be re-directed back to the home page")
	public void verifyHomePage(){
		contactUserSteps.verifyonHome();
	}
	
	@When("Shane, goes to the Contact Us page")
	public void shaneOnContactus(){
		contactUserSteps.openContactusURL();
	}
	
	@Then("Shane, should see all the contact details for Emergency Numbers")
	public void verifyEmergencyNum(){
		contactUserSteps.verifyEmergency();
	}
	@Then("Shane, should see all the contact details for Home Energy")
	public void verifyHomeEnergyNum(){
		contactUserSteps.verifyHomenum();
	}
	
	@Then("Shane, should see all the contact details for Business Energy")
	public void verifyBusinessEnergyNum(){
		contactUserSteps.verifyBusinessnum();
	}
	
	@Then("Shane, should see all the contact details for Connection Numbers")
	public void verifyConnectionNum(){
		contactUserSteps.verifyConnectnum();
	}
	
	
	@Then("Tom, should be able to see the Footer on the page")
	public void tomAbleToViewFooter(){
		contactUserSteps.footerverification();
	}
	
	@When("Tom, press a link in the Footer")
	public void pressFooterUrl(){
		contactUserSteps.verifyAboutus();
	}
	
	
	
	@Then("Tom, should be re-directed back to the links page")
	public void verifyAllFooterUrl(){
		contactUserSteps.verifyEnergycareer();
		contactUserSteps.verifyWebsiteterms();
	}
	 
	
	@When("Tom, press a social media link in the Footer")
	public void verifySocialMedia(){
		contactUserSteps.verifyFacebook();

	}
	
	
	
}
