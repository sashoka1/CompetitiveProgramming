/**
 * 
 */
package com.ashok.hackerearth.datastructure;

/**
 * @author Ashok Singh 
 * sashoka1@gmail.com
 *
 */
public class BalancedStringUsingStack {

	static int top=-1;
	public static void main(String[] args) {
		
		 			char []string1={ '(' , 'a' , '+', '(', 'b'  , '-' , 'c' ,')' , ')'};
			        char []string2={ '(' , '(' , 'a' , '+' , 'b' , ')' } ;
			        char stack []=new char[15] ;
			     
			       check (string1 , 9 , stack );   //Passing balanced string   
			   
			       check(string2 , 5 , stack) ;    //Passing unbalanced string
			       
	}
	private static void check(char[] string, int n, char[] stack) {
		
		for(int i=0;i<n;i++){
			
			if(string[i]=='('){
				top=top+1;
				stack[top]='(';
			}
			if(string[i]==')'){
				if(top==-1){
					return;
				}else{
					top=top-1;
				}
			}
		}
		if(top==-1){
			System.out.println("String is Balanced ");
		}else{
			System.out.println("String is unbalanced");
		}
		
	}

}
