package com.ashok.basicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * @author Ashok
 *
 *sashoka1@gmail.com
 */
public class XsquareAndTwoStrings {


	public static void main(String[] args) throws IOException {
		   
					Map<Integer, Integer> numChars=new HashMap<Integer, Integer>();
					BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				    int numberOfTestCase=Integer.parseInt(br.readLine());
				
				    for(int i=0;i<numberOfTestCase;i++){
				    	String str1=br.readLine();
				    	String str2=br.readLine();
				    	findAllSubset(str1,str2);
				    }
	    	   System.out.println(numChars);
		
	}

	private static void findAllSubset(String str1, String str2) {
		List<String> arr=createSubsetUsingTree(str1);
		List<String> arr2=createSubsetUsingTree(str2);
		System.out.println(arr);
		
	}
	
	
	 private static List<String> createSubsetUsingTree(String str){
		 
		  List<String> result = new ArrayList<String>(); 
		
		  if(str!=null && str.length()>0){
		 
		   for (int i = 0; i < str.length(); i++) {
		    List<String> tempList = new ArrayList<String>();
		    Iterator<String> iter = result.iterator();
		    while(iter.hasNext()){
		     String val = iter.next();
		 
		      tempList.add(val.substring(1,val.length()-1)+ str.charAt(i));
		     }
	
		    result.addAll(tempList);
		   }
		  }
		 
		  return result;
		 }

	
	
	
	
}
