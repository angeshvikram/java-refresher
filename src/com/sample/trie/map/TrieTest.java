package com.sample.trie.map;

public class TrieTest {

	public static void main(String[] args) {
		Trie trie = new Trie();
		
		String data = "app";
		trie.insert(data);
		
		data = "apple";
		trie.insert(data);
		
		data = "orange";
		trie.insert(data);
		
		data = "or";
		trie.insert(data);
		
		System.out.println("---------------");
		String word = "banana";
		System.out.println("Finding " + word + " : " + trie.findWord(word) );
		
		word = "app";
		System.out.println("Finding " + word + " : " + trie.findWord(word) );
		
		word = "appl";
		System.out.println("Finding " + word + " : " + trie.findWord(word) );
		
		word = "apple";
		System.out.println("Finding " + word + " : " + trie.findWord(word) );
		
		word = "or";
		System.out.println("Finding " + word + " : " + trie.findWord(word) );
		
		word = "ora";
		System.out.println("Finding " + word + " : " + trie.findWord(word) );
		
		word = "orange";
		System.out.println("Finding " + word + " : " + trie.findWord(word) );
		
		System.out.println("---------------");
		
		String prefix = "ban";
		System.out.println("prefix " + prefix + " : " + trie.findPrefix(prefix) );
		
		prefix = "app";
		System.out.println("prefix " + prefix + " : " + trie.findPrefix(prefix) );
		
		prefix = "appl";
		System.out.println("prefix " + prefix + " : " + trie.findPrefix(prefix) );
		
		prefix = "apple";
		System.out.println("prefix " + prefix + " : " + trie.findPrefix(prefix) );
		
		prefix = "or";
		System.out.println("prefix " + prefix + " : " + trie.findPrefix(prefix) );
		
		prefix = "ora";
		System.out.println("prefix " + prefix + " : " + trie.findPrefix(prefix) );
		
		prefix = "orange";
		System.out.println("prefix " + prefix + " : " + trie.findPrefix(prefix) );
	}

}
