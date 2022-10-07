package com.lambda;

/*
 * the local variable referenced fro lambda expression are implicitly final and hence we can't perform
 * re-assignment for those local variable otherwise we get compile time error 
 */
interface Dem{
	public void m1();
}

public class DemoTest {

	int x = 10;
	public void m2() {
		int y = 20;
		Dem d = ()-> {
			System.out.println(x);
			//System.out.println(y);
			x=88;
			//y=99;
		};
		d.m1();
		y=33;
	}
	public static void main(String args[]) {
		DemoTest dm = new DemoTest();
		dm.m2();
	}
}
