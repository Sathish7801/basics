package com.tnsif.dayeight.interfaceimplement;

public class Student implements BeACoder {
	private int sid;
	private String sname;
	public void practice()
	{
		System.out.println("Waking time:" +timing);
		System.out.println("Working in core java for atleast 2hrs");
	}
	public Student() {
		super();
	}
	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}
	

}
