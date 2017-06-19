package com.ashok.journaldev.inheritance;

public class AnimalInheritanceTest {

	public static void main(String[] args) {
	
		Cat cat = new Cat(false, "milk", 4, "black");
		
		
		System.out.println("Cat is vegeterian : "+ cat.isVegiterian());
		
		System.out.println("cat eat : "+ cat.getEat());

		System.out.println("Cat has number of leg : " + cat.getNoOfLeg());
		
		System.out.println("Cat color is : "+ cat.getColor());
		
	}

}
