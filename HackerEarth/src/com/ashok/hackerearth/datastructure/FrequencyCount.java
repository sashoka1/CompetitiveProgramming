/**
 * 
 */
package com.ashok.hackerearth.datastructure;

/**
 * @author Ashok Singh 
 * sashoka1@gmail.com
 * 
 * The simplest way to find frequency count is to iterate over all the possible characters and count their frequency one by one. 
 * The time complexity of this approach is O(26*N) where N is the size of the string and there are 26 possible characters.
 *
 */
public class FrequencyCount {
	
	
	public static void main(String[] args) {
		
		String str="ashokssaaaaingh";
		countFre(str);
		       
	}

private static void countFre(String S)
{
    char arr[]=S.toCharArray();
	for(char c = 'a';c <= 'z';++c)
    {
        int frequency = 0;
        for(int i = 0;i < S.length();++i)
            if(arr[i]== c)
                frequency++;
        System.out.println(c + " " + frequency);
       
    }
}
}	

