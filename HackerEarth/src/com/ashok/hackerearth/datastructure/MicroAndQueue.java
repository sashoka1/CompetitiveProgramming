/**
 * 
 */
package com.ashok.hackerearth.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;


/**
 * @author Ashok Singh 
 * sashoka1@gmail.com
 *
 */
public class MicroAndQueue {
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		   
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    	int n=Integer.parseInt(br.readLine());
	    	Load obj=new Load(n);
	    	//int Queue[]=new int[n];
	    	for(int i=0;i<n;i++)
	        {
	        	String []b=br.readLine().split(" ");
	            if(b[0].charAt(0)=='D'){
	            	obj.remove();
	            }else if(b[0].charAt(0)=='E'){
	            	obj.insert(Integer.parseInt(b[1]));
	        	}
	        }
		    
		       
	}
}	

class Load{
	
	protected int Queue[] ;
    protected int front;
	protected int rear;
	protected int size;
	protected int len;
 
    /* Constructor */
    public Load(int n) 
    {
        size = n;
        len = 0;
        Queue = new int[size];
        front = -1;
        rear = -1;
    }    
    /*  Function to check if queue is empty */
    public boolean isEmpty() 
    {
        return front == -1;
    }    
    /*  Function to check if queue is full */
    public boolean isFull() 
    {
        return front==0 && rear == size -1 ;
    }    
    /*  Function to get the size of the queue */
    public int getSize()
    {
        return len ;
    } 
	

	 /*  Function to insert an element to the queue */
    public void insert(int i) 
    {
        if (rear == -1) 
        {
            front = 0;
            rear = 0;
            Queue[rear] = i;
        }
        else if (rear + 1 >= size)
            throw new IndexOutOfBoundsException("Overflow Exception");
        else if ( rear + 1 < size)
            Queue[++rear] = i;    
        len++ ;  
        System.out.println(getSize());
    }    
    
    /*  Function to remove front element from the queue */
    public void remove() 
    {
        if (isEmpty())
          System.out.println("-1" + " "+ getSize());
        else 
        {
            len-- ;
            int ele = Queue[front];
            if ( front == rear) 
            {
                front = -1;
                rear = -1;
            }
            else
                front++;                
            System.out.println(ele+ " "+ getSize());
        }        
    }
	

}

	
