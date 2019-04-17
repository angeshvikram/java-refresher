package com.sample.trees.binarytree;

public class BinarySearchTreeTest {
	
	public static void fillBinarySearchTree(BinarySearchTree bst, int[] values) {
		for(int value : values) {
			bst.insert(value);
		}

		BinaryTreeNode root = bst.getRoot();
		System.out.println("DONE: BST root: " + root.getValue());
	}
	
	public static void fillBalancedBinarySearchTree(BinarySearchTree bst, int[] values) {
		
	}
	
	public static void main(String[] args) {
		int[] bstInput1 = new int[] { 7, 6, 5, 4, 3, 2, 1 };
		int[] bstInput2 = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		
		int[] bstInput3 = new int[] { 2, 1, 3 };
		
		int[] bstInput4 = new int[] { 20, 10, 30, 15 };
		
		BinarySearchTree bst1 = new BinarySearchTree();
		
		fillBinarySearchTree(bst1, bstInput4);
		
		bst1.preorderTraversal();
		bst1.inorderTraversal();
		bst1.postorderTraversal();
		bst1.levelorderTraversal();
	}

}
