package com.ashok.code;
/* IMPORTANT: class must not be public. */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;



class DashCount {
    public static void main(String args[] ) throws Exception {
       
    	StringBuilder sb=new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c=0;
        String line = br.readLine();
        
        for(int i=0;i<line.length();i++){
        	
        	char ch=line.charAt(i);
        	switch(ch){
        	case 'a':
	        			sb.append(1);
	        			break;
        	case 'b':
        				sb.append(2);
		    			break;
    		case 'c':
    					sb.append(3);
		    			break;
    		case 'd':
    					sb.append(4);
		    			break;
    		case 'e':
    					sb.append(5);
		    			break;
    		case 'f':
    					sb.append(6);
		    			break;
    		case 'g':
    					sb.append(7);
		    			break;
    		case 'h':
    					sb.append(8);
		    			break;
    		case 'i':
    					sb.append(9);
		    			break;
		        		
        		}
        }
        BigInteger num=  new BigInteger(sb.toString());
        BigInteger bi1, bi2,bi3;
        bi1=new BigInteger("6");
        bi2=new BigInteger("0");
        bi3=num.mod(bi1);
        if(bi2.equals(bi3))
        	System.out.println("YES");
        else
        	System.out.println("NO");
               	
       
    }
  
}
