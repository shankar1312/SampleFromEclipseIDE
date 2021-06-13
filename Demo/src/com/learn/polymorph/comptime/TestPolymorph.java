package com.learn.polymorph.comptime;

public class TestPolymorph 
{
	public static void main(String[] args)
	{
		ChildPoly obj = new ChildPoly();	
		obj.add(10, 40);
		obj.add(2.15, 5.5);
		obj.add(25, 350, 60);
	}

}
