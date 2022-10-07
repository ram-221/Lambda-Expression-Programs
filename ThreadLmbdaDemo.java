package com.lambda;

public class ThreadLmbdaDemo {
	public static void main(String aegs[]) {
		Runnable r= ()->{
			for (int i = 0; i<10;i++) {
				System.out.println("Child Thread");
			}
		};
		Thread t = new Thread(r);
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
	}

}
