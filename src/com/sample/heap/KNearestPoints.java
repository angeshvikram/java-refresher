package com.sample.heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
// Working with doubts
public class KNearestPoints {

	static class Point {
		private int x;
		private int y;
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		@Override
		public String toString() {
			return "(" + x + "," + y + ")";
		}
	}
	
	private static class PointsComparator implements Comparator<Point> {

		@Override
		public int compare(Point p1, Point p2) {
			int distance1 = (int) Math.sqrt((p1.x * p1.x) + (p1.y * p1.y));
			int distance2 = (int) Math.sqrt((p2.x * p2.x) + (p2.y * p2.y));
			if(distance1 > distance2) {
				return 1;
			} else if(distance1 < distance2) {
				return -1;
			} else {
				return 0;
			}
		}
	}
	
	public static void main(String[] args) {
		List<Point> points = creatPoints();
		System.out.println("points: " + points);
		
		PriorityQueue<Point> pq = new PriorityQueue<>(points.size(), new PointsComparator());
		
		for(Point p : points) {
			pq.add(p);
		}
		
		System.out.println("PQ: " + pq);
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		
	}
	
	private static List<Point> creatPoints() {
		List<Point> points = new ArrayList<>();
		points.add(new Point(3, 2));
		points.add(new Point(1, 2));
		points.add(new Point(2, 3));
		points.add(new Point(1, 1));
		
		return points;
	}

}
