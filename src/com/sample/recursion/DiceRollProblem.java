package com.sample.recursion;

import java.util.ArrayList;
import java.util.List;

public class DiceRollProblem {

	public static void diceRolls(int dice) {
		System.out.println("------ start printing dice: " + dice);
		List<Integer> diceNumList = new ArrayList<>();
		diceRollHelper(dice, diceNumList, "");
		System.out.println("------ end printing dice: " + dice + "\n");
	}
	
//	private static void diceRollHelper(int dice, List<Integer> diceNumList) {
//		if(dice == 0) {
//			//base case
//			System.out.println(diceNumList);
//		} else {
//			for(int i = 1; i <= 6; i++) {
//				diceNumList.add(i);
//				diceRollHelper(dice - 1, diceNumList);
//				diceNumList.remove(diceNumList.size()-1); // last element
//			}
//		}
//	}
	
	private static void diceRollHelper(int dice, List<Integer> diceNumList, String indent) {
		if(dice == 0) {
			//base case
			System.out.println(indent + diceNumList);
		} else {
			for(int i = 1; i <= 6; i++) {
				diceNumList.add(i);
				diceRollHelper(dice - 1, diceNumList, indent + "  ");
				diceNumList.remove(diceNumList.size()-1); // last element
			}
		}
	}

	public static void main(String[] args) {
		diceRolls(3);
	}

}
