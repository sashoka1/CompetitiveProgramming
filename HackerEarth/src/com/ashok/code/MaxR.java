package com.ashok.code;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxR {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
        int N = Integer.parseInt(br.readLine());
        int arr[]=new int[N];
        
        for (int i = 0; i < N; i++) 
        {
        	arr[i]=Integer.parseInt(br.readLine());
        	SimpleAdd(arr[i]);
        
        }

	}
	
	public static void SimpleAdd(int arr){
		
		int x=1,y=1,m=1,n=1;
		
		int c=0;
		
		if(arr==1){
		}
		else if(arr==2){
			c=1;
		}
		else{
				
			while(x!=arr || y!=arr )
			{
				if(x!=arr && x< arr)
				{
					x=x + y;
					
					if(x > arr){
						x=x-y;
					}
					else{
						c++;
					}
				}
				if(y!=arr && y< arr)
				{
					y=x + y;
					
					if(y>arr){
						y=y-x;
					}
					else{
						c++;
					}
				}
				if(x==arr || y==arr  ){
					break;
				}

				
				
				/*System.out.println(x +" "+y);
				x=x+y;
				c++;
				
				if(x!=arr && x< arr)
				{
					y=y + x;
					
					if(y>arr){
						y=y-x;
						continue;
					}
					else{
						c++;
					}
				}
				if(x>arr)
				{
					x=x-y;
					y=x+y;
					
					continue;
				}				
				m=x;
				n=y;
				if(x==arr || y==arr  ){
					break;
				}
				
			}
								
				
				
*/			
			}
			
			
		
		System.out.println(c);
		
	}


	}}
