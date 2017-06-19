package com.ashok.sortingalgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OldKeyPadInForeignLandUsingSelectionSort {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());		
		String inputsFrequency[]=br.readLine().split(" ");	
		int keySize=Integer.parseInt(br.readLine());
		String KeyArray[]=br.readLine().split(" ");
		findMinimalKeyStroke(n,inputsFrequency,keySize,KeyArray);
		
		
	}

	private static void findMinimalKeyStroke(int n, String[] inputsFrequency,
			int keySize, String[] keyArray) {
		
		for(int i=0;i<n;i++){
			int iMax=i;
			for(int j=i+1;j<inputsFrequency.length;j++){
				if(Integer.parseInt(inputsFrequency[j])>Integer.parseInt(inputsFrequency[iMax])){
					iMax=j;
				}
			}
			
			int key[]=new int[Integer.parseInt(keyArray[0])];
			String temp=inputsFrequency[i];
			inputsFrequency[i]=inputsFrequency[iMax];
			inputsFrequency[iMax]=temp;
			
		}
		
	}

	
	
}
