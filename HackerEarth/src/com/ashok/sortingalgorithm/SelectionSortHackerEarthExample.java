package com.ashok.sortingalgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SelectionSortHackerEarthExample {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String inputs[]=br.readLine().split(" ");
		String array[]=br.readLine().split(" ");
		selectionSort(array,inputs);
		for(int i=0;i<array.length;i++)
			if(i==array.length-1){
				System.out.print(array[i]);
			}else{
				System.out.print(array[i]+" ");
			}
	}

	private static void selectionSort(String[] array, String[] inputs) {
		int arrLengh=Integer.parseInt(inputs[0]);		
		int x=Integer.parseInt(inputs[1]);
		
		for(int i=0;i<x;i++){
			int iMin=i;
			for(int j=i+1;j<arrLengh;j++){
				if(Integer.parseInt(array[j])<Integer.parseInt(array[iMin])){
					iMin=j;
				}
			}
			String temp=array[i];
			array[i]=array[iMin];
			array[iMin]=temp;
			
		}
		
	}

}
