package com.queue;

class MyQueue{
	int front,rear;
	int size;
	int[] arr;
	
	public MyQueue() 
	{
		
	}
	MyQueue(int size)
	{
	  front=0;
	  rear=0;
	  this.size=size;
	  arr=new int[this.size];
	}
	public void insert(int data) 
	{
		if(rear<size) 
		{
			arr[rear]=data;
			rear++;
			System.out.println("inserted");
			
		}
		else 
		{
			System.out.println("Overflow");
		}
	}
	public void delete() {
		int tmp;
		if(rear>front) 
		{
			System.out.println("Element deleted:" +arr[front]);
			for(tmp=front;tmp<rear-1;tmp++) 
			{
				arr[tmp]=arr[tmp+1];
			}
			arr[--rear]=0;
			
		}else {
			System.out.println("underflow");
		}
		
	}
	public void display() 
	{
		if(rear>front)
		{
			for(int i=front;i<rear;i++) 
			{
				System.out.println(arr[i]);
			}
			}else {
				System.out.println("Queue is empty");
		}
	}

	
}

public class QueueAsArray {

	public static void main(String[] args) {
		MyQueue q=new MyQueue(4);
		q.insert(12);
		q.insert(22);
		q.insert(32);
		q.display();
		
		q.insert(12);
		q.insert(22);
		q.insert(32);
		q.insert(56);
		q.display();
		
		q.delete();
		q.delete();
		q.delete();
		q.delete();
		q.display();

	}

}
