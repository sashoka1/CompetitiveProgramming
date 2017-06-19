package com.ashok.hackerearth.datastructure;
import java.util.*;


class OneDimeArray {
    public static void main(String args[] ) throws Exception {
       
        //BufferedReader
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       // String line = br.readLine();
       // int N = Integer.parseInt(line);

        //Scanner
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<arr.length;i++)
        	arr[i]=s.nextInt();
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
        s.close();

        //System.out.println("Hello World!");
    }
}