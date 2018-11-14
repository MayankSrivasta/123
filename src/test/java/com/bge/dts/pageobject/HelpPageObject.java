package com.bge.dts.pageobject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HelpPageObject extends PageObject {
		
	@FindBy(xpath="//h1[.='Help & support']")
	public WebElementFacade txtHelpandsupport;
	
	@FindBy(xpath="//h5[.='Emergencies']")
	public WebElementFacade txtEmergency;
		
	@FindBy(xpath="//h5[.='Appliances & engineers']")
	public WebElementFacade txtAppandengineers;
	
	@FindBy(xpath="//h5[.='Breakdowns']")
	public WebElementFacade txtBreakdowns;
	
	@FindBy(xpath="//h5[.='Meters']")
	public WebElementFacade txtMeters;
	
	@FindBy(xpath="//h5[.='Technical support']")
	public WebElementFacade txtTechnicalsupport;
	
	@FindBy(xpath="//h5[.='Moving home']")
	public WebElementFacade txtMovinghome;
	
	@FindBy(xpath="//h5[.='My account']")
	public WebElementFacade txtMyaccount;
	
	@FindBy(xpath="//h1[@class='main-title undefined']")
	public WebElementFacade mainTitle;
		
	@FindBy(xpath="//h5[.='Bills & payments']")
	public WebElementFacade txtBillsandpayments;
	
	@FindBy(xpath="//h3[.='Who will help me fix this?']")
	public WebElementFacade QuestionHelpMeFix;
	
	@FindBy(xpath="//a[.='Read full answer']")
	public WebElementFacade btnFullAnswer;

	@FindBy(xpath="//a[@class='button secondary arrow back full-width-mobile']")
	public WebElementFacade btnBacktohelp;
		
	@FindBy(xpath="//p[.='Gas and electricity supply, updating your billing']")
	public WebElementFacade btnMovinghome;
		
	@FindBy(xpath="//h3[.='Finding out if we supply your new home']")
	public WebElementFacade txtFaq;
		
	@FindBy(xpath="	//p[contains(text(),' Your account number and GPRN')]")
	public WebElementFacade txtFaqanswer;
	}
