package com.bge.dts.storysteps;
import org.jbehave.core.annotations.*;

import com.bge.dts.usersteps.AddDiscountUS;


public class AddDiscountSS {
	AddDiscountUS  addDis; 
	
	//scenario-1
	@Given("Bob, is on the 'Our Plans' page and selects the 'Dual Fuel' Tab")
	public void openSiteOne(){
		addDis.openURL();
	}
	
	@When("Bob, views the applicable offers available to him")
	public void offerOne(){
		addDis.clickEnergy();
		addDis.clickPlans();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Then("Bob, should see the discounted unit rate for Gas and Electricity relevant to the offers")
	public void seeDiscountOffersOne(){
		addDis.checkDualFuelGas();
		addDis.checkFuelElec();
	}
	//scenario-2
	@Given("Bob,is on the 'Our Plans' page and selects the 'Gas' Tab")
	public void openSiteTwo(){
		addDis.openURL();
	}
	
	@When("Bob,view the applicable offer  to him")
	public void offerTwo(){
		addDis.clickEnergy();
		addDis.clickPlans();
		
	}
	
	@Then("Bob, should see the discounted unit rate for Gas relevant to the offers")
	public void seeDiscountOffersTwo(){
		addDis.clickGasTab();
		addDis.checkGasDiscount();
	}
	
	//scenario-3
	@Given("Bob, is on the Our Plan page and selects the 'Electricity' Tab")
	public void openSiteThree(){
		addDis.openURL();
	}
	
	@When("Bob, views the applicable offers  to him")
	public void offerThree(){
		addDis.clickEnergy();
		addDis.clickPlans();
		
	}
	
	@Then("Bob, should see the discounted unit rate for Electricity relevant to the offers")
	public void seeDiscountOffersThree(){
		addDis.clickElecTab();
		addDis.checkElecDiscount();
	}
}
