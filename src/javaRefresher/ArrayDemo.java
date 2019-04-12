package javaRefresher;

import java.util.*;
import java.util.Random;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = new int[10];
				
		Random r = new Random();
		
		System.out.println(r.nextInt());
		
		for(int index = 0;index < arr.length; index++ ) {
			arr[index] = r.nextInt();
		}
		
		for(int arrVal:arr) {
			System.out.println(arrVal);
		}
		
		System.out.println("Now soreted Number:");
		
		Arrays.sort(arr);

		
		for(int arrVal:arr) {
			System.out.println(arrVal);
		}

		
		String []strArr= {"First","second","third"};
		
		for(String tempStr:strArr) {
			System.out.println(tempStr);
		}
		
		
		int [] arrCpy = new int[10];
		
		System.arraycopy(arr, 0, arrCpy, 0, 5);
		
		for(int arrVal:arrCpy) {
			System.out.println(arrVal);
		}
		
	}

}
