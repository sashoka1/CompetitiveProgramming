
package com.ashok.code;
import java.util.ArrayList;



public class JavaInterviewPrograms
{

public static void main(String[] args){

int m=0,n=0;

ArrayList<Integer> list = new ArrayList<Integer>();

for(int i=0;i<100000000;i++){

if (list.size()<2){

n=m;

m=i;

list.add(m+n);

}

else{

m=list.get(i-1);

n=list.get(i-2);

list.add(m+n);

}

}

System.out.println("Jai Baba Fibonacci"+list.get(list.size()-1));

}

}