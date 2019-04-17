package com.sample.integers;

import java.util.HashMap;
import java.util.Map;

public class DecimalToRomanProblem {
	
	private static Map<Integer, String> romanMap = new HashMap<>();

	public static void decimalToRoman(int num) {
		System.out.println("num: " + num);
		while(num > 0) {
			int remainder = num % 10;
			System.out.println(remainder);
			num = num/10;
		}
	}
	
	public static void main(String[] args) {
		decimalToRoman(321);

	}

}
