package com.ashok.hackerearth.datastructure;
import java.util.Scanner;
import java.util.Stack;
public class MonkAndPhilospherStone {

public static void main(String[] args) {
Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		int[] arr1 = new int[n];
			for(int i=0;i<n;i++)
			{
					arr[i] = s.nextInt();
						arr1[i]=0;
			}
				int q = s.nextInt();
				int x = s.nextInt();
				int j=0,p=0;
				int sum=0;
				int ptr=0;
		Stack monk = new Stack();
		for(int i=0;i<q;i++)
		{
			char str = s.next().charAt(0);
			
			if(str=='H')
			{
				monk.add(arr[j]);
				sum = sum+arr[j];
				ptr = j;
				j++;
			if(sum==x)
			{
				p++;
				break;
			}
}

	if(str=='R')
	{


		monk.pop();
		int v = ptr;
		for(v =ptr;v>=0;v--)
		{
				if(arr1[v]==0)
				{
					break;
				}
		}
		sum = sum - arr[v];
		
		arr1[v]=1;
		
		if(sum==x)
		{
			p++;
			break;
		} 
   }
		}
		if(p>0)
		{
				System.out.println(monk.size());
		}
		else
		{
				System.out.println("-1");
			}
		}
}