package com.bge.dts.usersteps;
import com.bge.dts.utils.UnifiedResourceLocator;
import com.bge.dts.pageobject.AddDiscount;

public class AddDiscountUS extends  AddDiscount{

	public void openURL(){
		
		openAt(UnifiedResourceLocator.URL);
	}
	
	public void clickEnergy(){
		if(element(energy).isCurrentlyVisible())
		element(energy).click();
		else
			System.out.println("Energy is not visible");
		
	}
	
	public void clickPlans(){
		if(element(ourPlans).isCurrentlyVisible())
			element(ourPlans).click();
		else 
			System.out.println("Our Plans is not visible");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void checkDualFuelGas(){
		if(element(dualFuelGas).isCurrentlyVisible()){
			System.out.println("Dual Fuel Gas Visible");
		}
		else 
			System.out.println("Dual Fuel Gas not Visible");
	}
	
	
	public void checkFuelElec(){
		if(element(dualFuelElec).isCurrentlyVisible()){
			System.out.println("Dual Fuel Electricity Visible");
		}
		else 
			System.out.println("Dual Fuel Electricity not Visible");
		
	}
	
	public void clickGasTab(){
		
		if(element(gasTab).isCurrentlyVisible()){
			element(gasTab).click();
			System.out.println("gasTab Visible");
		}
		else 
			System.out.println("gasTab not Visible");
		
		}
	
	public void checkGasDiscount(){
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(element(gasDiscount).isCurrentlyVisible()){
			System.out.println("gasDiscount Visible");
		}
		else 
			System.out.println("gasDiscount not Visible");
		}
	
	public void clickElecTab(){
		
		if(element(elecTab).isCurrentlyVisible()){
			element(elecTab).click();	
			System.out.println("elecTab Visible");
		}
		else 
			System.out.println("elecTab not Visible");
		
		}
		
	
	public void checkElecDiscount(){
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(element(elecDiscount).isCurrentlyVisible()){
				
			System.out.println("elecDiscount Visible");
		}
		else 
			System.out.println("elecDiscount not Visible");
	}
	
}
