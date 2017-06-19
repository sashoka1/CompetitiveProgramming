package com.ashok.basicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author Ashok
 *
 */
public class Hacker {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	int N=Integer.parseInt(br.readLine());
    	for(int i=0;i<N;i++){
    		String []firstArray=br.readLine().split(" ");
    		isPossible(firstArray);
    	}
}

	private static void isPossible(String[] firstArray) {
		String string=firstArray[0];
		String password=firstArray[1];
		if(password.length()!=string.length()*2){
			System.out.println("Impossible");
			return;
		}
		if(!password.contains(string)){
			System.out.println("Impossible");
			return;
		}else{
			password=password.replaceFirst(string, "");
			if(string.equals(password)){
				System.out.println("Possible");
				return;
			}else{
				
				for(int i=0;i<string.length();i++){
					char c=password.charAt(0);
					password=password.substring(1)+c;
					if(string.equals(password)){
						System.out.println("Possible");
						return;
					}
				}
				System.out.println("Possible");
				return;
				
			}
		}
		
	}
}