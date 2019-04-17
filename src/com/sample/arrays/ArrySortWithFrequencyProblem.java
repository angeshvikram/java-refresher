package com.sample.arrays;

public class ArrySortWithFrequencyProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	private class ArraySortTree {
		TreeNode root = null;
		
		void insert(int value) {
			if(root == null) {
				TreeNode node = new TreeNode();
				node.value = value;
				node.count = 1;
			} else {
				insert(root, value);
			}
		}
		
		void insert(TreeNode node, int value) {
			if(node == null) {
				
			}
			if(node.value < value) {
				
			}
		}
		
		private class TreeNode {
			int left;
			int right;
			int value;
			int count;
			
			
		}
	}
}
