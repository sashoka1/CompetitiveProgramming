package com.ashok.sortingalgorithm;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[]={9,2,3,4,5,8};
		selectionSort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

	private static void selectionSort(int[] arr) {

		for(int i=0;i<arr.length-1;i++){
			int iMin=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[iMin]){
					iMin=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[iMin];
			arr[iMin]=temp;
		}
		
	}

}
