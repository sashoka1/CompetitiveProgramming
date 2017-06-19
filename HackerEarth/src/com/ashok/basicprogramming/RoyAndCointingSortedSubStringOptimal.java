package com.ashok.basicprogramming;
import java.io.*;
import java.util.*;

/**
 * @author Ashok
 *
 *sashoka1@gmail.com
 */
class RoyAndCointingSortedSubStringOptimal{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine().trim());
		while(t-->0){
			int n=Integer.parseInt(br.readLine().trim());
			String str=br.readLine().trim();
			long sum=str.length();
			for(int i=0;i<str.length();){
				int j;
				for(j=i+1;j<str.length();j++){
					if(str.charAt(j)>=str.charAt(j-1)){
						sum+=j-i;
					}
					else{
						break;
					}
				}
				i=j;
			}
			System.out.println(sum);
		}
	}
}