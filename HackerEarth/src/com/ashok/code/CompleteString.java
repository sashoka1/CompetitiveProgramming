package com.ashok.code;
/* IMPORTANT: class must not be public. */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



class CompleteString {
    public static void main(String args[] ) throws Exception {
       

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        String arr[]=new String[N];
        
        for (int i = 0; i < N; i++) 
        {
        	arr[i]=br.readLine();
        
        }
        for (int i = 0; i < N; i++) 
        {
        	findCompleteString(arr[i]);
        
        }

     }
    
    public static void findCompleteString(String str)
    {
    	int c=0;
    	 boolean b=false;
    	
    	boolean arr[]=new boolean[26];
	    	for(int i=0;i<26;i++)
	    	{
	    		arr[i]=false;
	    	}
    	
    		if(str.length()<26)
    		{
    			 System.out.println("NO");
    		}
    		else
    		{
    			 for(int j=0;j<str.length();j++)
    		        {
    				 
    		       	 	char ch=str.charAt(j);
    		       	 	
    		       	 	switch(ch)
    		       	 	{
    		       	 			case 'a':
    		       	 					arr[0]=true;
    		       	 					      break;
		    		       	    case 'b':
			       	 					arr[1]=true;
			       	 					break;
		
		    		       	 	case 'c':
		     	 					      arr[2]=true;
		     	 					      break;
		    		       	 	case 'd':
		    		       	 				arr[3]=true;
		    		       	 				break;
			    		       	 case 'e':
				 					      arr[4]=true;
				 					      break;
			    		       	case 'f':
				 					      arr[5]=true;
				 					      break;
			    		       	case 'g':
				 					      arr[6]=true;
				 					      break;
			    		       	case 'h':
				 					      arr[7]=true;
				 					      break;
			    		       	case 'i':
				 					      arr[8]=true;
				 					      break;
			    		       	case 'j':
				 					      arr[9]=true;
				 					      break;
			    		       	case 'k':
				 					      arr[10]=true;
				 					      break;
			    		       	case 'l':
				 					      arr[11]=true;
				 					      break;
			    		       	case 'm':
				 					      arr[12]=true;
				 					      break;
			    		       	case 'n':
				 					      arr[13]=true;
				 					      break;
			    		       	case 'o':
				 					      arr[14]=true;
				 					      break;
			    		       	case 'p':
				 					      arr[15]=true;
				 					      break;
			    		       	case 'q':
				 					      arr[16]=true;
				 					      break;
			    		       	case 'r':
				 					      arr[17]=true;
				 					      break;
			    		       	case 's':
				 					      arr[18]=true;
				 					      break;
			    		       	case 't':
				 					      arr[19]=true;
				 					      break;
			    		       	case 'u':
				 					      arr[20]=true;
				 					      break;
			    		       	case 'v':
				 					      arr[21]=true;
				 					      break;
			    		       	case 'w':
				 					      arr[22]=true;
				 					      break;
			    		       	case 'x':
			 					      	  arr[23]=true;
			 					          break;
			 					      
			    		       	case 'y':
			 					          arr[24]=true;
			 					          break;
			 					      
			    		       	case 'z':
			 					         arr[25]=true;
			 					         break;

    		       	 	}
    		        }
    			 for(int i=0;i<26;i++)
    			 {
    				 if(arr[i]==true)
    				 {
    					b=true;
    				 }
    				 else
    				 {
    					 b=false;
    					 break;
    					 
    				 }
    			 }
        		 
    			 if(b==true)
    			 {
    				 System.out.println("YES");
    			 }
    			 else
    			 {
    				 System.out.println("NO");
    			 }

    			
    			 }
    		
    }
}
