package com.learn.interf.muliple;

public class AB implements A, B
{
	public void aDisplay()
	{
		System.out.println("Implemented - Interface A");
	}
	
	public void bDisplay()
	{
		System.out.println("Implemented - Interface B");
	}
}
