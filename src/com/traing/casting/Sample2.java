package com.traing.casting;

public class Sample2  extends Sample1{
	void test2(){
		System.out.println("this is test from Sample2");

	}
	public static void main(String[] args){
		Sample1 spl = (Sample1)new Sample2();
		//spl.test1();
	}
}
