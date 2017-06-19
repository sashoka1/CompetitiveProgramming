package com.ashok.code;
import java.util.regex.Pattern;
public class PatternMatcher 
{ 
public static void main(String[] args) { 

	    String regex1= "777777((.*(\r\n)?)*)";
	    String regex2= "777777((.*(\r\n)?)*)";
	    
	    
	    String input = "777777"
	    		+"CITIUS33XXX";

	    boolean isMatch = Pattern.matches(regex1, input);
	    System.out.println(isMatch);//return true
} 
}