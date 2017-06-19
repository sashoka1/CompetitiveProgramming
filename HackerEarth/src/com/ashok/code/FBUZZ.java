package com.ashok.code;

import java.util.Scanner;

public class FBUZZ {

	public static void main(String[] args) 
	{
		
		
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
        	int stair=sc.nextInt();
        	int stair1=sc.nextInt();
        	
        	find(stair,stair1);
        }

		
	
		
	}

	private static void find(int stair,int stair1) {
		System.out.println(stair+stair1);
		
	}

}
