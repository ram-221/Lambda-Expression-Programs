package com.lambda;

interface Interf1{
	public int square(int x);
}

 class Demo1 implements Interf1 {
	public int square(int x) {
		return x*x;
	}
}

public class Test1 {
	
	public static void main(String args[]) {
		Interf1 i = new Demo1();
		System.out.println("The square  7 is:"+ i.square(7));
	}

}