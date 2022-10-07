package com.lambda;

/*
 * Within Lambda Expression "this" keyword represents current outer class object reference (that is 
 * current enclosing class reference in which we declare lambda Expression)
 */

interface Sample{
	public void methodOne();
}

public class TestDemo {
 
	int x = 777;
	public void methodTwo() {
		Sample s = ()-> {
			int x = 888; 
			System.out.println(x);
			System.out.println(this.x);
		};
		s.methodOne();
	}
	public static void main(String args[]) {
		TestDemo td = new TestDemo();
		td.methodTwo();
	}
	
}
