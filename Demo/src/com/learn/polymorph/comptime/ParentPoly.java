package com.learn.polymorph.comptime;

public class ParentPoly
{
	void add(int a, int b)
	{
		System.out.println("Addition of two numbers : " + (a+b));
	}
	
	void add(double a, double b)
	{
		System.out.println("Addition of two decimal numbers : " + (a+b));
	}
	
	void add(int a, int b, int c)
	{
		System.out.println("Addition of three numbers : " + (a+b+c));
	}
	
	public static void main(String[] args)
	{
		ParentPoly obj = new ParentPoly();	
		obj.add(10, 40);
		obj.add(2.15, 5.5);
	}
}
