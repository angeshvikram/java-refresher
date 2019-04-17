package javaRefresher;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class testDemo {

	/*
	   **/
	public static boolean isPalindrome(List<Character> _list) {

		Stack<Character> myStack = new Stack<Character>();

		for (int i = 0; i < _list.size() / 2; i++) {
			System.out.println(_list.get(i));
			myStack.push(_list.get(i));
		}

		for (int i = (_list.size() - 1); i > _list.size() / 2; i--) {
			System.out.println(_list.get(i));
			if (myStack.empty()) {
				return false;
			}
			Character charVal = myStack.pop();
			if (_list.get(i) != charVal) {
				return false;
			}

		}
		if (myStack.empty() || (myStack.size() == 1)) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("Hello, World!");
		strings.add("Welcome to CoderPad.");
		strings.add("This pad is running Java " + Runtime.version().feature());

		for (String string : strings) {
			System.out.println(string);
		}

		List<Character> myList = new ArrayList<Character>();

		myList.add('a');
		myList.add('b');
		myList.add('a');

		System.out.println(isPalindrome(myList));
	}

}
