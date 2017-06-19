/**
 * 
 */
package com.ashok.hackerearth.datastructure;

/**
 * @author Ashok Singh 
 * sashoka1@gmail.com
 *
 */
public class StackImplementationUsingArray {

	static int top=-1;
	public static void main(String[] args) {
		
		int stack[]=new int[3];
		
		// Pushing three elements
		push(stack,5,stack.length);
		
		System.out.println("Top Element now : " + findTopElement(stack));
		
		push(stack,4,stack.length);
		
		push(stack,7,stack.length);
		
		System.out.println("Size of Stack : "+ size());
		
		//Overflow will Occur now
		
		push(stack,99,stack.length);
		
		//Pop one element
		pop(stack);
		
		System.out.println("Size of Stack : "+ size());
		
		pop(stack);
		
		pop(stack);
		
		
		// Underflow will occur now
		
		pop(stack);
		

	}

	 private static int findTopElement(int []stack) {
		
		return stack[top];
	}


	private static int size() {
		
		return top+1;
	}

	private static void pop(int []stack) {
		if(isEmpty()){
			System.out.println("Stack Underflow : ");
		}else{
			System.out.println("Poped Element : " + stack[top]);
			top=top-1;
			
		}
		
	}

	private static boolean isEmpty() {
		if(top==-1){
			return true;
		}
		return false;
	}

	private static void push(int[] stack, int i, int length) {
	
		if(top==stack.length-1){
			System.out.println("Stack OverFlow : ");
		}else{
		
				top=top+1;
				stack[top]=i;
				System.out.println("Pushed Element :" + i );
	}
	}

}
