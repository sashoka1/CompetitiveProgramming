/**
 * 
 */
package com.ashok.hackerearth.datastructure;

/**
 * @author Ashok Singh 
 * sashoka1@gmail.com
 *
 */
	
public class QueueImplementationUsingArray {
		static int front=0;
		static int rear=4;
	public static void main(String[] args) {
		
		int queue[]=new int[10];
	
		sizeOfQueue(front,rear);
		isQueueEmpty(rear,front);
		enQueue(queue,30,rear,10);//Queue, element to insert, rear, size of queue
		enQueue(queue,33,rear,10);//Queue, element to insert, rear, size of queue
		enQueue(queue,10,rear,10);//Queue, element to insert, rear, size of queue
		deQueue(queue,front,rear);
		sizeOfQueue(front,rear);
		
	}

	private static void isQueueEmpty(int rear, int front) {
		if(rear==front){
				System.out.println("isEmpty : "+ (rear==front));
			}else{
				System.out.println("isEmpty: " + (rear==front));
			}
		
	}

	private static void sizeOfQueue(int front, int rear) {
		System.out.println("Size of Queue: " + (rear-front));
	
	}

	private static void deQueue(int[] queue, int front, int rear) {
		if(front==rear){
			System.out.println("");
		}else{
			System.out.println("Element Deleted : "+ queue[front]);
			queue[front]=0;
			front++;
		}
		
	}

	

	private static void enQueue(int[] queue, int element, int rear, int length) {
	
		if(rear==length){
			System.out.println("Overflow : ");
		}else{
			queue[rear]=element;
			System.out.println("Element entered : " + queue[rear]);
			rear=rear+1;
			
		}
	}
	
}

	
