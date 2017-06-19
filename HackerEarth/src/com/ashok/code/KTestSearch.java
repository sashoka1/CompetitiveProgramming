package com.ashok.code;
/* IMPORTANT: class must not be public. */
import java.util.Scanner;
class KTestSearch {
    public static void main(String args[] ) throws Exception {
       
    	
    	Integer ways = null;
		Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        for(int i=0;i<num;i++)
        {
        	int sizeofm=sc.nextInt();
            int arr[]=new int[sizeofm];
            for(int j=0;j<sizeofm;j++)
            {
        		arr[j]=sc.nextInt();
        		
        	 }
            ways=count(arr, sizeofm, sizeofm);
            System.out.println(ways);
        }
       
    }

	    	
    static int count( int S[], int m, int n )
    {
        int i, j, x, y;
     
        // We need n+1 rows as the table is consturcted in bottom up manner using 
        // the base case 0 value case (n = 0)
        int table[][]=new int[n+1][m];
       
        
        // Fill the enteries for 0 value case (n = 0)
        for (i=0; i<m; i++)
            table[0][i] = 1;
     
        // Fill rest of the table enteries in bottom up manner  
        for (i = 1; i < n+1; i++)
        {
            for (j = 0; j < m; j++)
            {
                // Count of solutions including S[j]
                x = (i-S[j] >= 1)? table[i - S[j]][j]: 0;
     
                // Count of solutions excluding S[j]
                y = (j >= 1)? table[i][j-1]: 0;
     
                // total count
                table[i][j] = x + y;
            }
        }
        return table[n][m-1];
    }
}
