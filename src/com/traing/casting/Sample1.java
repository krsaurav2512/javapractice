package com.traing.casting;

/**
 * 
 * @author KUMAR SAURAV
 *
 */
public class Sample1 {
	
    /**
     * this method is for checking the trainer
     * @param name - name of the trainer
     */
	//static void checkTrainer(String name) {
//		if (name.equalsIgnoreCase("kumar")) {
//			System.out.println("He is providing traing");
//		} else {
//			System.out.println("He is not  providing traing");
//		}
//		
//		switch(name){
//	
//		case "Saurav" : System.out.println("He is not  providing traing");
//		break;
//		case "Zain" : System.out.println("He is not  providing traing");
//		break;
//		case "Nazim" : System.out.println("He is not  providing traing");
//		break;
//		case "Kumar" : System.out.println("He is  providing traing");
//		break;
//		
//		default : System.out.println("we are not sure whether he is providing or not");
//		break;
//		}
	
	
//		System.out.println("He is providing traing");
//	} else {
//		System.out.println("He is not  providing traing");
//	}
		
		static void checkEvenOrOdd(int num){
//			if (num % 2 == 0) {
//				 System.out.println("this is even");
//			}else{
//				System.out.println("this is odd");
//			}
			
//			switch(num){
//			case num % 2 == 0 : System.out.println("this is even");
//			break;
//			case 2 : System.out.println("this is even");
//			break;
//			case 5 : System.out.println("this is odd");
//			break;
//		}
			
			int flag = num % 2;
			switch(flag){
			case 0 : System.out.println("This is even");
			break;
			case 1 : System.out.println("This is odd");
			break;
			}

	}

	public static void main(String[] args) {
		String name = "bvdb vhk";
		int number = 5;
		checkEvenOrOdd(number);
		System.out.println(4 % 2);
	}

}
