
package com.learn.string;

public class LearnString 
{
	
	final double PI = 3.14;
	
	final void show() 
	{
		System.out.println("Displ");
	}
	
	public static void main(String args[]) 
	{
		LearnString obj = new LearnString();
		
		//obj.PI = 12.8768;
		obj.show();
		
		
		StringBuffer str = new StringBuffer("Welcome");
				
		System.out.println(str.append(" to java"));
		
		int i = 10;
		
		if(i<12) {
			throw new ArithmeticException();
		}
		
		
		String str1 = "shankar";
		
		
		System.out.println(str1.length());
		
		System.out.println(str.length());
		
		
		ClsMutable objMut = new ClsMutable();
		objMut.mutable = "Neww";
		objMut.displayMutable();
		
		
		ClsImmutable objImMut = new ClsImmutable();
		
		objImMut.displayImmutable();
		
		
	}
	
	
}
