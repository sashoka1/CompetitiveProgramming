package com.ashok.code;
import java.util.ArrayList; 
import java.util.HashMap; 
import java.util.Map; 

import java.util.List; 

public class CopyOfAdderPair { 
public static void main(String[] args)
{ 
	//extractFromPattern("MT-202", "MT");
	
	System.out.println(extractFromPattern("MT102", "MT"));
}


public static String extractFromPattern(String inputString, String fromPattern) {
    return extractFromPattern(inputString, 0, fromPattern);
}

public static String extractFromPattern(String inputString, int fromPosition, String fromPattern) {
    if (inputString != null && fromPattern != null && fromPosition >= 0 && fromPosition < inputString.length()) {
        String[] lines = getLines(inputString);
        StringBuffer inputStringBuffer = new StringBuffer();
        for (int i = 0; i < lines.length; i++) {
            inputStringBuffer.append(lines[i]);
        }
        inputStringBuffer = new StringBuffer(inputStringBuffer.substring(fromPosition));
        if (inputStringBuffer.indexOf(fromPattern) != -1) {
            int index = inputStringBuffer.indexOf(fromPattern) + fromPattern.length();
            return inputStringBuffer.substring(index,index + 3).toString();
        } else {
            return "";
        }
    } else {
        return inputString;
    }
}

public static String[] getLines(String inputString) {
    if (inputString != null) {
        return inputString.split("\r\n");
    } else {
        return null;
    }
}
}