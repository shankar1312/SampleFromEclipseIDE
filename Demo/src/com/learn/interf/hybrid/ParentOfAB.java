package com.learn.interf.hybrid;

public class ParentOfAB implements A, B
{
	int pab = 30;
	
	public void aDisplay()
	{
		System.out.println("Implemented - Interface A");
	}
	
	public void bDisplay()
	{
		System.out.println("Implemented - Interface B");
	}
	
	public void pDisplay()
	{
		System.out.println("This is parent AB");
	}
}
