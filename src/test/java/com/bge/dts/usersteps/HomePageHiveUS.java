package com.bge.dts.usersteps;

import com.bge.dts.utils.UnifiedResourceLocator;

import com.bge.dts.pageobject.HomePageHive;

public class HomePageHiveUS  extends HomePageHive{

	public void openURL(){
		openAt(UnifiedResourceLocator.hive);
	}
	
	public void openURLTwo(){
		openAt(UnifiedResourceLocator.hiveUrl);
	}
	
	public void clickSmartHomeUS(){	
		//explicit wait 
		if(element(smartHome).isCurrentlyVisible())
		{	element(smartHome).click();	
			System.out.println("Smart Home is visible");
		}
		else
			System.out.println("Smart Home Button is not enabled.");
	
	}
	
	public void checkHiveText(){
		//explicit wait
		if(element(hiveText).isCurrentlyVisible())
			System.out.println("HiveText is visible");
		else
			System.out.println("HiveText is not Visible.");
				}
	
	
	}

