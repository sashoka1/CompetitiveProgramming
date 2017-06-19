package com.ashok.code;
/* IMPORTANT: class must not be public. */



import java.util.Scanner;




class GoIndiaHack {
    public static void main(String args[] ) throws Exception {
       
    	
        @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
        	int a=sc.nextInt();
        	int b=sc.nextInt();
        	int c=sc.nextInt();
        	int d=sc.nextInt();
        	findWinner(a,b,c,d);
        
        }
    }

	private static void findWinner(int a, int b, int c,int d) 
	{
			for(int i=a;i<=c;i++)
			{
				for(int j=b;j<=d;j++)
				{
					
					int upwardi=i+1;
					int upwardj=j;
					if(upwardi==c && upwardj ==d){
						c++;
					}
					
					int righti=i;
					int rightj=j+1;
					
					int dioi=i+1;
					int dioj=j+1;		
							

				}
			}
	}

}
