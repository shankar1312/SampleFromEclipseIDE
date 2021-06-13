package com.learn.polymorph.runtime.car;

public class CarType extends CarBrand
{	
	String carType = "";
	String carName = "No Cars available..";
		
	public void display()
	{
		if (carType == "hatch back") 
			{ carName = "Alto, Swift"; }
		else if (carType == "sedan") 
			{ carName = "Swift Dzire, Ciaz"; }
		else if (carType == "compact suv")	
			{ carName = "breeza"; }
		else 
			{ carName = "No Cars available.."; }
		super.display();
		System.out.println("--------------"+carName+"--------------");
	}
}
