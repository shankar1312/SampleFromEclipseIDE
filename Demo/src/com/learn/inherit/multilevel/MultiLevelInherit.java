package com.learn.inherit.multilevel;

public class MultiLevelInherit 
{
	public static void main(String[] args) 
	{
		C obj = new C();
		
		System.out.println(obj.a);
		obj.display();
		
		System.out.println(obj.b);
		obj.show();
		
		System.out.println(obj.c);
		obj.print();

		obj.duplicate();
	}

}
