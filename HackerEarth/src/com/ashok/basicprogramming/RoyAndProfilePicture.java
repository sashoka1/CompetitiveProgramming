package com.ashok.basicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author Ashok
 *
 *sashoka1@gmail.com
 */
public class RoyAndProfilePicture {


	public static void main(String[] args) throws IOException {
		   
					BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				    	int L=Integer.parseInt(br.readLine());
				    	int N=Integer.parseInt(br.readLine());
				    
				    	for(int i=0;i<N;i++)
				        {
				    		
				    		String []b1=br.readLine().split(" ");
				    		findPhotoCoordinate(L,N,b1);
				        }
				    
				    	br.close();
				    	
}

	private static void findPhotoCoordinate(int l, int n, String[] b1) {
	       int width=Integer.parseInt(b1[0]);
	       int height=Integer.parseInt(b1[1]);
	       if(height<l || width < l){
	    	   System.out.println("UPLOAD ANOTHER");
	       }else if((height==width)||(height ==l && width==l)){
	    	   System.out.println("ACCEPTED");
	       }else{
	    	   System.out.println("CROP IT");
	       }
	    	   
		
	}
	
	
	
}
