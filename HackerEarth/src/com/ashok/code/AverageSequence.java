package com.ashok.code;
/* IMPORTANT: class must not be public. */



import java.util.Scanner;
class AverageSequence {
    public static void main(String args[] ) throws Exception 
    {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
           arr[i]=sc.nextInt();
       
        }
        findavg(arr);
    }

	    	
   private static void findavg(int[] arr)
   {
	   
	   int sum=0;int n=0;
	   for(int i=1;i<=arr.length;i++)
	   {
		   for(int j=0;j<=i;j++)
		   {
			   sum=sum+arr[j];
			   if(i==0){
				   n=arr[0];
			   }
			   else{
				   n=(i+1)*arr[i]-sum;
			   }
		
		   }
		   
		   System.out.println(n);
		   
		   n=0;
		   sum=0;
		   
			   		
		   
		   
	   }

	}



		
	 
       
}
