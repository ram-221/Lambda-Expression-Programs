package com.lambda;
/*
 * Lambda Expression
 */


interface interf{
	public void methodOne();
}

	public class Demo {
		public static void main(String args[]) {
			interf i = ()-> System.out.println("MethodOne Execution");
			i.methodOne();
		}
		
	}




