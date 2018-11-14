package com.bge.dts.storysteps;

import org.jbehave.core.annotations.*;
import com.bge.dts.usersteps.HomePageHiveUS;
public class HomePageHiveSS {

	HomePageHiveUS hivePage;
	
	//scenario-1
	@Given("Tom, a customer is in the Home section of the BGE site")
	public void openLink(){
		hivePage.openURL();
	}
	@When("Tom, clicks on Smart Home tab in the Home Header")
	public void clickSmartHome(){
		hivePage.clickSmartHomeUS();
	}
	
	@Then("Tom, should sees the Smart Home page")
	public void checkHiveString(){
		hivePage.checkHiveText();
	}
	
	//scenario-2
	@Given("Tom, a customer who knows the url for the Smart Home page")
	public void openLinkTwo(){
		hivePage.openURLTwo();
	}
	@When("Tom, goes to the Smart Home url")
	public void clickSmartHomeTwo(){
		
	}
	
	@Then("Tom, should see the Smart Home page")
	public void checkHiveStringTwo(){
		hivePage.checkHiveText();
	}
	
}
