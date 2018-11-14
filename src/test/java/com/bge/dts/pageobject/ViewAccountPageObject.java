package com.bge.dts.pageobject;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;


public class ViewAccountPageObject extends PageObject{

WebElementFacade driver;
	
	@FindBy (xpath="//div[@class='header__section header__section--icon']")
	public WebElementFacade loginButtonNew;
	
	@FindBy (xpath="//input[@name='email']")
	public WebElementFacade email;
	
	@FindBy (xpath="//input[@name='password']")
	public WebElementFacade password;
	
	@FindBy (xpath="//button[@class='button primary arrow full-width ']")
	public WebElementFacade signIn;
	
	@FindBy (xpath="//h1[@class='main-title  normal-m-b']")
	public WebElementFacade myAccountHeaderText;
				
	@FindBy (xpath="//h4[contains(text(),'Gas')]")
	public WebElementFacade gasAccount;
	
	@FindBy (xpath="//h4[contains(text(),'Electricity')]")
	public WebElementFacade electricityAccount;
	
	@FindBy (xpath="//a[@class='button secondary back arrow inline m-t-12']")
	public WebElementFacade backButton;
	
	@FindBy (xpath="//button[@class='transparent button arrow inline small header__link header__register']")
	public WebElementFacade logout;
	
	@FindBy (xpath="//span[contains(text(),'Level Pay')]")
	public WebElementFacade levelPay;
	
}
