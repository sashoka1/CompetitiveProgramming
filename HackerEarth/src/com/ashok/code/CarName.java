package com.ashok.code;
/* IMPORTANT: class must not be public. */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;




class CarName {
    public static void main(String args[] ) throws Exception {
       
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
        	arr[i]=br.readLine();
        	carName(arr[i]);
        }
    }  
    public static void carName(String str){
    	ArrayList arrr=new ArrayList();
    	boolean flag=false;
    	int n1 = 0,n2 = 0,n3 = 0;
    	int l=str.length();
    	if(l<3){
    		flag=false;
    	}
    	else if(l==3)
    	{
    		if(str.charAt(0)!=str.charAt(1) && str.charAt(1)!=str.charAt(2))
    		{
    			n1=n2=n3=1;
    			flag=true;
    			
    		}
    	}
    	else
    	{
   
    		int j=1;
    		int i=0;
		    	while(i<l)
		    	{
		    		char ch=str.charAt(i);
		    		if(ch==str.charAt(j))
		    		{
		    			n1++;
		    			j++;
		    			flag=true;
		    			if(j==l)
		    			{
		    				
		    				i=j;
		    				break;
		    			}
		    			if(ch!=str.charAt(j))
			    		{
		    			   flag=false;
		    			   n2++;
			    		   i=j;
			    		   arrr.add(i);		    			
			    		}
		    			
		    		}
		    		else{
		    			flag=false;
		    			break;
		    		}
		    		
		    		
		    		
		    	}
    	}
    	
    	int l1=(Integer) arrr.get(0);
    	int l2=(Integer) arrr.get(1);
    	if((l1*2)!=l2){
    		flag=false;
    	}
    	if(flag==true )
    		System.out.println("OK");
    	else{
    		System.out.println("NOT OK");
    	}
    }
}
