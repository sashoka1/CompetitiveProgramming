package com.ashok.code;
/* IMPORTANT: class must not be public. */



import java.util.Scanner;




class FightIndia {
    public static void main(String args[] ) throws Exception {
       
    	
        @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
        	int n1=sc.nextInt();
        	int n2=sc.nextInt();
        	int n3=sc.nextInt();
        	findWinner(n1,n2,n3);
        
        }
    }

	private static void findWinner(int n, int m1, int m2) 
	{
		boolean[] dp = new boolean[n+1];
        
        int min = Math.min(m1,m2);
        for(int i=0;i<min;i++)
        dp[i] = false;
        if(m1<=n)
        dp[m1] = true;
        if(m2<=n)
        dp[m2] = true;
        for(int i= min+1;i<=n;i++)
        {
			if(m1<=i)            	
        	dp[i] = !dp[i-m1] ;
        	if(m2<=i)
        	dp[i] = dp[i] || !dp[i-m2];
        }
        
        if(dp[n])
          System.out.println(1);
        else
          System.out.println(0);
		
	}

	    	
   
	 
       
}
