package com.sample.hash;

import java.util.Arrays;

// WORKING hashmap , but we have to work for collision
public class MyStringHashMap {

	private StringEntry[] stringEntries = null;
	private int DEFAULT_CAPACITY = 10;
	
	public MyStringHashMap() {
		stringEntries = new StringEntry[DEFAULT_CAPACITY];
	}
	
	public void put(String key, String value) {
		int keyHash = getHash(key);
		int entryIndex = keyHash % stringEntries.length;
		StringEntry entry = new StringEntry(key, value);
		System.out.println("Put keyHash: " + keyHash + ", entryIndex: " + entryIndex + ", entry: " + entry);		
		stringEntries[entryIndex] = entry;
		System.out.println("Entries: " + Arrays.toString(stringEntries));
	}
	
	public String get(String key) {
		int keyHash = getHash(key);
		int entryIndex = keyHash % stringEntries.length;
		return stringEntries[entryIndex] != null ? stringEntries[entryIndex].value : null;
	}
	
	private int getHash(String key) {
		return key.hashCode();
	}
	
	public static void main(String[] args) {
		MyStringHashMap strMap = new MyStringHashMap();
		
		strMap.put("A", "a");
		strMap.put("B", "b");
		strMap.put("ACA", "aca");
		strMap.put("C", "C");
		
		System.out.println("get A: " + strMap.get("A"));
		System.out.println("get B: " + strMap.get("B"));
		System.out.println("get C: " + strMap.get("C"));
	}
}

class StringEntry {
	String key;
	String value;
	StringEntry next;
	
	StringEntry(String key, String value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public String toString() {
		return "[" + key + ":" + value + "]";
	}
	
	
}
