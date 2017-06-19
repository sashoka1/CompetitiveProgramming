package com.ashok.basicprogramming;
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
//import for Scanner and other utility  classes
import java.util.*;
 
class RoyKifeCycleClass {
    public static void main(String args[] ) throws Exception {
 
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
 
        int intraDay = 0;
        int crossDays = 0;
        
        int maxIntra = 0;
        int maxCross = 0;
        for (int i = 0; i < N; i++) {
            char[] line = br.readLine().toCharArray();
            for (char aLine : line) {
                if ('C' == aLine) {
                    maxIntra = Math.max(maxIntra, ++intraDay);
                    maxCross = Math.max(maxCross, ++crossDays);
                } else {
                    intraDay = 0;
                    crossDays = 0;
                }
            }
            intraDay = 0;
        }
        
        System.out.println(maxIntra + " " + maxCross);
    }
}