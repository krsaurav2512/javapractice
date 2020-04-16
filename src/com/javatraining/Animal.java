package com.javatraining;

public class Animal {
	public static String animalType= "Dog";
	public  String animalType1= "Cat";
	
	public static void eat(String animalType){
		System.out.println(animalType + " is eating");
	}
      
	public void eat1(String animalType){
		System.out.println(animalType + " is eating");
	}
     
   public static void main(String[] args){
	   System.out.println(Animal.animalType);
	   eat(Animal.animalType);
	   
	   Animal ani = new Animal();
	   System.out.println(ani.animalType1);
	   ani.eat1(ani.animalType1);
	   
	   Animal ani1 = new Animal();
   }

}
