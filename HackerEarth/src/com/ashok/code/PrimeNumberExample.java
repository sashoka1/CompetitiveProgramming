package com.ashok.code;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimeNumberExample {

	public static void main(String[] args) {
		double count = 0;
		double startTime = System.nanoTime();
		
		for (BigInteger bi = BigInteger.valueOf(1);
	            bi.compareTo(BigInteger.valueOf(1000000)) < 0;
	            bi = bi.add(BigInteger.ONE)) {
			if(bi.isProbablePrime(1))
			{
				count++;
				//System.out.println(bi);
			}
			double prob=count/1000000;
			
			
		}
			double endTime = System.nanoTime();
			System.out.println("Took : "+(endTime - startTime) / 1000000000 + " second");
		
	   /* int n = 100000; // the max number for test

	    // Sieve of Eratosthenes
	    boolean[] sieve = new boolean[n + 1];
	    for (int i = 2; i <= n; i++) {
	        sieve[i] = true;
	    }
	    for (int i = 2; i <= n; i++) {
	        if (sieve[i] != false) {
	            for (int j = i; j * i <= n; j++) {
	                sieve[i*j] = false;
	            }
	        }
	    }

	    // Print prime numbers
	    for (int i = 0; i <= n; i++) {
	        if (sieve[i]) {
	            System.out.println(i);
	        }
	    }
*/
	
	}	
}


