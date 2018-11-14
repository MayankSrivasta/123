package com.bge.dts.pageobject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ChangePasswordPageObject  extends PageObject{
	
	WebElementFacade driver;

	@FindBy (xpath=".//*[@id='root']/div/header/div[1]/div/button")
	public WebElementFacade loginButton;

	
	@FindBy (xpath=".//*[@id='root']/div/header/div[1]/div/div/div/div[1]/form/div[1]/input")
	public WebElementFacade email;
	
	@FindBy (xpath=".//*[@id='root']/div/header/div[1]/div/div/div/div[1]/form/div[2]/input")
	public WebElementFacade password;
	
	@FindBy (xpath=".//*[@id='root']/div/header/div[1]/div/div/div/div[1]/form/button[1]")
	public WebElementFacade signIn;
	
	
	
	@FindBy (xpath="//*[@id='root']/div/header/div[1]/div/div/div/div[1]/form/p")
	public WebElementFacade errorInvalidUserPass;
	
	
	@FindBy (xpath=".//*[@id='root']/div/header/div[1]/div/button[2]")
	public WebElementFacade profileIcon;
	
	
	@FindBy (xpath=".//*[@id='root']/div/header/div[1]/div/div/ul/li[3]/a")
	public WebElementFacade profileButton;
	
	
	@FindBy (xpath=".//*[@id='root']/div/section/div/div[4]/div/main/div/button")
	public WebElementFacade changeButton;

	
	@FindBy (xpath=".//*[@id='currentPassword']")
	public WebElementFacade currentPassword;
	//*[@id="currentPassword"]
	
	@FindBy (xpath=".//*[@id='password']")
	public WebElementFacade newPassword;
	//*[@id="password"]
	
	@FindBy (xpath=".//*[@id='password2']")
	public WebElementFacade reNewPassword;
	
	
	@FindBy (xpath="//*[@id='root']/div/section/div/div[4]/div/main/section/div[1]/div[1]/form/p")
	public WebElementFacade errorInvalidCurrentPass;
	
	
	@FindBy (xpath="//*[@id='root']/div/section/div/div[4]/div/main/section/div[1]/div[1]/form/div[3]/span[1]")
	public WebElementFacade errorReEnterNewPass;

	
	
	@FindBy (xpath="//*[@id='root']/div/section/div/div[4]/div/main/section/div[1]/div[1]/form/div[2]/span[1]")
	public WebElementFacade errorInvalidNewPass;


	
	@FindBy (xpath="//*[@id='root']/div/section/div/div[4]/div/main/section/div[2]/button[2]")
	public WebElementFacade savePassword;

	               
	@FindBy (xpath="//button[@class='transparent button arrow hide-for-mobile inline small']") 
	    public WebElementFacade logout;
	
}
