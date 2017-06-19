package com.ashok.code;
/* IMPORTANT: class must not be public. */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



class TestClass {
    public static void main(String args[] ) throws Exception {
       

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        String website[]=new String[N];
        
        for (int i = 0; i < N; i++) 
        {
        	website[i]=br.readLine();
        }
        for (int i = 0; i < N; i++) 
        {
        	int c=0;
        	String st=website[i].substring(4,website[i].indexOf(".com"));
	        for(int j=0;j<st.length();j++)
	        {
	       	 char ch=st.charAt(j);
	       	 if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
	       	 {
	       		 c++;
	       	 }
	        }
	        System.out.println(((st.length()-c)+4)+"/"+ (st.length()+8));
        }
    }
}
