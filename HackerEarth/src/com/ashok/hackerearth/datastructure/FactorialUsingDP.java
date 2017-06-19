/**
 * 
 */
package com.ashok.hackerearth.datastructure;

/**
 * @author Ashok Singh 
 * sashoka1@gmail.com
 * 
 * The simplest way to find frequency count is to iterate over all the possible characters and count their frequency one by one. 
 * The time complexity of this approach is O(26*N) where N is the size of the string and there are 26 possible characters.
 *
 */
public class FactorialUsingDP {
	
	
	public static void main(String[] args) {
		
     int n=6;
	 System.out.println("Fatorial Using DP"+ fact(n));
	
	}

	private static int fact(int n) {
		
		    int f[]=new int[n];
		    int i;
		    f[0] = 1;

		    for(i=1;i<=n;i++)
		        f[i] = i * f[i-1];
		    return f[n];
		}
	
}	

