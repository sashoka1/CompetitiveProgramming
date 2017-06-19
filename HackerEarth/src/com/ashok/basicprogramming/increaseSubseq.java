package com.ashok.basicprogramming;
import java.util.ArrayList;

public class increaseSubseq { 

  public static void printAll (char[] a) { 
	  ArrayList<String> lst = new ArrayList<String>(); 
	  for (int i=0; i<a.length; i++) { 
      int max = 0; 
      max = a[i]; 
      StringBuilder sb = new StringBuilder(); 
      sb.append(max); 
        for (int j=i+1; j<a.length; j++) { 
          if (a[j] > max) { 
           max = a[j]; 
           sb.append(max); 
          } 
         } 
      lst.add(sb.toString()); 
     } 

     for (int i=0;i<lst.size(); i++){ 
       System.out.println(lst.get(i).toString()); 
     } 

} 

    public static void main(String[] args) { 

    String str="abcabc";
    char arr[]=str.toCharArray();
      int[] a = {5,4,7,8,2,3,6,9,8,6,2,3,4,5}; 
      printAll(arr); 

    } 
}