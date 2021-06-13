package com.learn.polymorph.runtime;

public class ChildPoly extends ParentPoly{
		
	void add(int a, int b)
	{
		super.add(a, b);
		System.out.println("Child Addition: " + (a+b));
	}	

}
