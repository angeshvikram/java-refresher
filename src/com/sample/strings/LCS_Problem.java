package com.sample.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/*
 * Largest Common Substring
 */
public class LCS_Problem {
	
	public static String lcs(String str1, String str2) {
		ConcurrentHashMap<String, String> chm = new ConcurrentHashMap<>();
		StringBuilder result = new StringBuilder();
		List<String> resultList = new ArrayList<>();
		int i = 0;
		
		while(i < str1.length() && i < str2.length()) {
			System.out.println(str1.charAt(i) + " : " + str2.charAt(i));
			if(str1.charAt(i) == str2.charAt(i)) {
				result.append(str1.charAt(i));
			} else {
				resultList.add(result.toString());
				result = new StringBuilder();
			}
			i++;
		}
		
		System.out.println("resultList: " + resultList);
		return result.toString();
	}
	
	public static void main(String[] args) {
		String str1 = "SSAJJADRAZAQ";
		String str2 = "DAJJALRAZAQ";
		
		String cs = lcs(str1, str2);
		System.out.println("LCS: " + cs);
	}
	
	//KP's solution
	//get two smallest strings
	//create a set of common substrings between these two strings
	//from set create min heap
	//then compare others
}
