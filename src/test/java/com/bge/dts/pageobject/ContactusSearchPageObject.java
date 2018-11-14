package com.bge.dts.pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ContactusSearchPageObject extends PageObject {

	WebElementFacade driver;

	@FindBy(xpath="//h1[.='Contact us']")
	public WebElementFacade textHeader;

	@FindBy(xpath="//div[@class='parallax-filler']")
	public WebElementFacade headerImage;
	
	@FindBy(xpath="//a[@class='ok']")
	public WebElementFacade cookies;
	

	@FindBy(name="btnK")
	public WebElementFacade btnSearch;
	
	@FindBy(xpath="//img[@class='bge-logo']")
	public WebElementFacade bgehomelogo;

	@FindBy(xpath="//a[@class='login']")
	public WebElementFacade btnLogin;

	@FindBy(xpath="//h5[@class ='block__title block__title--white']")
	public WebElementFacade txtEmergencyNumbers;

	@FindBy(xpath="//a[@href='tel:1850 20 50 50']")
	public WebElementFacade numEmergencyNumbers;

	@FindBy(xpath="//h5[.='Home energy']")
	public WebElementFacade txtHomeEnergy;

	@FindBy(xpath="//p[.='Home energy, Bord Gáis Energy,']")
	public WebElementFacade txtHomeenergylocation;

	@FindBy(xpath="//p[.='01 611 0101']")
	public WebElementFacade numHomenErgyContact;

	@FindBy(xpath="//h5[.='Business energy']")
	public WebElementFacade txtBusinessEnergy;

	@FindBy(xpath="//p[.='01 611 0166']")
	public WebElementFacade txtBusinessContact;

	@FindBy(xpath="//h4[.='Connections']")
	public WebElementFacade textConnection;

	@FindBy(xpath="//a[@href='tel:1850 20 06 94']")
	public WebElementFacade numConnection;

	@FindBy(xpath="//p[.='© Bord Gáis Energy Limited 2018']")
	public WebElementFacade newTxtCopyRight;

	@FindBy(xpath="//div[@class='copyright']")
	public WebElementFacade oldTxtCopyRight;

	@FindBy(xpath="//a[.='About Us']")
	public WebElementFacade footerAboutus;

	@FindBy(xpath="//h1[.='About Us']")
	public WebElementFacade textPageAboutus;

	@FindBy(xpath="//a[.='Energy Careers']")
	public WebElementFacade footerEnergycareers;

	@FindBy(xpath="//h1[.='Energy Careers - Home']")
	public WebElementFacade textPageenergycareers;

	@FindBy(xpath="//a[.='Website Terms']")
	public WebElementFacade footerWebsiteterms;

	@FindBy(xpath="//h1[.='Website Terms']")
	public WebElementFacade textWebsiteterms;
	
	@FindBy(xpath="//a[@href='https://www.facebook.com/BordGaisEnergy']")
	public WebElementFacade urlFacebook;
	
	@FindBy(xpath="//label[@id='loginbutton']")
	public WebElementFacade btnLoginFacebook;
	
	@FindBy(xpath="//input[@name='email']")
	public WebElementFacade txtEmailWhitegate;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElementFacade txtPassWhitegate;
	
	@FindBy(xpath="//button[text()='Login']")
	public WebElementFacade btnLoginWhitegate;
	
	@FindBy(xpath="//a[@class='button secondary arrow back']")
	public WebElementFacade btnBacktohelp;
	}

