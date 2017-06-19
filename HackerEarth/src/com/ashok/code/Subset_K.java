package com.ashok.code;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
 
 
public class Subset_K {
    public static void main(String[]args)
    {
        Set<String> x;
        int n=4;
        int k=2;
        int arr[]={1,2,3,4};
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<=(n-k);i++)
            sb.append("0");
        for(int i=1;i<=k;i++)
            sb.append("1");
        String bin=sb.toString();
        x=generatePerm(bin);
        Set<ArrayList <Object>> outer=new HashSet<ArrayList <Object>>();
        for(String s:x){
            int dec=Integer.parseInt(s,2);
            ArrayList<Object> inner=new ArrayList<Object>();
            for(int j=0;j<n;j++){
                if((dec&(1<<j))>0)
                    inner.add(arr[j]);
            }
            outer.add(inner);
        }
        for(ArrayList<Object> z:outer){
            System.out.println(z);
        }
    }
 
    public static Set<String> generatePerm(String input)
    {
        Set<String> set = new HashSet<String>();
        if ("".equals(input))
            return set;
 
        Character a = input.charAt(0);
 
        if (input.length() > 1)
        {
            input = input.substring(1);
 
            Set<String> permSet = generatePerm(input);
 
            for (String x : permSet)
            {
                for (int i = 0; i <= x.length(); i++)
                {
                    set.add(x.substring(0, i) + a + x.substring(i));
                }
            }
        }
        else
        {
            set.add(a + "");
        }
        return set;
    }
    }