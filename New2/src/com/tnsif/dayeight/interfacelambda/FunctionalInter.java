package com.tnsif.dayeight.interfacelambda;

public class FunctionalInter {

	public static void main(String[] args) {
		Greet g = new Greet();
		System.out.println(g.greet());
        GreetInter g1 = () -> {return "Good Afternoon";};
		

		System.out.println(g1.greet());

	}

}
