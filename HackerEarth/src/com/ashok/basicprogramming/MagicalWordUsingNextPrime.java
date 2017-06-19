package com.ashok.basicprogramming;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Ashok
 * Email : sashoka1@gmail.com
 *
 */
class MagicalWordUsingNextPrime {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		Map<Character, Character> map=new HashMap<Character, Character>();
		map.put('A', 'C');map.put('B', 'C');map.put('C', 'C');map.put('D', 'C');
		map.put('E', 'C');map.put('F', 'G');map.put('G', 'G');map.put('H', 'G');
		map.put('I', 'I');map.put('J', 'I');map.put('K', 'I');map.put('L', 'O');
		map.put('M', 'O');map.put('N', 'O');map.put('O', 'O');map.put('P', '0');
		map.put('Q', 'O');map.put('R', 'S');map.put('S', 'S');map.put('T', 'S');
		map.put('U', 'S');map.put('V', 'S');map.put('W', 'Y');map.put('X', 'Y');
		map.put('Y', 'Y');map.put('Z', 'Y');
		map.put('a', 'a');map.put('b', 'a');map.put('c', 'a');map.put('d', 'e');
		map.put('e', 'e');map.put('f', 'e');map.put('g', 'g');map.put('h', 'g');
		map.put('i', 'g');map.put('j', 'k');map.put('k', 'k');map.put('l', 'k');
		map.put('m', 'm');map.put('n', 'm');map.put('o', 'm');map.put('p', 'q');
		map.put('q', 'q');map.put('r', 'q');map.put('s', 'q');map.put('t', 'q');
		map.put('u', 'q');map.put('v', 'q');map.put('w', 'q');map.put('x', 'q');
		map.put('y', 'q');map.put('z', 'q');
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int numberOfTestCase=Integer.parseInt(br.readLine());
		int len=Integer.parseInt(br.readLine());
		for(int i=0;i<numberOfTestCase;i++){
			String str=br.readLine();
		    findMagicalWord(str,map,len);
		}
		
	 //   br.close();
	
	}

	private static void findMagicalWord(String str, Map<Character, Character> map,int len) {
		for(int i=0;i<str.length();i++){
			System.out.print(map.get(str.charAt(i)));
		}
		System.out.println();
		
	}

}