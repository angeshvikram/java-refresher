package com.sample.stacks;

public class LLStack {
	LLStackNode top;
	LLStackNode bottom;
	
	public LLStack() {
		top = null;
		bottom = null;
	}
	
	private boolean isEmpty() {
		return top == null;
	}
	
	public void push(int value) {
		LLStackNode node = new LLStackNode(value);
		if(isEmpty()) {
			top = node;
			bottom = node;
		} else {
			LLStackNode temp = top;
			node.next = temp;
			top = node;
		}
		System.out.println("push "+ value + ", top: " + top + ", bottom: " + bottom);
	}
	
	public int pop() {
		if(!isEmpty()) {
			int value = top.value;
			if(top == bottom) {
				top = null;
				bottom = null;
			} else {
				top = top.next;
			}
			System.out.println("pop "+ value + ", top: " + top + ", bottom: " + bottom);
			return value;
		} else {
			System.out.println("dequeue EMPTY STACK, top: " + top + ", bottom: " + bottom);
			return Integer.MIN_VALUE;
		}
	}
	
	private void traverseStack() {
		LLStackNode node = top;
		System.out.println("Traversing from " + node);
		while(node != null) {
			System.out.println(node);
			node = node.next;
		}
	}
	
	public static void main(String[] args) {
		LLStack ls = new LLStack();
		ls.push(1);
		ls.push(2);
		ls.push(3);
		
		ls.traverseStack();
		
		ls.pop();
		ls.pop();
		ls.pop();
		ls.pop();
		ls.pop();
	}

}

class LLStackNode {
	int value;
	LLStackNode previous;
	LLStackNode next;
	
	LLStackNode(int value) {
		this.value = value;
		previous = null;
		next = null;
	}
	
	@Override
	public String toString() {
		return value + "";
	}
}