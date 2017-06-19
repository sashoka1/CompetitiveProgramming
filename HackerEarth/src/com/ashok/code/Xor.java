package com.ashok.code;
/* IMPORTANT: class must not be public. */
import java.util.ArrayList;
import java.util.List;




class Xor {
    public static void main(String args[] ) throws Exception {
    	List<Integer> s = new ArrayList<Integer>();
        s.add(1);
        s.add(2);
        s.add(3);
        int setSize = s.size();
        int finalValue = (int) (Math.pow(2, setSize));
        String bValue = "";
        for (int i = 0; i < finalValue; i++) {
            bValue = Integer.toBinaryString(i);
            int bValueSize = bValue.length();
            for (int k = 0; k < (setSize - bValueSize); k++) {
                bValue = "0" + bValue;
            }
            System.out.print("");
            for (int j = 0; j < setSize; j++) {
                if (bValue.charAt(j) == '1') {
                    System.out.print((s.get(j)) + " ");
                }
            }
            System.out.print(",");
        }
}
    
}