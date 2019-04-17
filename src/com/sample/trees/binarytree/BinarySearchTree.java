package com.sample.trees.binarytree;

public class BinarySearchTree {
	private final boolean DEBUG = true;
	
	BinaryTreeNode root = null;
	
	public BinaryTreeNode getRoot() {
		return root;
	}

	public void insert(int value) {
		root = insert(root, value);
	}

	private BinaryTreeNode insert(BinaryTreeNode root, int value) {
		//if root is null, start creating tree from root
		if(root == null) {
			root = new BinaryTreeNode(value);
			return root;
		}
		
		int parentValue = root.value;
		if(value < parentValue) {
			root.left = insert(root.left, value);
		} else {
			root.right = insert(root.right, value);
		}
		
		return root;
	}
	
	public void preorderTraversal() {
		System.out.println("------ printing preorder");
		preorderTraversal(this.root);
	}
	
	private void preorderTraversal(BinaryTreeNode node) {
		if(node != null) {
			System.out.println(node + ", left: " + node.left + ", right: " + node.right);
			preorderTraversal(node.left);
			preorderTraversal(node.right);
		}
	}
	
	public void inorderTraversal() {
		System.out.println("------ printing inorder");
		inorderTraversal(this.root);
	}
	
	private void inorderTraversal(BinaryTreeNode node) {
		if(node != null) {
			inorderTraversal(node.left);
			System.out.println(node + ", left: " + node.left + ", right: " + node.right);
			inorderTraversal(node.right);
		}
	}

	
	public void postorderTraversal() {
		System.out.println("------ printing postorder");
		postorderTraversal(this.root);
	}
	
	private void postorderTraversal(BinaryTreeNode node) {
		if(node != null) {
			postorderTraversal(node.left);
			postorderTraversal(node.right);
			System.out.println(node + ", left: " + node.left + ", right: " + node.right);
		}
	}
	
	public void levelorderTraversal() {
		System.out.println("------ printing postorder");
		levelorderTraversal(this.root);
	}

	private void levelorderTraversal(BinaryTreeNode node) {
		if(node != null) {
			boolean traverseLeft = false;
			boolean traverseRight = false;
			System.out.println(node);
			if(node.left != null) {
				System.out.println(node.left);
				traverseLeft = true;
			}
			if(node.right != null) {
				System.out.println(node.right);
				traverseRight = true;
			}
			
			if(traverseLeft) {
				levelorderTraversal(node.left);
			}
			
			if(traverseRight) {
				levelorderTraversal(node.right);
			}
		}
	}

	public void traversePreorder() {
		BinaryTreeNode node = root;
		while(node != null) {
			System.out.print(node.getValue());
			traversePreorder();
		}
	}
	
	private void debug(String str) {
		if(DEBUG) {
			System.out.println(str);
		}
	}
}
