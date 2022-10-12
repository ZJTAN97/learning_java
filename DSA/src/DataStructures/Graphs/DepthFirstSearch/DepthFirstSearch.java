package DataStructures.Graphs.DepthFirstSearch;

import DataStructures.Graphs.GraphRepresentation.Graph;
import java.util.*;

public class DepthFirstSearch {

    public void StackMethod(ArrayList<ArrayList<Integer>> graph, int source) {
        
        boolean visited[] = new boolean[graph.size()];

        Stack<Integer> stack = new Stack<Integer>();
        visited[source] = true;
        stack.add(source);

        while(stack.size() > 0) {
            int current = stack.pop();
            System.out.println(current);
            for (int i=0; i < graph.get(current).size(); i++) {
                if(!visited[i]) {
                    visited[i] = true;
                    stack.push(i);
                }
            }
        }
    }


    public void RecursionMethod(ArrayList<ArrayList<Integer>> graph, int source) {
        // needs implementation
    }


    public static void main(String[] args) {
        
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
        
        DepthFirstSearch dfs = new DepthFirstSearch();
        dfs.StackMethod(adjacencyList, 2);        
    }
}
