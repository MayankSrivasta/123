package com.bge.dts.pageobject;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class AddPersonalDetailPageObject extends PageObject {

	WebElementFacade driver;
	
	            
	@FindBy(xpath="//button[@class='button primary-sub arrow plan__footer__switch']")
	public WebElementFacade switchNow;
	
	@FindBy(xpath="//p[@class='required-information__title']")
	public WebElementFacade infoTitle;
	               
	@FindBy(xpath="//button[@class='button primary arrow']")
	public WebElementFacade continueButton;
		               
	@FindBy(xpath="//input[@id='mainDetails.salutation']//parent::div[@class='css-1hwfws3 bge-select__value-container']//parent::div[@class='css-luj9iq bge-select__control']")
	public WebElementFacade titleDrop;
		
	@FindBy(xpath="html/body/div[2]/div[1]/section/div/div[3]/div[1]/main/form/div[1]/div[1]/div/div/div[2]/div/div[1]")
	public WebElementFacade titleSelect;

	@FindBy(xpath="//div[@class='group group--narrow']//following::div[@class='css-luj9iq bge-select__control'][1]")
	public WebElementFacade dayDrop;

	@FindBy(xpath="html/body/div[2]/div[1]/section/div/div[3]/div[1]/main/form/div[1]/div[4]/div/div[1]/div[1]/div/div/div[2]/div/div[5]")
	public WebElementFacade daySelect;
	
	@FindBy(xpath="//div[@class='group group--narrow']//following::div[@class='css-luj9iq bge-select__control'][2]")
	public WebElementFacade monthDrop;

	@FindBy(xpath="html/body/div[2]/div[1]/section/div/div[3]/div[1]/main/form/div[1]/div[4]/div/div[1]/div[2]/div/div/div[2]/div/div[5]")
	public WebElementFacade monthSelect;

	@FindBy(xpath="//div[@class='group group--narrow']//following::div[@class='css-luj9iq bge-select__control'][3]")
	public WebElementFacade yearDrop;

	@FindBy(xpath="html/body/div[2]/div[1]/section/div/div[3]/div[1]/main/form/div[1]/div[4]/div/div[1]/div[3]/div/div/div[2]/div/div[40]")
	public WebElementFacade yearSelect;

	@FindBy(xpath="//div[@class='group group--narrow']//following::div[@class='css-luj9iq bge-select__control'][4]")
	public WebElementFacade phoneDrop;
	
	@FindBy(xpath="html/body/div[2]/div[1]/section/div/div[3]/div[1]/main/form/div[1]/div[7]/div/div/div[1]/div/div/div/div[2]/div/div[1]")
	public WebElementFacade phoneSelect;

	
	@FindBy(xpath=".//*[@id='mainDetails.firstName']")
	public WebElementFacade firstNamePO;
	
	@FindBy(xpath=".//*[@id='mainDetails.lastName']")
	public WebElementFacade lastNamePO;
	

	@FindBy(xpath=".//*[@id='mainDetails.email']")
	public WebElementFacade emailPO;

	@FindBy(xpath=".//*[@id='mainDetails.emailConfirmation']")
	public WebElementFacade confirmEmailPO;

	@FindBy(xpath=".//*[@id='mainDetails.phoneNumber']")
	public WebElementFacade contactNoPO;


	@FindBy(xpath=".//*[@id='root']/div[1]/section/div/div[3]/div[1]/main/form/div[6]/button")
	public WebElementFacade next;
}
