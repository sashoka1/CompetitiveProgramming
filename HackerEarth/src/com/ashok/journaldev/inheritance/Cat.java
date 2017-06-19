/**
 * 
 */
package com.ashok.journaldev.inheritance;

/**
 * @author ashoks
 *
 */
public class Cat extends Animal{

	private String color;
	
	public Cat(boolean isVegiterian, String eat, int noOfLeg, String color) {
		super(isVegiterian, eat, noOfLeg);
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	/*public Cat() {
		
	}*/
	

	public Cat(boolean isVegiterian, String eat, int noOfLeg) {
		super(isVegiterian, eat, noOfLeg);
		
	}

}
