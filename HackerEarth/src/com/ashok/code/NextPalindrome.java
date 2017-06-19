package com.ashok.code;
/* IMPORTANT: class must not be public. */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class NextPalindrome {
	public static int i, j, mid;
    public static String num;
    public static boolean incFlag, isOdd, isPalin;
    public static StringBuilder ans, tempSB;
    
    
    public static void main(String[] args) throws IOException {
        
         BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        int nn = Integer.parseInt(bi.readLine());
        StringBuilder ret = new StringBuilder();
        
        mainloop:
        while(nn-->0) {
            num = bi.readLine();
 
            //palindrome check
            if(num.length()==1) {
                if(num.charAt(0) == '9') {
                    ans = new StringBuilder("11");
                    ret.append(ans).append("\n");
                    continue;
                }
                else {
                    ans = new StringBuilder(num.charAt(0)-47+"");
                    ret.append(ans).append("\n");
                    continue;
                }
            }
            
            tempSB = new StringBuilder();
            int i, n, c = 1, a;
            String s = num;
            for(i=s.length()-1; i>=0; i--) {
                n = s.charAt(i)-48;
                a = n+c;
                c = a/10;
                a %= 10;
                tempSB.append(a);
                if(c==0) {
                    num = new StringBuilder(s.substring(0, i)).append(tempSB.reverse()).toString();
                    break;
                }
            }
            if(i==-1)
                num = new StringBuilder("1").append(tempSB.reverse()).toString();
 
            mid = num.length()/2;
            isOdd = (num.length()&1)==1;
 
            if(isOdd) {
                ans = new StringBuilder(num.substring(0, mid+1));
                i = mid-1;
                j = mid+1;
            }
            else {
                ans = new StringBuilder(num.substring(0, mid));
                i=mid-1;
                j=mid;
            }
 
            incFlag = false;
            while(i>=0 && j<=num.length()) {
                if(num.charAt(i) < num.charAt(j)) {
                    incFlag = true;
                    break;
                }
                else if(num.charAt(i) == num.charAt(j)) {
                    j++;
                    i--;
                }
                else if(num.charAt(i) > num.charAt(j)) {
                    incFlag = false;
                    break;
                }
            }
 
            if(incFlag) {
                tempSB = new StringBuilder();
                c = 1;
                s = ans.toString();
                for(i=s.length()-1; i>=0; i--) {
                    n = s.charAt(i)-48;
                    a = n+c;
                    c = a/10;
                    a %= 10;
                    tempSB.append(a);
                    if(c==0) {
                        ans = new StringBuilder(s.substring(0, i)).append(tempSB.reverse());
                        break;
                    }
                }
                if(i==-1)
                    ans = new StringBuilder("1").append(tempSB.reverse());
            }
 
            if(isOdd) {
                ans.append(new StringBuilder(ans.substring(0, ans.length()-1)).reverse());
            }
            else {
                ans.append(new StringBuilder(ans.substring(0, ans.length())).reverse());
            }
            ret.append(ans).append("\n");
        }
        
        System.out.print(ret);
    }
}

