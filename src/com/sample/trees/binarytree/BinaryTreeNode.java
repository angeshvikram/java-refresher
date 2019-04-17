package com.sample.trees.binarytree;

public class BinaryTreeNode {
	protected int value;
	protected BinaryTreeNode left;
	protected BinaryTreeNode right;
	
	public BinaryTreeNode(int value) {
		super();
		this.value = value;
		left = null;
		right = null;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public BinaryTreeNode getLeft() {
		return left;
	}
	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}
	public BinaryTreeNode getRight() {
		return right;
	}
	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}
	
	@Override
	public String toString() {
		return ""+value;
	}
}
