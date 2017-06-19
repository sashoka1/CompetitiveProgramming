package com.ashok.recursion;

public class RecusrionFirstProgram {

	public static void main(String[] args) {
		
		
		int count=10000;//for firstRecursionMethod
		firstRecursionMethod(count);
		
		int count1=0;//for firstRecursionMethod1
		firstRecursionMethod1(count1);
		

	}
	
	// Efficient and correct according to recursion
	static int firstRecursionMethod(int count){
		if(count<1)
			return 0 ;
		System.out.println("Hello Word");
		return firstRecursionMethod(count-1);
		
	}
	
	// This approach is not efficient and not correct as per recursion
	static void firstRecursionMethod1(int count){
		if(count< 10000){
		    System.out.println("Hello Word  "+count);
		    //count= count+1; // important because  when we call this method as firstRecursionMethod(count++);
		    // there will be problem as it assign value to method first and then increment which is wrong 
		    // therefore we should use it as count=count+1;
		    // and then firstRecursionMethod(count++);
		    // or Simply firstRecursionMethod(++count);
		firstRecursionMethod(++count);
		}
		
	}

}
