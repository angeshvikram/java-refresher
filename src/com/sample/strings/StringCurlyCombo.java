package com.sample.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StringCurlyCombo {

	public static void printCurlyCombo(String input) {
		char[] inputArray = input.toCharArray();
		List<Object> list = new ArrayList<>();
		StringBuilder buff = new StringBuilder();
		
		for(char ch : inputArray) {
			if(ch == '{') {
				List<Object> nested = new ArrayList<>();
			} else if(ch == '}') {
				
			} else if(ch == ',' || ch == ' ') {
				//do nothing
			} else {
				buff.append(ch);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
