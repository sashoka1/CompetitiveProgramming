package com.ashok.code;
/* IMPORTANT: class must not be public. */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Calendar;



public class  Calender {
    public static void main(String args[] ) throws Exception {
    	Calendar todayCal = Calendar.getInstance();
        todayCal.setTimeInMillis(921312312);
        
       int y= todayCal.get(Calendar.YEAR);
        int d=todayCal.get(Calendar.DATE);
      int m=  todayCal.get(Calendar.MONTH);
      
      System.out.println(d + " " + (m+1) +" "+ y);
    
    }
}
