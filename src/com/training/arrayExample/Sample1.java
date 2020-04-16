package com.training.arrayExample;

public class Sample1 {
	
	public static void storeArray(){
		int[] numArray;
		numArray =new int[5];
		numArray[0] = 5;
		numArray[1] = 6;
		numArray[2] = 7;
		numArray[3] = 8;
		numArray[4] = 9;
		System.out.println("length of numArray : " + numArray.length);
		for(int i = 0; i < numArray.length;i++){
			System.out.println(i + " : " + numArray[i]);
		
		}
		
		int[] numArray1 = {5,6,7,8,9,10};
		System.out.println("length of numArray : " + numArray1.length);
		for(int indArray : numArray1){
			System.out.println(indArray);
		}
	
		int[] numArray2;
		numArray2 =new int[-5];
	}


	public static void main(String[] args) {
		
		storeArray();
	
	}

}
