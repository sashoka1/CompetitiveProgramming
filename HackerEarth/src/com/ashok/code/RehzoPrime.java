package com.ashok.code;
/* IMPORTANT: class must not be public. */



import java.util.Scanner;
class RehzoPrime {
    public static void main(String args[] ) throws Exception 
    {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
           arr[i]=sc.nextInt();
         /*
         System.out.println(isPrime);*/
        }
        findMaxPoint(arr);
       
    }

	    	
   private static void findMaxPoint(int[] arr) {
	   
	   int maxPoint=0,c=0;
		for(int i=0;i<arr.length;i++){
			
			boolean isPrime= isPrime(arr[i]);
			if(isPrime){
				c++;
				maxPoint+=arr[i];
			}
		}
		maxPoint=0;
		if(c!=arr.length){
			
			for(int i=0;i<arr.length-1;i++){
				maxPoint+=arr[i];
			}
			}
				System.out.println(maxPoint);
		}
		
	


private static boolean isPrime(int num) {
	   
	   for(int i=2; i<=num/2; i++){
           if(num % i == 0){
               return false;
           }
       }
       return true;

	}





		
	 
       
}
