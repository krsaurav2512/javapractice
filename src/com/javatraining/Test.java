package com.javatraining;

public class Test {
	
	{
		System.out.println("inside non static block");
	}

	public static void main(String[] args) {
		
		Test test = new Test();
	}
	static{
		System.out.println("inside static block");
	}

}
