package com.ashok.hackerearth.datastructure;
import java.util.*;


class TwoDimeArray {
    public static void main(String args[] ) throws Exception {
       
        //BufferedReader
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       // String line = br.readLine();
       // int N = Integer.parseInt(line);

        //Scanner
        Scanner s = new Scanner(System.in);
        int M = s.nextInt();
        int  N= s.nextInt();
        int arr[][]=new int[M][N];
        for(int i=0;i<M;i++)
        	for(int j=0;j<N;j++)
        		arr[i][j]=s.nextInt();
      
        
        for(int i=0;i<N;i++){
        	for(int j=0;j<M;j++){
        		System.out.print(arr[j][i]+" ");
        }
        	System.out.println();
        }
       /* for (int i = arr.length-1; i >= 0; i--) {
            System.out.println(arr[i]);
        }*/
        s.close();

        //System.out.println("Hello World!");
    }
}