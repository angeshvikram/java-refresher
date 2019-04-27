package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class firstApr2019 {

	
	public static void test() {
		System.out.println("Test");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] twoDArray = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		
		ArrayList<String> arryList = new ArrayList<String>();
		LinkedList<String> cars = new LinkedList<String>();
		
		List<Integer> lList = new LinkedList<Integer>();
		List<Integer> aList = new ArrayList<Integer>();
		
		List<List<Integer>> grid = new ArrayList<>();
		
		Iterator a = grid.iterator();
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		Map<Integer, String> map1 = new LinkedHashMap<Integer, String>();
		Map<Integer, String> map2 = new TreeMap<Integer, String>();
		
		// LinkedHashSet - It maintains the order in which the elements are added
		Set<String> lHSet = new LinkedHashSet<String>();
		
		// TreeSet - IT maintains the natural sorting 1, 2, 3... alphabetical
		Set<String> tSet = new TreeSet<String>();
		// HashSet - Does not maintain order
		Set<String> set = new HashSet<String>();
		Set<String> aset = new HashSet<String>();
		Set<String> vset = new HashSet<String>();
		
		tSet.addAll(set);
		aset.addAll(set);
		
		List<String> nameBob = new ArrayList<>();

		Stack <Character> tempStack = new Stack<Character>();
		
		
		Queue<Integer> q = new LinkedList<Integer>();
		Stack <String> tStack = new Stack<String>();
			
		Math.random();
		
		String str = "abc";
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		
		System.out.println(q.size());
		q.poll();

		System.out.println(q.contains(2));
		
		System.out.println(q.contains(7));
		
		System.out.println(q.toString());
		
		
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		
		minHeap.add(10);
		minHeap.add(5);
		minHeap.add(6);
		minHeap.add(2);
		minHeap.add(1);
		minHeap.add(9);
		minHeap.add(8);
		
		
		System.out.println(minHeap.toString());
		
		
		
		test();
		
		
		
	}
	
	public void printTree2(int rows, int itemsInArray,Data3 [] theHeap) {

		// Number of spaces between items in tree

		int spaces = 0;

		int iteration = 1;

		// Generate all of the indents that are
		// needed depending on the number of rows
		// to print

		int[] indent = getIndentArray(rows);

		while (iteration <= rows) {

			// Find first Index : .5 * (-2 + 2^n)

			int indexToPrint = (int) (.5 * (-2 + (Math.pow(2, iteration))));

			// Number of Items per Row : 2^(n - 1)

			int itemsPerRow = (int) (Math.pow(2, iteration - 1));

			int maxIndexToPrint = indexToPrint + itemsPerRow;

			// Print the indents needed

			for (int j = 0; j < indent[iteration - 1]; j++)
				System.out.print(" ");

			// Print all of the index values for each row
			// indexToPrint represents the first index in the
			// row, while maxIndexToPrint equals the last

			for (int l = indexToPrint; l < maxIndexToPrint; l++) {

				// If the array isn't full don't try to print
				// indexes that don't exist

				if (l < itemsInArray) {

					System.out.print(String.format("%02d", theHeap[l].key));

					for (int k = 0; k < spaces; k++)
						System.out.print(" ");

				}

			}

			// In a tree the spaces get bigger in the
			// same way that indents get smaller

			spaces = indent[iteration - 1];

			iteration++;

			System.out.println();

		}

	}
	
	// Calculate each indent per row for the tree
		// then reverse their order to go from biggest
		// to smallest

		public int[] getIndentArray(int rows) {

			int[] indentArray = new int[rows];

			for (int i = 0; i < rows; i++) {

				indentArray[i] = (int) Math.abs((-2 + (Math.pow(2, i + 1))));

			}

			Arrays.sort(indentArray);

			indentArray = reverseArray(indentArray);

			return indentArray;

		}
		// Reverse the indent values in the array
		// so that they go from biggest to smallest

		public int[] reverseArray(int[] theArray) {

			// Index of the first element
			int leftIndex = 0;

			// Index of last element
			int rightIndex = theArray.length - 1;

			while (leftIndex < rightIndex) {
				// Exchange the left and right elements
				int temp = theArray[leftIndex];
				theArray[leftIndex] = theArray[rightIndex];
				theArray[rightIndex] = temp;

				// Move the indexes to check towards the middle
				leftIndex++;
				rightIndex--;
			}

			return theArray;
		}
		
		
		class Data3 {

			public int key;

			public Data3(int key) {

				this.key = key;

			}

			public String toString() {

				return Integer.toString(key);

			}

		}

}
