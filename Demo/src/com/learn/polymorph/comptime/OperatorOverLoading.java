package com.learn.polymorph.comptime;

public class OperatorOverLoading {
	
	void Sum(int a, int b) 
	{
		System.out.println("Addition : " + a + b);
	}
	
	public static void main(String[] args)
	{
		OperatorOverLoading obj = new OperatorOverLoading();
		
		obj.Sum(10, 20);
	}		
}
