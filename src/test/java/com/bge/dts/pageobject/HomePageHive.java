package com.bge.dts.pageobject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePageHive extends PageObject{
	
	
	@FindBy(xpath="//a[.='Smart home' and @class='navigation__first-level__link']")
	public WebElementFacade smartHome;
	
	@FindBy(xpath="//h1[@class='header__marketing__title']")
	public WebElementFacade hiveText;
	
}
