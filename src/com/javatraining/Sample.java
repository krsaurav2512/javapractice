package com.javatraining;

public class Sample {
	
   
    
    public static int addNumber(int num1,int num2){
    	int myesult;
    	myesult = num1 + num2;
    	System.out.println("from method : " + myesult);
		return myesult;
    	
    }

	public static void main(String[] args) {
		
		System.out.println("New traing started");
		int result = addNumber(10,20);
		System.out.println("from main method : " + result);
		
		
	}
  
}
