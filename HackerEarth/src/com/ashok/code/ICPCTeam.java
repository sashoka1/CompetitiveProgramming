package com.ashok.code;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class ICPCTeam {
    public static void main(String args[] ) throws Exception {
       
    	
       
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
        	int b=sc.nextInt();
        	int g=sc.nextInt();
        	if(b %g ==0){
	        	int arr[]=new int[b];
	        	
	        	for(int j=0;j<b;j++)
	        	{
	        		arr[j]=sc.next().length();
	        	
	        	}
	        	        	
	        	
	        	findGirl(arr,g);
	
	        }
        	
        }
    }

	    	
   private static void findGirl(int[] arr , int g) 
   {
	 int sum=0;
	 boolean d=false;
	   HashMap<Integer,Integer> hm=new HashMap<Integer, Integer>(); 
	  	for(int i=0;i<arr.length;i++)
	  	{
	  	
	  		if(!hm.containsKey(arr[i]))
	  		{
	  			hm.put(arr[i],1);
	  		
	  		}
	  		else{
	  			hm.replace(arr[i],hm.get(arr[i] )+1);

	  		}
	  		
	  			  		
	  		
	  	}
	  	
	  	for (Map.Entry<Integer, Integer> entry : hm.entrySet()) 
  		{
  			  
  			if(entry.getValue() % g == 0){
  				d=true;
			
			}
  			else{
  				d=false;
  				break;
  			}
  			
  		}
	  	
	  	if(d)
	  		System.out.println("Possible");
	  	else
	  		System.out.println("Not possible");
			  	
  	
	  	
   }

}
