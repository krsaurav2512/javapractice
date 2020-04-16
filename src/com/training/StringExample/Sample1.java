package com.training.StringExample;

public class Sample1 {

	public static void main(String[] args) {
		
		String str = new String("Zain");//using new keywork --- heap memory
		System.out.println(str);
		System.out.println(str.isEmpty());
		System.out.println(str.indexOf('i'));
		
		
		String str1 = "Zain"; // directly in double quote(string literals) -- string constant pool
//		System.out.println(str1);
//		
//		char[] acArray = {'Z','a','i','n'};
//		String str3 = new String(acArray);
//		System.out.println(str3);
		
		

	}

}
