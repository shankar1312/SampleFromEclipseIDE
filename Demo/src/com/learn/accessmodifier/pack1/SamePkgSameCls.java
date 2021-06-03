package com.learn.accessmodifier.pack1;

public class SamePkgSameCls {
	
	//public
	
	public String publicVariable = "This variable has public access modifier";
	
	public void publicMethod() 
	{
		System.out.println("This method has public access modifier");
	}
	
	//default
	
	String defaultVariable = "This variable has default access modifier";
	
	void defaultMethod() 
	{
		System.out.println("This method has default access modifier");
	}
	
	//private
	
	private String privateVariable = "This variable has private access modifier";
	
	private void privateMethod() 
	{
		System.out.println("This method has private access modifier");
	}
	
	//protected
	
	protected String protectedVariable = "This variable has protected access modifier";
	
	protected void protectedMethod() 
	{
		System.out.println("This method has protected access modifier");
	}
	
	
	public static void main(String[] args) 
	{
		SamePkgSameCls obj = new SamePkgSameCls();
		
		System.out.println(obj.publicVariable);
		obj.publicMethod();
		
		System.out.println(obj.defaultVariable);
		obj.defaultMethod();
		
		System.out.println(obj.privateVariable);
		obj.privateMethod();
		
		System.out.println(obj.protectedVariable);
		obj.protectedMethod();
	}
}
