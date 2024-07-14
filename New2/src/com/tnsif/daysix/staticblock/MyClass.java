package com.tnsif.daysix.staticblock;

public class MyClass {
	private static int section;
	private static int srNo;
	static {
		System.out.println("Within Static Block");
		srNo = 1000;
		
	}
	MyClass(){
		System.out.println("Within Default COnstructor");
		srNo++;
		section++;
	}
	@Override
	public String toString() {
		return "MyClass [Serial No "+srNo+", Section=" + section + "]";
	}
	static void display() {
		System.out.println("Serial No. " +srNo);
	}

}
