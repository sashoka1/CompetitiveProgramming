package com.ashok.code;
/* IMPORTANT: class must not be public. */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;




class CarName1 {
    public static void main(String args[] ) throws Exception {
       
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
        	arr[i]=br.readLine();
        	carName(arr[i]);
        }
    }  
    public static void carName(String str)
    {
    	int len=str.length();
    	if(len%3==0)
    	{
    		
    		int strFreq=len/3;
    	//	if()
    		System.out.println(strFreq);
    		String substr1=str.substring(0, strFreq);
    		String substr2=str.substring(strFreq, 2*strFreq);
    		String substr3=str.substring(2*strFreq, 3*strFreq);
    		System.out.println(substr1);
    		System.out.println(substr2);
    		System.out.println(substr3);
    	}
    	else{
    		System.out.println("Not OK");
    	}
    }
    
}
