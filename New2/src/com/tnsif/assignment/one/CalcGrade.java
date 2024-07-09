package com.tnsif.assignment.one;

import com.tnsif.daythree.scannerdemo.Person;

public class CalcGrade {
	public void calculateGrade(MyDetails details) {
		
		if(details.getMark()>500) {
			System.out.println("Enter valid mark");
		} else {
			if(details.getMark()>=490) {
				System.out.println("S Grade");
			} else if(details.getMark()<490 && details.getMark()>=480) {
				System.out.println("A Grade");
			} else if(details.getMark()<480 && details.getMark()>=465) {
				System.out.println("B Grade");
			} else if(details.getMark()<465 && details.getMark()>=450){
				System.out.println("C Grade");
			} else if(details.getMark()<450 && details.getMark()>=420) {
				System.out.println("D Grade");
			} else if(details.getMark()<420 && details.getMark()>=300) {
				System.out.println("E Grade");
			} else {
				System.out.println("F Grade");
			}
	}

	}
}
