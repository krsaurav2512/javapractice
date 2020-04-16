package com.training.abstractExample;

public class Sample3 extends Sample2{
	@Override
	public void test2() {
		System.out.println("This is test from Sample3");
		
	}

	public static void main(String[] args) {
		Sample3 spl = new Sample3();
		spl.test2();
	}



}
