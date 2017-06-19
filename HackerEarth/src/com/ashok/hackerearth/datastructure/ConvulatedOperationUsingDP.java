package com.ashok.hackerearth.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author Ashok
 *
 */
public class ConvulatedOperationUsingDP {


	public static void main(String[] args) throws IOException {
		   
					BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				    	int n=Integer.parseInt(br.readLine());
				    	
				    	Integer operationCount=0;
				    	Map<Integer, Stack<String>> map=new HashMap<Integer, Stack<String>>() ;
				    	Stack<String> stack=new Stack<String>();
				    	for(int i=0;i<n;i++)
				        {
				    		
				    		String []b1=br.readLine().split(" ");
				        	if(b1[0].equals("0")){
				            	
				        		stack.pop();
				            	operationCount++;
								Stack<String> s=new Stack<String>();
								s.addAll(stack);
				            	map.put(operationCount, s);
				        	}else if(b1[0].equals("1")){
				            
				            	operationCount++;
				            	stack.push(b1[1]);
				            	Stack<String> s=new Stack<String>();
								s.addAll(stack);
				            	map.put(operationCount, s);
				            	
				            }else if(b1[0].endsWith("2")){
				            	operationCount++;
				            	Stack<String> s=new Stack<String>();
								s.addAll(stack);
				            	map.put(operationCount, s);
				            	findNumberOfElement(b1[1],b1[2],map);
				            }
				        }
				    	
				    	br.close();
				    	
}
	private static void findNumberOfElement(String string, String string2,Map<Integer, Stack<String>> map) {
		int element=Integer.parseInt(string2);
		int operationNumber=Integer.parseInt(string);		
		Stack<String> s=map.get(operationNumber);
		int count=0;
		for(int i=0;i<s.size();i++){
			if(Integer.parseInt(s.get(i))< element && Integer.parseInt(s.get(i))!=0){
				count++;
			}
		}
		System.out.println(count);
	}
	
	
	
}
