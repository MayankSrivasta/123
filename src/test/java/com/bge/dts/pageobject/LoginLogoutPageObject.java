package com.bge.dts.pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginLogoutPageObject extends PageObject{

 	WebElementFacade driver;
	
	@FindBy (xpath="//*[@id='root']/div/header/div[1]/div/button/span")
	public WebElementFacade loginButton;
	
	@FindBy (xpath="//input[@name='email']")
	public WebElementFacade email;
	
	@FindBy (xpath="//input[@name='password']")
	public WebElementFacade password;
	
	@FindBy (xpath="//button[@class='button primary arrow full-width ']")
	public WebElementFacade signIn;
	
	@FindBy (xpath="//*[@id='root']/div/header/div[1]/div/div/div[1]/form/p")
	public WebElementFacade errorMessage;
		
	@FindBy (xpath="//*[@id='root']/div/header/div[1]/div/div/div[1]/form/div[1]/span[1])")
	public WebElementFacade enterYourEmailError;
	
	@FindBy (xpath="//*[@id='root']/div/header/div[1]/div/div/div[1]/form/div[2]/span[1]")
	public WebElementFacade enterYourPasswordError;
	
	@FindBy (xpath="//p[.='My accounts']")
	public WebElementFacade myAccounts;

	@FindBy (xpath="//button[@class='transparent button arrow hide-for-mobile inline small']")
	public WebElementFacade logout;
			
	@FindBy (xpath="//h1[@class='main-title main-page-header--mobile-margin-title']")
	public WebElementFacade contactUs;
	
	}
