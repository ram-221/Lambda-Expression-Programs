package com.lambda;

interface Interf2 {
 public void sum(int a, int b);	
}

public class Test {

	public static void main(String args[]) {
		Interf2 i = (a,b)-> System.out.println("The Sum: "+(a+b));
		i.sum(5,10);
	}
}
