package com.sample.trie.map;

import java.util.Hashtable;

// WORKING
public class Trie {
	
	private static boolean DEBUG = false;
	
	TrieNode root;
	
	public Trie() {
		root = new TrieNode();
	}
	
	public void insert(String word) {
		System.out.println("inserting word: " + word);
		TrieNode current = root;
		
		char[] charArray = word.toCharArray();
		
		for(int i = 0; i < charArray.length; i++) {
			char c = charArray[i];
			Hashtable<Character, TrieNode> currentChildren = current.getChildren();
			
			if(currentChildren.get(c) == null) {
				debug("Creating node: " + c);
				TrieNode node = new TrieNode(c);
				currentChildren.put(c, node);
			}
			
			//switch node from current to next;
			current = currentChildren.get(c);
			
			//set end of word
			if(i == charArray.length-1) {
				debug("setting isLast: " + c);
				current.isLast = true;
			}
		}
	}
	
	public boolean findPrefix(String pattern) {
		return findNode(pattern) != null;
	}
	
	public boolean findWord(String word) {
		boolean result = false;
		TrieNode node = findNode(word);
		if(node != null && node.isLast) {
			result = true;
		}
		return result;
	}
	
	private TrieNode findNode(String pattern) {
		TrieNode result = null;
		char[] charArray = pattern.toCharArray();
		
		TrieNode current = root;
		for(int i = 0; i < charArray.length; i++) {
			char ch = charArray[i];
			TrieNode node = current.getChildren().get(ch);
			if(node != null) {
				current = node;
				
				if(i == charArray.length-1) {
					result = current;
				}
			} else {
				break;
			}
		}
		return result;
	}
	
	private void debug(String str) {
		if(DEBUG) {
			System.out.println(str);
		}
	}
}
