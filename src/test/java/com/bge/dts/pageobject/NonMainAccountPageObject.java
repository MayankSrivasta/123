package com.bge.dts.pageobject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class NonMainAccountPageObject extends PageObject {
	@FindBy (xpath="//*[@id='root']/div/header/div[1]/div/button/span")
	public WebElementFacade loginButton;

	
	@FindBy (xpath="//*[@id='root']/div/header/div[1]/div/div/div[1]/form/div[1]/input")
	public WebElementFacade email;
	
	@FindBy (xpath="//*[@id='root']/div/header/div[1]/div/div/div[1]/form/div[2]/input")
	public WebElementFacade password;
	
	@FindBy (xpath="//*[@id='root']/div/header/div[1]/div/div/div[1]/form/button")
	public WebElementFacade signIn; 
	
	
	@FindBy (xpath="//*[@id='root']/div/section/div/div[2]/div/a/div[2]/p[2]")
	public WebElementFacade viewAccount; 
	
	@FindBy (xpath="//*[@id='root']/div/section/div/div[3]/div/div[1]/div[2]/div/p[2]/span")
	public WebElementFacade paperLess; 
	
	
}
