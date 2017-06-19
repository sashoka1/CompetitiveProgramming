package com.ashok.basicprogramming;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author Ashok
 *
 */
public class TestCase {

public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	int N=Integer.parseInt(br.readLine());
    	for(int i=0;i<N;i++){
    		String []firstArray=br.readLine().split(" ");
    		
    		int n=Integer.parseInt(firstArray[0]);
    		int p=Integer.parseInt(firstArray[1]);
    		int m=Integer.parseInt(firstArray[2]);
    		int arr[]= new int[n+1];
    		String []pArray=br.readLine().split(" ");
    		String []mArray=br.readLine().split(" ");
    		for(int j=0;j<p;j++){
    			arr[Integer.parseInt(pArray[j])]++;
    		}
    		for(int j=0;j<m;j++){
    			arr[Integer.parseInt(mArray[j])]++;
    		}
    		
    		findSolutions(arr,n);
    	}
    	br.close();
	}

	private static void findSolutions(int[] array, int N) {
		boolean isPos=true;
        for(int i=1;i<=N;i++){
            if(array[i]==0){
                isPos=false;
                break;
            }
        }
        if(isPos){
            System.out.println("They can");
        }else{
            System.out.println("They can't");
        }
	}

}
