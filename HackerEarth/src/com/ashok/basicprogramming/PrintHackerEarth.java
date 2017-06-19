package com.ashok.basicprogramming;
import java.io.*;
import java.util.*;

/**
 * @author Ashok
 *
 *sashoka1@gmail.com
 */
class PrintHackerEarth{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int len=Integer.parseInt(br.readLine().trim());
		String str=br.readLine().trim();
		countFre(str,len);
		
	}
	
	private static void countFre(String S,int len)
	{
		//int aCount = 0,hCount = 0,cCount = 0,kCount = 0,eCount = 0,rCount = 0,tCount = 0;
		int arrayOfAHER[]=new int[4];
		int arrayofCKT[]=new int[3];
		
		for(int i=0;i<len;i++){
			switch(S.charAt(i)){
			case 'a':
				arrayOfAHER[0]++;
				break;
			case 'h' :
				arrayOfAHER[1]++;
				break;
			case 'e' :
				arrayOfAHER[2]++;
				break;
			case 'r' :
				arrayOfAHER[3]++;
				break;
			case 'c':
				arrayofCKT[0]++;
				break;
			case 'k':
				arrayofCKT[1]++;
				break;
			case 't':
				arrayofCKT[2]++;
				break;
			}
		}
		Arrays.sort(arrayOfAHER);
		Arrays.sort(arrayofCKT);
		int minAHER=arrayOfAHER[0]/2;
		int minCKT=arrayofCKT[0]/1;
		if(minAHER<minCKT){
			System.out.println(minAHER);
		}else{
			System.out.println(minCKT);
		}
		/*
		System.out.println(4%2);
		System.out.println(4/2);
		System.out.println(aCount + " " + hCount +" "+cCount + " "+ kCount+" "+eCount +" "+rCount+" "+tCount);*/

	}

}