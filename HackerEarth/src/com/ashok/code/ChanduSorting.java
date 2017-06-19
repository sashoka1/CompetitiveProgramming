package com.ashok.code;
/* IMPORTANT: class must not be public. */


import java.io.BufferedReader;
import java.io.InputStreamReader;





class ChanduSorting {
    public static void main(String args[] ) throws Exception {
       
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++)
        {
        	StringBuffer str=new StringBuffer(br.readLine());
        	Change(str);
        }
    }

	private static void Change(StringBuffer str)
	{
		int c=0;
		for(int i=0;i<str.length()-1;i++)
    	{
    		if(str.charAt(i)==str.charAt(i+1))
    		{
    			
    			str.deleteCharAt(i);
    			i--;
    		}
        }
    	
    	System.out.println(str);
		
	}  
       
}
