package com.ashok.hackerearth.datastructure;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TheFootBallFestUsingStackOptimized {
	public static void main(String args[] ) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line = br.readLine();
			int N = Integer.parseInt(line);
			for (int i = 0; i < N; i++) {
				String[] line2= br.readLine().split("\\s+"); 
				int a=Integer.valueOf(line2[0]);
				Stack<Integer> stack=new Stack<Integer>();
				stack.push(Integer.valueOf(line2[1]));
					for(int j=0;j<a;j++){
								String[] line3=br.readLine().split("\\s+"); 
								if(line3[0].equals("P")){
										stack.push(Integer.valueOf(line3[1]));
								}else{
										stack.push(stack.get(stack.size()-2));
								}
					} 
					System.out.println("Player "+stack.peek());
		}
	}
}