package com.ashok.basicprogramming;
public class StrManipulation{
  static int count;
    public static void combinations(String suffix,String prefix){
    	int lcount=0; 
        if(prefix.length()<0)return;
       // System.out.println(suffix);
        if(suffix.length()==3 && suffix.equals("abc")){
        count++;
        }
        if(suffix.length()>3 && suffix.charAt(0)=='a' && suffix.charAt(suffix.length()-1)=='c'){
	        for(int j=0;j<suffix.length()-1;j++){
	        	if(suffix.charAt(j)<=suffix.charAt(j+1)){
	        		lcount++;
	        	}
	        }
	        
        }if(lcount==suffix.length()-1 && suffix.length()>2){
        	//System.out.println(suffix);
        	count++;
        }
        for(int i=0;i<prefix.length();i++)
         combinations(suffix+prefix.charAt(i),prefix.substring(i+1,prefix.length()));
    }

    public static void main (String args[]){
        combinations("","abcabc");
        System.out.println(count);
        }
}