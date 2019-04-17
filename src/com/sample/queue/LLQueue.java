package com.sample.queue;

public class LLQueue {

	LLQueueNode top;
	LLQueueNode bottom;
	
	private boolean isEmpty() {
		return top == null;
	}
	
	public void enqueue(int value) {
		LLQueueNode node = new LLQueueNode(value);
		if(isEmpty()) {
			top = node;
			bottom = node;
		} else {
			LLQueueNode temp = bottom;
			temp.next = node;
			bottom = node;
		}
		System.out.println("enqueue "+ value + ", top: " + top + ", bottom: " + bottom);
	}
	
	public int dequeue() {
		if(!isEmpty()) {
			int value = top.value;
			if(top == bottom) {
				top = null;
				bottom = null;
			} else {
				top = top.next;
			}
			System.out.println("dequeue "+ value + ", top: " + top + ", bottom: " + bottom);
			return value;
		} else {
			System.out.println("dequeue EMPTY QUEUE, top: " + top + ", bottom: " + bottom);
			return Integer.MIN_VALUE;
		}
	}
	
	private void traverseQueue() {
		LLQueueNode node = top;
		System.out.println("Traversing from " + node);
		while(node != null) {
			System.out.println(node);
			node = node.next;
		}
	}
	
	public static void main(String[] args) {
		LLQueue lq = new LLQueue();
		lq.enqueue(1);
		lq.enqueue(2);
		lq.enqueue(3);
		lq.enqueue(4);
	
		lq.traverseQueue();
		
		lq.dequeue();
		
		lq.traverseQueue();
		
		lq.dequeue();
		lq.dequeue();
		lq.dequeue();
		lq.dequeue();
		lq.dequeue();
		lq.dequeue();
		
		lq.traverseQueue();
		
	}

}

class LLQueueNode {
	int value;
	LLQueueNode next;
	
	LLQueueNode(int value) {
		this.value = value;
		next = null;
	}

	@Override
	public String toString() {
		return value + "";
	}
	
	
}
