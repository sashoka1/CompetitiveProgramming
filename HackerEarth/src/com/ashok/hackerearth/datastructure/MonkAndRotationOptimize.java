package com.ashok.hackerearth.datastructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class MonkAndRotationOptimize {
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
 
		int t = Integer.parseInt(br.readLine());
		int po = 0;
		String[] in = null;
		String A = null,a = null,b = null;
		while(t-->0)
		{
			in = br.readLine().split(" ");
 
			int N = Integer.parseInt(in[0]);
			int K = Integer.parseInt(in[1]);
			//System.out.println("wrfwsx");
			K = K%N;
 
			A = br.readLine();
			if(K == 0)
				out.println(A);
			else
			{
				po = ordinalIndexOf(A," ",N-K);
				
				a = A.substring(po+1); 
				b = A.substring(0,po);
				out.println(a+" "+b);
			}
		}
		out.close();
    }
 
    public static int ordinalIndexOf(String str, String substr, int n) 
    {
    	int pos = str.indexOf(substr);
    	while (--n > 0 && pos != -1)
        	pos = str.indexOf(substr, pos + 1);
    	return pos;
	}

}
