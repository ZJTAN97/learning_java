package BreadthFirstSearch;

import GraphRepresentation.*;
import java.util.*;

public class BreadthFirstSearch {

    static void BFS(ArrayList<ArrayList<Integer>> graph, int source) {

        boolean visited[] = new boolean[graph.size()];

        Queue<Integer> queue = new LinkedList<Integer>();
        visited[source]= true;
        queue.add(source);

        while(queue.size() != 0) {
            int current = queue.poll(); // dequeue from the list taking the first element
            System.out.println(current);

            for(int i=0; i < graph.get(current).size(); i++) {
                if(!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }

    public static void main(String[] args) {

        // Creating graph with 4 vertices (nodes)
        int nodes = 4;
        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<ArrayList<Integer>>(nodes);

        for (int i=0; i < nodes; i++) {
            adjacencyList.add(new ArrayList<Integer>());
        }

        Graph graph = new Graph();

        graph.addEdge(adjacencyList, 0, 1);
        graph.addEdge(adjacencyList, 0, 2);
        graph.addEdge(adjacencyList, 1, 2);
        graph.addEdge(adjacencyList, 2, 0);
        graph.addEdge(adjacencyList, 2, 3);
        graph.addEdge(adjacencyList, 3, 3);

        BFS(adjacencyList, 2);

        
    }
}



