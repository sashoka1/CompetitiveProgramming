package com.ashok.basicprogramming;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
 
public class FavoriteSubSequenceOrSubSequenceInAGivenForm {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine().trim();
			long sum=str.length();
			for(int i=0;i<str.length();){
				int j;
				for(j=i+2;j<str.length();j++){
					if(str.charAt(j)>=str.charAt(j-1) && str.charAt(j-1) >=str.charAt(j-2)){
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