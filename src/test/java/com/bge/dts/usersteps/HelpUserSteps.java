package com.bge.dts.usersteps;

import com.bge.dts.pageobject.HelpPageObject;
import com.bge.dts.utils.UnifiedResourceLocator;

public class HelpUserSteps extends HelpPageObject{


	public void openURL() {
		openAt(UnifiedResourceLocator.HELP);

	}

	public void billsAndpayments() {
		txtBillsandpayments.click();
		withAction().moveToElement($(QuestionHelpMeFix)).perform();
		element(QuestionHelpMeFix).isCurrentlyVisible();
		QuestionHelpMeFix.isDisplayed();
		QuestionHelpMeFix.click();
								
	}

	public void readfullanswer()
	{
		withAction().moveToElement($(btnFullAnswer)).perform();
		element(btnFullAnswer).isCurrentlyVisible();
		btnFullAnswer.click();

	}

	public void verifyCompletepage()
	{
		withAction().moveToElement($(btnBacktohelp)).perform();
		element(btnBacktohelp).isCurrentlyVisible();
				btnBacktohelp.click();

	}

	public void userOnhelpsec() {
		txtHelpandsupport.isCurrentlyVisible();
	}

	public void userViewstitles() {
		withAction().moveToElement($(txtEmergency)).perform();
		element(txtEmergency).isCurrentlyVisible();

		withAction().moveToElement($(txtAppandengineers)).perform();
		element(txtAppandengineers).isCurrentlyVisible();

		withAction().moveToElement($(txtBreakdowns)).perform();
		element(txtBreakdowns).isCurrentlyVisible();

		withAction().moveToElement($(txtMeters)).perform();
		element(txtMeters).isCurrentlyVisible();

		withAction().moveToElement($(txtTechnicalsupport)).perform();
		element(txtTechnicalsupport).isCurrentlyVisible();

		withAction().moveToElement($(txtMovinghome)).perform();
		element(txtMovinghome).isCurrentlyVisible();

		withAction().moveToElement($(txtMyaccount)).perform();
		element(txtMyaccount).isCurrentlyVisible();

		withAction().moveToElement($(txtBillsandpayments)).perform();
		element(txtBillsandpayments).isCurrentlyVisible();

	}

	public void taponMovinghome() {
		btnMovinghome.click();

	}

	public void verifyfreqQuest() {
		txtFaq.isDisplayed();
		txtFaq.click();
		txtFaqanswer.isDisplayed();

	}



}
