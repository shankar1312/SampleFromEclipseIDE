package com.learn.accessmodifier.pack1;

public class SamePkgDiffCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
