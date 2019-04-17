package com.sample.arrays;

import java.util.Arrays;

public class PlantProblem {
	
	public static boolean canPlant(boolean[] bed, int num) {
		int current = 0;
		int lastPlanted = -2;
		
		while(current < bed.length) {
			System.out.println("current: " + current + ", last: " + lastPlanted + ", bed: " + Arrays.toString(bed));
			if(bed[current] == false) {
				if(lastPlanted != current -1) {
					System.out.println("Enter current: " + current + ", last: " + lastPlanted);
					if(current == bed.length -1
							|| (bed[current+1] == false)) {
						bed[current] = true;
						num--;
					}
				}
			}
			if(bed[current] == true) {
				lastPlanted = current;
			}
			
			current++;
		}
		System.out.println("Planted: " + Arrays.toString(bed));
		return num == 0;
	}
	
	public static boolean canPlant_1(int[] bed, int num) {
		int current = 0;
		int lastPlanted = -2;
		
		while(current < bed.length) {
			System.out.println("current: " + current + ", last: " + lastPlanted + ", bed: " + Arrays.toString(bed));
			if(bed[current] == 0) {
				if(lastPlanted != current -1) {
					System.out.println("Enter current: " + current + ", last: " + lastPlanted);
					if(current == bed.length -1
							|| (bed[current+1] == 0)) {
						bed[current] = 1;
						num--;
					}
				}
			}
			if(bed[current] == 1) {
				lastPlanted = current;
			}
			
			current++;
		}
		System.out.println("num: " + num + ", Planted: " + Arrays.toString(bed));
		return num <= 0;
	}
	
	public static boolean canPlant(int[] bed, int num) {
		boolean result = false;
		
		
		
		return result;
	}
	
	public static void main(String[] args) {
		boolean[] bed_1 = new boolean[] { true, false, false, false, false };
		boolean[] bed_2 = new boolean[] { true, false, false, true, false };
		boolean[] bed_3 = new boolean[] { false, false, false};
		boolean[] bed_4 = new boolean[] { false, false};
		boolean[] bed_5 = new boolean[] { false, true};
		boolean[] bed_6 = new boolean[] { true, false};
		boolean[] bedBool = bed_6;
		
		int[] bed_7 = new int[] { 0, 0, 0 };
		int[] bed_8 = new int[] { 1, 0, 0 };
		int[] bed_9 = new int[] { 1, 0, 0, 0, 0, 1 };
		int[] bed = bed_9;
		int num = 1;
		
		System.out.println("bed: " + Arrays.toString(bed));
		System.out.println("num: " + num);
		System.out.println("canPlant: " + canPlant(bed, num));
	}
}
