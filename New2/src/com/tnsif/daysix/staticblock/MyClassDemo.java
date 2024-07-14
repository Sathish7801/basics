package com.tnsif.daysix.staticblock;

public class MyClassDemo {

	public static void main(String[] args) {
		MyClass c1 = new MyClass();
		System.out.println(c1);
		
		MyClass.display();
		
		MyClass c2 = new MyClass();
		System.out.println(c2);
		MyClass.display();
		
		MyClass c3 = new MyClass();
		System.out.println(c3);
		MyClass.display();
		
		

	}

}
