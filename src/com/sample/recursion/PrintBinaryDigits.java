package com.sample.recursion;

public class PrintBinaryDigits {

	public static void printBinaryDigits(int count) {
		printBinaryDigits(count, "");
	}
	
	public static void printBinaryDigits(int count, String prefix) {
		if(count == 1) {
			System.out.println(prefix + "0");
			System.out.println(prefix + "1");
		} else {
			printBinaryDigits(count - 1, prefix+"0");
			printBinaryDigits(count - 1, prefix+"1");
		}
	}
	
	public static void main(String[] args) {
		printBinaryDigits(4);
	}

}
