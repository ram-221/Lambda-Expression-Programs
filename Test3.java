package com.lambda;

public class Test3 {

	public static void main(String args[]) {
		Thread t = new Thread(()->{ 	
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
		}
		});
		t.start();
		for (int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
		
	}
}
