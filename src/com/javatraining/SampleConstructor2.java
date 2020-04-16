package com.javatraining;

public class SampleConstructor2 extends SampleConstructor1{
	
	SampleConstructor2(){
		super("Kumar");
		System.out.println("Constructor2 without args called");
	}

	public static void main(String[] args) {
		
		SampleConstructor2 spl = new SampleConstructor2();
	}

}
