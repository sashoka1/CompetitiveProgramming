package com.ashok.code;
import java.util.Scanner;
class PromosNight {
    public static void main(String args[] ) throws Exception {
       
    	
        @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
        	int b=sc.nextInt();
        	int g=sc.nextInt();
        	int arr[]=new int[b];
        	int arr1[]=new int[g];
        	for(int j=0;j<b;j++)
        	{
        		arr[j]=sc.nextInt();
        	}
        	for(int j=0;j<g;j++)
        	{
        		arr1[j]=sc.nextInt();
        	}
        	
        	
        	findGirl(arr,arr1);

        }
    }

	    	
   private static void findGirl(int[] arr, int[] arr1) 
   {
	   int c=0;
	   for(int i=0;i<arr.length;i++)
	   	{
		   for(int j=0;j<arr1.length;j++)
		   	{
		   		if(arr[i]>arr1[j])
		   		{
		   			c++;
		   			break;
		   		}
		   	}

	   	} 
	   if(c==arr.length)
	   {
		   System.out.println("YES");
	   }else{
		   System.out.println("NO");
	   }
	
   }


	
	 
       
}
