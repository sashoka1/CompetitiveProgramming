/**
 * 
 */
package com.ashok.journaldev.inheritance;

/**
 * @author ashoks
 *
 */
public class Animal {
	
	private boolean isVegiterian;
	
	private String eat;
	
	public Animal(boolean isVegiterian, String eat, int noOfLeg) {
		this.isVegiterian = isVegiterian;
		this.eat = eat;
		this.noOfLeg = noOfLeg;
	}

	private int noOfLeg;

	
	public Animal() {
		
	}
	
	public boolean isVegiterian() {
		return isVegiterian;
	}

	public void setVegiterian(boolean isVegiterian) {
		this.isVegiterian = isVegiterian;
	}

	public String getEat() {
		return eat;
	}

	public void setEat(String eat) {
		this.eat = eat;
	}

	public int getNoOfLeg() {
		return noOfLeg;
	}

	public void setNoOfLeg(int noOfLeg) {
		this.noOfLeg = noOfLeg;
	}

	

}
