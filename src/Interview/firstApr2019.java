package Interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
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
		
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		Map<Integer, String> map1 = new LinkedHashMap<Integer, String>();
		Map<Integer, String> map2 = new TreeMap<Integer, String>();
		
		// LinkedHashSet - It maintains the order in which the elements are added
		Set<String> lHSet = new LinkedHashSet<String>();
		
		// TreeSet - IT maintains the natural sorting 1, 2, 3... alphabetical
		Set<String> tSet = new TreeSet<String>();
		// HashSet - Does not maintain order
		Set<String> set = new HashSet<String>();
		
		
		Stack <Character> tempStack = new Stack<Character>();
		
		
		Queue<Integer> q = new LinkedList<Integer>();
			
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		System.out.println(q.size());
		q.poll();

		System.out.println(q.contains(2));
		
		System.out.println(q.contains(7));
		
		System.out.println(q.toString());
		
		test();
		
	}

}
