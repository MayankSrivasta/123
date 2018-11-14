package com.bge.dts.pageobject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ViewComAccHolderPO extends PageObject{

	
	
	@FindBy (xpath="//div[@class='header__section header__section--icon']")
	public WebElementFacade loginButtonNew;
	
	@FindBy (xpath="//input[@name='email']")
	public WebElementFacade email;
	
	@FindBy (xpath="//input[@name='password']")
	public WebElementFacade password;
	
	@FindBy (xpath="//button[@class='button primary arrow full-width ']")
	public WebElementFacade signIn;
	
	@FindBy (xpath="//h4[@class='account-list__title__text']")
	public WebElementFacade electricityAccount;
	
	@FindBy (xpath="//h5[@class='paperless-bar__text paperless-bar__title']")
	public WebElementFacade paperless;
	
}
