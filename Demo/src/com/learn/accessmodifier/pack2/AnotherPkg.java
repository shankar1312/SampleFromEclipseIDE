package com.learn.accessmodifier.pack2;

import com.learn.accessmodifier.pack1.SamePkgSameCls;

public class AnotherPkg {
	
	public static void main(String args[]) {
		
		SamePkgSameCls obj = new SamePkgSameCls();
		
		System.out.println(obj.publicVariable);
		obj.publicMethod();
		
		//System.out.println(obj.defaultVariable);
		//obj.defaultMethod();
		
		//System.out.println(obj.privateVariable);
		//obj.privateMethod();
		
		//System.out.println(obj.protectedVariable);
		//obj.protectedMethod();		
	}

}
