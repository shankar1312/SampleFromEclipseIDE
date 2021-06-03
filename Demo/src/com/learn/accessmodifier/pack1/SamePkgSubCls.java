package com.learn.accessmodifier.pack1;

public class SamePkgSubCls extends SamePkgSameCls{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using inheritance concept
		
		SamePkgSubCls obj = new SamePkgSubCls();
		
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
