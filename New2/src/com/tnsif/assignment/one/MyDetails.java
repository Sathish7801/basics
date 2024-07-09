package com.tnsif.assignment.one;

public class MyDetails {
	private String name;
	private int id;
	private int mark;
    private int percentage;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "MyDetails [name=" + name + ", id=" + id + ", mark=" + mark + "]";
	}
	
    
	}
    
    


