package com.training.arrayExample;

public class Sample3 {

	public static void main(String[] args) {
		Sample3[] objArray = new Sample3[3];
		objArray[0] = new Sample3();
		objArray[1] = new Sample3();
		objArray[2] = new Sample3();
		for(Sample3 obj : objArray){
			System.out.println(obj);
		}

	}

}
