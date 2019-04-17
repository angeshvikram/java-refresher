package com.sample.queue;

public class ArrayIntegerQueue {

	int[] queue;
	int maxSize;
	int pointer;
	int size;
	
	public ArrayIntegerQueue() {
		maxSize = 5;
		queue = new int[maxSize];
		
		size = 0;
		pointer = 0;
	}
	
	public void enqueue() {
		
	}
	
	public int dequeue() {
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
