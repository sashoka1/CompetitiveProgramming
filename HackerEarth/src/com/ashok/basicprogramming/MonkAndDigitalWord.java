package com.ashok.basicprogramming;
import java.io.*;
import java.util.*;

/**
 * @author Ashok
 *
 *sashoka1@gmail.com
 */
class MonkAndDigitalWord{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int len=Integer.parseInt(br.readLine().trim());
		String str1=br.readLine().trim();
		String str2=br.readLine().trim();
		int count=0;
		for(int i=0;i<len;i++){
			if(str1.contains(str2.subSequence(i, i+1))){
				count++;
				}
		}
		if(count==len){
		System.out.println("YES");
		}else{
		System.out.println("NO");
	}
	}

}