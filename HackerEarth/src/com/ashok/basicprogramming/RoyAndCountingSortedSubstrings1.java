package com.ashok.basicprogramming;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.PrintWriter;
 
public class RoyAndCountingSortedSubstrings1 {
 
	private static PrintWriter out = new PrintWriter(System.out);
	private static BufferedReader in;
 
	public static void main(String args[]) throws Exception {
		InputStream is = RoyAndCountingSortedSubstrings1.class.getResourceAsStream(RoyAndCountingSortedSubstrings1.class.getSimpleName() + ".in");
		boolean testMode = is != null;
		in = new BufferedReader(new java.io.InputStreamReader(testMode ? is : System.in));
 
		long start = System.currentTimeMillis();
		main();
 
		if (testMode) {
			out.println();
			out.print(System.currentTimeMillis() - start + " ms");
		}
		
 
		out.close();
	}
 
	private static void main() throws Exception {
		int T = Integer.parseInt(in.readLine());
		for (int t = 0; t < T; t++) {
			in.readLine();
			String s = in.readLine();
			long count = 0;
			
			long curLen = 0;
			
			int prevChar = 'a' - 1;
			for (int i = 0; i < s.length(); i++) {
				char curChar = s.charAt(i);
				if (curChar >= prevChar) {
					++curLen;
				} else {
					count += curLen * (curLen + 1) / 2;
					curLen = 1;
				}
				prevChar = curChar;
			}
			count += curLen * (curLen + 1) / 2;
			out.println(count);
		}
	}
 
}
