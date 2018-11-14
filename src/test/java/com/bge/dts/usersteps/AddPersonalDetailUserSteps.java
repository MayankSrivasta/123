package com.bge.dts.usersteps;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import com.bge.dts.pageobject.AddPersonalDetailPageObject;

import com.bge.dts.utils.UnifiedResourceLocator;
public class AddPersonalDetailUserSteps extends AddPersonalDetailPageObject{

	public void openURL(){

		openAt(UnifiedResourceLocator.urlOffers);
		
	}
	public void switchNowClick(){
		
				if(element(switchNow).isCurrentlyVisible())
					element(switchNow).click();	
				else
					System.out.println("SwitchNow Button is not enabled.");
	}
	
	public void viewInfoTitle(){
		if(element(infoTitle).isCurrentlyVisible())
			element(infoTitle).click();	
		else
			System.out.println("InfoTitle is not Visible.");
				}
	
	public void continueButtonClick(){
		if(element(continueButton).isCurrentlyVisible())
			element(continueButton).click();				
				}
	
	public void title(){

		if(element(titleDrop).isCurrentlyVisible()){
			element(titleDrop).click();
			//element(titleDrop).sendKeys("Mr.");
			Select select=new Select(element(titleDrop));
			select.selectByVisibleText("Mr.");
			//element(titleSelect).click();
		   
		    }	
		else
			System.out.println("title is not Visible.");
				}
	
	public void day(){

		if(element(dayDrop).isCurrentlyVisible()){
			element(dayDrop).click();
		    element(daySelect).click();
		    }	
		else
			System.out.println("ContinueButton is not Visible.");
				}
	
	public void month(){

		if(element(monthDrop).isCurrentlyVisible()){
			element(monthDrop).click();
		    element(monthSelect).click();
		    }	
		else
			System.out.println("month is not Visible.");
				}
	
	public void year(){

		if(element(yearDrop).isCurrentlyVisible()){
			element(yearDrop).click();
		    element(yearSelect).click();
		    }	
		else
			System.out.println("year is not Visible.");
				}
	
	public void phone(){

		if(element(phoneDrop).isCurrentlyVisible()){
			element(phoneDrop).click();
		    element(phoneSelect).click();
		    }	
		else
			System.out.println("phone is not Visible.");
				}
	public void firstNameUS(String firstName){

		if(element(firstNamePO).isCurrentlyVisible()){
			element(firstNamePO).click();
		   element(firstNamePO).sendKeys(firstName);
		    }	
		else
			System.out.println("firstName is not Visible.");
				}
	
	public void lastNameUS(String lastName){

		if(element(lastNamePO).isCurrentlyVisible()){
			element(lastNamePO).click();
		   element(lastNamePO).sendKeys(lastName);
		    }	
		else
			System.out.println("firstName is not Visible.");
				}
	
	public void emailUS(String email){

		if(element(emailPO).isCurrentlyVisible()){
			element(emailPO).click();
		   element(emailPO).sendKeys(email);
		    }	
		else
			System.out.println("email is not Visible.");
				}
	

	public void confirmEmailUS(String confirmEmail){

		if(element(confirmEmailPO).isCurrentlyVisible()){
			element(confirmEmailPO).click();
		   element(confirmEmailPO).sendKeys(confirmEmail);
		    }	
		else
			System.out.println("confirmEmail is not Visible.");
				}
	
	public void contactNoUS(String contactNo){

		if(element(contactNoPO).isCurrentlyVisible()){
			element(contactNoPO).click();
		   element(contactNoPO).sendKeys(contactNo);
		    }	
		else
			System.out.println("contactNo is not Visible.");
				}
	
	public void nextClick(){

		if(element(next).isCurrentlyVisible()){
			element(next).click();
			}	
		else
			System.out.println("contactNo is not Visible.");
				}
	public void refresh(){
		element(switchNow).sendKeys(Keys.F5);
	}
public void switchNowMoveUp(){	
				withAction().moveToElement($(switchNow)).perform();
				withAction().moveToElement($(switchNow)).perform();
				withAction().moveToElement($(switchNow)).perform();
				withAction().moveToElement($(switchNow)).perform();
				withAction().moveToElement($(switchNow)).perform();
				withAction().moveToElement($(switchNow)).perform();
				withAction().moveToElement($(switchNow)).perform();
				withAction().moveToElement($(switchNow)).perform();
				withAction().moveToElement($(switchNow)).perform();
				
				
		}
	
}
