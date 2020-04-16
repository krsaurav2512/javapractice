package com.taining.interfaceExample;

public class Sample3 implements Sample1,Sample2{

	@Override
	public void test1() {
		System.out.println("This is test from SAmple1");
		System.out.println(Sample1.name);
		
		
	}
	public static void main(String[] args) {
		Sample3 spl = new Sample3();
		spl.test1();
		spl.test2();
	}
	@Override
	public void test2() {
		System.out.println("This is test from SAmple2");
		
	}
}
