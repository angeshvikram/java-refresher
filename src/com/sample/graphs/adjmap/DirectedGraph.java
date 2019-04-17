package com.sample.graphs.adjmap;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DirectedGraph {
	Map<Integer, List<Integer>> adjMap;

	public DirectedGraph() {
		adjMap = new HashMap<>();
	}

	public void addEdge(Integer source, Integer destination) {
		if (adjMap.get(source) == null) {
			adjMap.put(source, new ArrayList<Integer>());
		}
		adjMap.get(source).add(destination);
	}

	private void fillGraph() {
		// 0 : 1, 2
		// 1 : 2, 3, 4
		// 2: 3
		// 3 : 1

		addEdge(0, 1);
		addEdge(0, 2);
		addEdge(0, 6);

		addEdge(1, 2);
		addEdge(1, 3);
		addEdge(1, 4);

		addEdge(2, 3);

		addEdge(3, 1);

		System.out.println("Filled Graph: " + adjMap);
	}

	// prints BFS traversal from a given source s
	void printBFS(Integer source) {
		// Mark all the vertices as not visited(By default
		// set as false)
		boolean visited[] = new boolean[100];

		// Create a queue for BFS
		Deque<Integer> queue = new LinkedList<Integer>();

		// Mark the current node as visited and enqueue it
		visited[source] = true;
		queue.add(source);

		while (queue.size() != 0) {
			// Dequeue a vertex from queue and print it
			source = queue.poll();
			System.out.print(source + " ");

			// Get all adjacent vertices of the dequeued vertex s
			// If a adjacent has not been visited, then mark it
			// visited and enqueue it
			if (adjMap.get(source) != null) {
				Iterator<Integer> i = adjMap.get(source).listIterator();
				while (i.hasNext()) {
					int n = i.next();
					// System.out.println("n: " + n);
					if (!visited[n]) {
						visited[n] = true;
						queue.add(n);
					}
				}
			}
		}
	}
	
	void printDFS(Integer source) {
		
	}

	public static void main(String[] args) {
		DirectedGraph dg = new DirectedGraph();
		dg.fillGraph();
		dg.printBFS(0);
	}
}
