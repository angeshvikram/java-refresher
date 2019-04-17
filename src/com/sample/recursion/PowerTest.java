package com.sample.recursion;

public class PowerTest {

	public static int pow(int base, int exp) {
		if(exp == 0) {
			return 1;
		} else {
			return base * pow(base, exp-1);
		}
	}
	
	public static void main(String[] args) {
		int base = 2;
		int exp = 2;
		
		int power = pow(base, exp);
		
		System.out.println(base + "^" + exp + " = " + power);
	}
}
