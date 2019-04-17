package com.sample.recursion;

public class RecursionTest {
	
	private static boolean debugEnabled = false;
	
	public static void fun1(int n) {
		int i = 0;
		if (n > 1)
			fun1(n - 1);
		for (i = 0; i < n; i++)
			System.out.println(" * ");
	}

	public static int fun(int n) {
		if (n == 4) {
			debugln("4");
			return n;
		}
		else {
			String call = "2 * fun(" + n + " + 1) = ";
			int result = 2 * fun(n + 1);
			debugln(call + result);
			return result;
		}
	}

	public static void main(String[] args) {
		debugEnabled = true;
		// fun1(1);
		System.out.println(fun(2));
	}
	
	
	private static void debug(String str) {
		if(debugEnabled) {
			System.out.print(str);
		}
	}
	
	private static void debugln(String str) {
		if(debugEnabled) {
			System.out.println(str);
		}
	}

}
