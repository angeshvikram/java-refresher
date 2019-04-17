package com.sample.trie.map;

import java.util.Hashtable;

class TrieNode {
	Character c;
	boolean isLast;
	Hashtable<Character, TrieNode> children;
	
	public TrieNode() {
		children = new Hashtable<>();
		isLast = false;
	}
	
	public TrieNode(Character c) {
		this();
		this.c = c;
	}

	public Hashtable<Character, TrieNode> getChildren() {
		return children;
	}
	
}
