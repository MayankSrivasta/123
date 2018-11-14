package com.bge.dts.pageobject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class AddDiscount extends PageObject{

	@FindBy (xpath=".//*[@id='root']/div[1]/nav/div[2]/div[2]/nav/div[1]/div/span")
	public WebElementFacade energy;
	
	@FindBy (xpath=".//*[@id='root']/div[1]/nav/div[2]/div[2]/nav/div[1]/div[2]/a[1]")
	public WebElementFacade ourPlans;
	
	
	
	
	@FindBy (xpath=".//*[@id='root']/div[1]/section/div/div[4]/div/div[1]/div/section/footer/div/div[1]")
	public WebElementFacade dualFuelGas;
	
	
	@FindBy (xpath=".//*[@id='root']/div[1]/section/div/div[4]/div/div[1]/div/section/footer/div/div[2]")
	public WebElementFacade dualFuelElec;
	
	@FindBy (xpath="//button[@class='tabs__button'][1]")
	public WebElementFacade gasTab;
	
	@FindBy (xpath="//button[@class='tabs__button'][2]")
	public WebElementFacade elecTab;
	
	
	@FindBy (xpath=".//*[@id='root']/div[1]/section/div/div[4]/div/div[1]/div/section/footer/div/div")
	public WebElementFacade gasDiscount;
	
	
	@FindBy (xpath=".//*[@id='root']/div[1]/section/div/div[4]/div/div[1]/div/section/footer/div/div.//*[@id='root']/div[1]/section/div/div[4]/div/div[1]/div/section/footer/div/div")
	public WebElementFacade elecDiscount;
	 
	
	 
	  
}
