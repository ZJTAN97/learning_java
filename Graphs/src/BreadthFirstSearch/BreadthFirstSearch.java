package BreadthFirstSearch;

import GraphRepresentation.*;
import java.io.*;
import java.util.*;

public class BreadthFirstSearch {

    static void BFS(int source, int nodes) {

        boolean visited[] = new boolean[nodes];

        // create queue for BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();

        // Mark the current node as visited and enqueue it
        visited[source] = true;
        queue.add(source);

        while (queue.size() != 0) {
            // Dequeue a vertex from queue
            source = queue.poll();
            System.out.print(source + " ");

        }

    }

    public static void main(String[] args) {

        // Creating graph with 5 vertices (nodes)
        int nodes = 5;
        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<ArrayList<Integer>>(nodes);

        for (int i=0; i < nodes; i++) {
            adjacencyList.add(new ArrayList<Integer>());
        }

        Graph graph = new Graph();

        graph.addEdge(adjacencyList, 0, 1);
        graph.addEdge(adjacencyList, 0, 2);
        graph.addEdge(adjacencyList, 1, 2);
        System.out.println(adjacencyList);
        
    }
}



