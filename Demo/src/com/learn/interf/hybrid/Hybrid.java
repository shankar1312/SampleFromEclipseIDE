package com.learn.interf.hybrid;

public class Hybrid 
{
	public static void main(String[] args)
	{
		ChildOfAB obj = new ChildOfAB();
		
		System.out.println(obj.a);
		obj.aDisplay();
		
		System.out.println(obj.b);
		obj.bDisplay();
		
		System.out.println(obj.pab);
		obj.pDisplay();
		
		System.out.println(obj.cab);
		obj.cDisplay();
	}
}
