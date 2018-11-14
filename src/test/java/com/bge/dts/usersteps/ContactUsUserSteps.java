package com.bge.dts.usersteps;

import com.bge.dts.pageobject.ContactusSearchPageObject;
import com.bge.dts.utils.UnifiedResourceLocator;

public class ContactUsUserSteps extends ContactusSearchPageObject{


	
	public void openContactusURL(){

		openAt(UnifiedResourceLocator.CONTACT_US);
		
	}
	
		public void typeSearchText(String sSearchTerm){
		

	}

	public void headerVerification(){
		element(textHeader).isCurrentlyVisible();
	}

	public void headerverificationImage(){
		element(headerImage).isDisplayed();
		element(cookies).click();
	}

	public void verifyonHome(){
		element(btnLogin).isDisplayed();
	}

	public void taphomeImage(){
		bgehomelogo.click();
		cookies.click();

	}

	public void pressEnterToSearch(){
		btnSearch.click();
	}

	public void verifyEmergency(){
		element(txtEmergencyNumbers).isDisplayed();
		element(numEmergencyNumbers).isDisplayed();

	}

	public void verifyHomenum(){
		withAction().moveToElement($(txtHomeenergylocation)).perform();
		element(txtHomeEnergy).isDisplayed();
		element(numHomenErgyContact).isDisplayed();
	}

	public void verifyBusinessnum(){

		element(txtBusinessEnergy).isDisplayed();
		element(txtBusinessContact).isDisplayed();
	}

	public void verifyConnectnum(){
		withAction().moveToElement($(textConnection)).perform();
		element(textConnection).isDisplayed();

	}

	public void footerverification(){
		withAction().moveToElement($(oldTxtCopyRight)).perform();
		element(footerAboutus).isDisplayed();

	}

	public void verifyAboutus(){
		element(footerAboutus).isCurrentlyVisible();
		footerAboutus.click();
		element(textPageAboutus).isDisplayed();

	}

	public void verifyEnergycareer(){
		withAction().moveToElement($(oldTxtCopyRight)).perform();
		element(oldTxtCopyRight).isCurrentlyVisible();
		footerEnergycareers.click();
		element(textPageenergycareers).isDisplayed();

	}

	public void verifyWebsiteterms(){
		withAction().moveToElement($(oldTxtCopyRight)).perform();
		element(oldTxtCopyRight).isCurrentlyVisible();
		footerWebsiteterms.click();
		element(textWebsiteterms).isDisplayed();

	}

	public void verifyFacebook(){
		withAction().moveToElement($(newTxtCopyRight)).perform();
		element(newTxtCopyRight).isCurrentlyVisible();
		urlFacebook.click();
		element(btnLoginFacebook).isCurrentlyVisible();

	}


	public void openWhitegateURL(){

		openAt(UnifiedResourceLocator.WHITE_GATE);
			}


	public void typeSearchText1(String sSearchTerm){

	}


	public void openWhitegateURL(String username, String password) {
		element(txtEmailWhitegate).sendKeys(username);
		element(txtPassWhitegate).sendKeys(password);
		btnLoginWhitegate.click();
	}

}
