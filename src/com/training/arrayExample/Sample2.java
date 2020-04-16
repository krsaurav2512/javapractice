package com.training.arrayExample;

public class Sample2 {

	public static void main(String[] args) {
		
		String srtArray[] = {"Kumar","Nazim","Zain"};
		for(String indStr : srtArray){
			System.out.println(indStr);
		}
    System.out.println("length : " + srtArray.length);
    for(int i = srtArray.length-1;i>=0;i--){
    	System.out.println(i + " : " + srtArray[i]);
    }

	}

}
