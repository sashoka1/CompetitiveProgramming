package com.ashok.basicprogramming;
/* IMPORTANT: Multiple classes and nested static classes are supported */
 
/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
//import for Scanner and other utility  classes
import java.util.*;
*/
import java.io.*;
import java.util.*;
 
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int t = Integer.parseInt(line);
        
        while(t--!=0){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int N=Integer.parseInt(st.nextToken());
            int P=Integer.parseInt(st.nextToken());
            int M=Integer.parseInt(st.nextToken());
            
            int ar[]=new int[N+1];
            
            st=new StringTokenizer(br.readLine());
            for(int i=0;i<P;i++){
                ar[Integer.parseInt(st.nextToken())]++;
            }
            
            st=new StringTokenizer(br.readLine());
            for(int i=0;i<M;i++){
                ar[Integer.parseInt(st.nextToken())]++;
            }
            boolean isPos=true;
            for(int i=1;i<=N;i++){
                if(ar[i]==0){
                    isPos=false;
                    break;
                }
            }
            if(isPos){
                System.out.println("They can");
            }else{
                System.out.println("They can't");
            }
        }
    }
}
