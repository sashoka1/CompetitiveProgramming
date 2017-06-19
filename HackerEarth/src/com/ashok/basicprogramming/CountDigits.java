package com.ashok.basicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author Ashok
 *
 *sashoka1@gmail.com
 */
public class CountDigits {


	public static void main(String[] args) throws IOException {
		   
					Map<Integer, Integer> numChars=new HashMap<Integer, Integer>();
					BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				    String str=br.readLine();
				    for(int i=0;i<str.length();i++){
				    	char charAt = str.charAt(i);
				    	/*if(i!= (int)charAt && !numChars.containsKey(i)){
				    		numChars.put(i, 1);
				    		i--;
				    	}else if(i!= (int)charAt){
				    		 numChars.put((int)i, (int)numChars.get(i) + 1);
				    		 i--;
				    	}*/

					    if (!numChars.containsKey((int)charAt))
					    {
					        numChars.put((int)charAt, 1);
					        i++;
					    }
					    else
					    {
					        numChars.put((int)charAt, (int)numChars.get(charAt) + 1);
					        i++;
					    }
				    }
	    	   System.out.println(numChars);
		
	}
	
	
	
}
