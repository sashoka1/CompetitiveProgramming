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
public class FrequencyCountUsingHasing {
	
	
	public static void main(String[] args) {
		
		String str="aahkcreeatrha";
		countFre(str);
		       
	}

private static void countFre(String S)
{
	int Frequency[]=new int[26];
	
    char arr[]=S.toCharArray();
	
        for(int i = 0;i < S.length();++i){
            int index=hashFunction(arr[i]);
            if(Frequency[index]==0){
            	 Frequency[index]=1;
            }else{
            Frequency[index]=Frequency[index]+1;
            }
          }
        
        for(int i=0;i<26;i++){
        	System.out.println((char) (i+'a')+ " : " +Frequency[i]);
        }

}

private static int hashFunction(char c) {
	
	return (c-'a');
}
}	

