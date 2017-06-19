package com.ashok.basicprogramming;
import java.io.*;
import java.util.*;

/**
 * @author Ashok
 *
 *sashoka1@gmail.com
 */
class GameOfXORFindXORofAllSubArray{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine().trim());
		while(t-->0){
			
			int n=Integer.parseInt(br.readLine().trim());
			String str[]=br.readLine().split(" ");
			findXORofAllSubArray(str,n);
			
		
		}

	}

	private static void findXORofAllSubArray(String[] str, int n) {
		int i,num,result=0;
		for(i=0;i<n;i++){
			num=Integer.parseInt(str[i]);
			if(i%2==0)
				result=result^num;
		}
		if(n%2==0){
			System.out.println("0");
		}else{
			System.out.println(result);
		}
		
	}
	
}