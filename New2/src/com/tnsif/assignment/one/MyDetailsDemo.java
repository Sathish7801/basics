package com.tnsif.assignment.one;
import java.util.Scanner;


public class MyDetailsDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Id: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		System.out.println("Enter your mark: ");
		int mark = sc.nextInt();
        int percentage = (mark/500)*100;
        System.out.println("Your percentage is" +percentage);
        MyDetails details = new MyDetails();
        details.setName(name);
        details.setId(id);
		details.setMark(mark);
		System.out.println(details);
		CalcGrade calc = new CalcGrade();
		calc.calculateGrade(details);
		sc.close();
		
	}

}
