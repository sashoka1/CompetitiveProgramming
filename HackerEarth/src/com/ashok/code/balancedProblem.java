package com.ashok.code;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class balancedProblem {
	static int initialIndex;
	static int lastIndex;
	static int originalLength = 0;
	static String temp;
	static int totalStrings = 0;
	static ArrayList<Integer> myArr = new ArrayList<Integer>();

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		while (line != null) {
			if (line.trim().equals(""))
				break;
			int count = 0;
			if (totalStrings == 0)
				totalStrings++;
			else {
				int length = line.length();
				for (int i = 2; i <= length; i++) {
					count = count + getBalancedSubStrings(line, i);
				}
				myArr.add(count);
			}
			line = br.readLine();
		}
		for (int i = 0; i < myArr.size(); i++) {
			System.out.println(myArr.get(i).intValue());
		}

	}

	public static int getBalancedSubStrings(String line, int length) {
		originalLength = 0;
		initialIndex = 0;
		lastIndex = length;
		int count = 0;
		boolean valid;
		while (lastIndex <= line.length()) {
			temp = line.substring(initialIndex, lastIndex);
            valid=isBalanced(temp);
            if(valid==true)count++;
			initialIndex++;
			lastIndex++;
		}
		return count;
	}
	
	public static boolean isBalanced(String temp){
		int index;
		int[] arr=new int[256];
		for(int i=0;i<temp.length();i++){
			index=temp.charAt(i);
			arr[index]++;
		}
		for(int w=97;w<=122;w++){
			
			if(arr[w]!=0&&(arr[w]%2!=0))
		    return false;
		}return true;
	}

}
