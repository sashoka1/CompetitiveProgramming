package com.ashok.basicprogramming;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class SortedSubstrings {
 
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			int n = Integer.parseInt(br.readLine());
			String s = br.readLine();
			long count = (long) n;
			long maxSubstringLen = 1;
			for(int i=0; i<n; i++){
				for(int j=i+1; j<n; j++){
					if((int)s.charAt(j-1) <= (int)s.charAt(j)){
						maxSubstringLen++;
					} else {
						i = j - 1;
						break;
					}
					if(j == n-1){
						i = n;
					}
				}
				count += totalSubsets(maxSubstringLen);
				maxSubstringLen = 1;
			}
			System.out.println(count);
		}
	}
 
	private static long totalSubsets(long n) {
		long total = n * (n-1);
		return total/2;
	}
 
}
