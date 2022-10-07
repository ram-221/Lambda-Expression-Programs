package com.lambda;


interface Interfa{
	public int square(int x);
}

public class Test2 {
	
 public static void main(String args[]) {
	
	 Interfa i = x ->x*x;
	 System.out.println("The square:"+i.square(5));
 }
}
