package com.ashok.code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;


public class UniqueJems {

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		//String str="aabb";
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    // int n=Integer.parseInt(br.readLine());
	    // String arr[]=new String[n];
	     //for(int i=0;i<arr.length;i++)
	     //{
	    	
	    	 ArrayList<String> getAllUniqueSubset=getAllUniqueSubset("ppgpxggxppppggxxxpgxgppggxxggggpgpxxggggxpgxpggpggpgppxpggggppxgpxgxpppxxpxgggxxxpgxxppggggppgpgppx");
	    	 System.out.println(getAllUniqueSubset.size());
	    	 System.out.println(getAllUniqueSubset);
	     
	    // }
	}

	public static ArrayList<String> getAllUniqueSubset(String str) {
        ArrayList<String> set = new ArrayList<String>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length() - i; j++) {
                String elem = str.substring(j, j + (i+1));
                if (!set.contains(elem)) 
                {
                	
                	
                	
                		if(elem.length()==2 && elem.charAt(0)==elem.charAt(1))
                		{
                			set.add(elem);
                		}
                		if(elem.length() > 2 && elem.length() %2==0)
                		{
                			
                			//set.add(elem);
                			 //Creating a HashMap containing char as a key and occurrences as  a value
                			 
                	        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
                	 
                	        //Converting given string to char array
                	 
                	        char[] strArray = elem.toCharArray();
                	 
                	        //checking each char of strArray
                	 
                	        for (char c : strArray)
                	        {
                	            if(charCountMap.containsKey(c))
                	            {
                	                //If char is present in charCountMap, incrementing it's count by 1
                	 
                	                charCountMap.put(c, charCountMap.get(c)+1);
                	            }
                	            else
                	            {
                	                //If char is not present in charCountMap,
                	                //putting this char to charCountMap with 1 as it's value
                	 
                	                charCountMap.put(c, 1);
                	            }
                	        }
                	 
                	        //Printing the charCountMap
                	 
                	        //System.out.println(charCountMap);                			
                			Integer[] values = charCountMap.values().toArray(new Integer[charCountMap.size()]);
                			
                			int c=0;
                			for (int l = 0; l < values.length; l++) 
                			{
                				
                			
                				int a=values[0];
                				if(a==values[l]){
                					c++;
                					
                				}
                				if(c==values.length){
                					set.add(elem);
                				}              			
                				
                			}                			
                			
             		}
                		
                	
                }
            }
        }
        return set;
    }
}
