package com.ashok.basicprogramming;
import java.io.*;
import java.util.*;

/**
 * @author Ashok
 *
 *sashoka1@gmail.com
 */
class LittleShinoandthecoins{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int len=Integer.parseInt(br.readLine().trim());
		String str1[]=br.readLine().split(" ");
		//countEvenSum(str1,len);
		evenSumSubArraysCount(str1,len);
	
	}


	private static void countEvenSum1(String arr[], int n)
	{
	    int result = 0;
	 
	    // Find sum of all subarrays and increment
	    // result if sum is even
	    for (int i=0; i<=n-1; i++)
	    {
	        int sum = 0;
	        for (int j=i; j<=n-1; j++)
	        {
	            sum = sum + Integer.parseInt(arr[j]);
	            if (sum % 2 == 0)
	                    result++;
	        }
	    }
	 
	    //return (result);
	    System.out.println(result);
	}
	
	//TimeComplexity: O(n)
	public static void evenSumSubArraysCount(String arr[],int len) {
	    long[] count = new long[2];
	    long sum = 0;
	 
	    for (int i = 0; i < len; i++) {
	        sum = (sum + Integer.parseInt(arr[i])) % 2;
	        count[(int) Math.abs(sum)]++;
	    }
	 
	    //Total even sum arrays = Total even sub arrays + number of odd pairs 
	                                            //+ number of even only pairs
	    long totalEvenSumSubArrayCount = count[0] + (count[0] 
	                                    * (count[0] - 1) / 2)  
	                                    + (count[1] * (count[1] - 1) / 2);
	 
	    System.out.println(totalEvenSumSubArrayCount);
	}
	
	//Time complexity O(n)
	 private static void countEvenSum(String arr[], int n) // Efficient 
	{
	    // A temporary array of size 2. temp[0] is
	    // going to store count of even subarrays
	    // and temp[1] count of odd.
	    // temp[0] is initialized as 1 because there
	    // a single even element is also counted as
	    // a subarray
	    int temp[] = {1, 0};
	 
	    // Initialize count.  sum is sum of elements
	    // under modulo 2 and ending with arr[i].
	    int result = 0, sum = 0;
	 
	    // i'th iteration computes sum of arr[0..i]
	    // under modulo 2 and increments even/odd count
	    // according to sum's value
	    for (int i=0; i<=n-1; i++)
	    {
	        // 2 is added to handle negative numbers
	        sum = ( (sum + Integer.parseInt(arr[i])) % 2 + 2) % 2;
	 
	        // Increment even/odd count
	        temp[sum]++;
	    }
	 
	    // Use handshake lemma to count even subarrays
	    // (Note that an even cam be formed by two even
	    // or two odd)
	    result = result + (temp[0]*(temp[0]-1)/2);
	    result = result + (temp[1]*(temp[1]-1)/2);
	 
	    System.out.println(result);
	}
}