package com.sample.linkedlists;

import java.util.LinkedList;

public class ReverseLinkedListProblem {

	private static LinkedList createLinkedList(int[] nums) {
		LinkedList<Integer> numList = new LinkedList<>();
		for(int num : nums) {
			numList.add(num);
		}
		return numList;
	}
	
	public static void main(String[] args) {
		LinkedList<Integer> numList = createLinkedList(new int[]{ 1, 2, 3, 4, 5 });
		
		System.out.println("numList: " + numList);
	}

}
