package com.sample.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DecodeString_V_Problem {

	/********************* Solution Steps **************************/
	/*
	 * 0. Take one stack : result stack
	 * 1. If char, append to result string
	 * 2. If comma, add result string to result list and reset result string
	 * 3. If opening bracket [, push result list to result stack and make result string empty.
	 * 4. If closing bracket ], pop list from result stack, name it as popped list.
	 * 4.1 Append each result list item after each item of popped list
	 * 5, Pop from result stack, prepend it with in result string (use popped string as prefix with result string).
	 */
	public static List<String> decodeVString(String str) {
		if(str == null) {
			return null;
		}
		List<String> resultList = new ArrayList<>();
		if(str != null && str.length() > 0) {
			List<String> stackedList = new ArrayList<>();
			Stack<List<String>> resultStack = new Stack<>();
			resultList.add("");
			
			char[] strChars = str.toCharArray();
			for(char ch : strChars) {
				System.out.println("+++++++++++++ character: " + ch);
				System.out.println("start stack: " + resultStack);
				System.out.println("start resultList: " + resultList);
				
				if(Character.isLetter(ch)) {
//					if(resultStack.isEmpty()) {
						for(int resultListIdx = 0; resultListIdx < resultList.size(); resultListIdx++) {
							String combo = resultList.get(resultListIdx) + ch;
							resultList.set(resultListIdx, combo);
						}
//					} else {
//						stackedList.add(""+ch);
//					}
				} else if(ch == ',') {
//					resultList.add(resultString.toString());
//					resultString.setLength(0); //reset
					resultList.add("");
				} else if(ch == '{') {
					resultStack.push(resultList);
					resultList = new ArrayList<>();
					resultList.add("");
				} else if(ch == '}') {
					List<String> poppedList = resultStack.pop();
					for(int popIdx = 0; popIdx < poppedList.size(); popIdx++) {
						for(int resultListIdx = 0; resultListIdx < resultList.size(); resultListIdx++) {
							String combo = poppedList.get(popIdx) + resultList.get(resultListIdx);
							resultList.set(resultListIdx, combo);
						}
					}
				}
				System.out.println("end stack: " + resultStack);
				System.out.println("end resultList: " + resultList);
				System.out.println("+++++++++++++ ");
			}
		}
		return resultList;
	}
	
	public static void main(String[] args) {
		String input_1 = "a{b,c}";
		
		String str = input_1;
		
		System.out.println("input: " + str);
		System.out.println("output: " + decodeVString(str));
	}

}
