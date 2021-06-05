package com.learn.inherit.hierarchical;

public class HierarchicalInherit {

	public static void main(String[] args) {
		
		B1 heiInh1 = new B1();
		
		System.out.println(heiInh1.a);
		heiInh1.display();
		
		System.out.println(heiInh1.b1);
		heiInh1.show1();
		
		B2 heiInh2 = new B2();
		
		System.out.println(heiInh2.a);
		heiInh2.display();
		
		System.out.println(heiInh2.b2);
		heiInh2.show2();
	}

}
