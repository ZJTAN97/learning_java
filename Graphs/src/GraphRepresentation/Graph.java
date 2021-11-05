package GraphRepresentation;

import java.util.*;

public class Graph {

    // utility function to add an edge in an undirected graph
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }


    // utility function to print adjacency list representation of graph
    static void printGraph(ArrayList<ArrayList<Integer>> adj) {
        for(int i=0; i < adj.size(); i++) {
            System.out.println("\nAdjecency list of vertex" + i);
            System.out.println("head");
            for (int j=0; j < adj.get(i).size(); j++) {
                System.out.println(" --> " + adj.get(i).get(j));
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        
        // Creating graph with 5 vertices
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);

        for(int i=0; i < V; i++) {
            adj.add(new ArrayList<Integer>());
        }


        // Adding edges one by one
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 4);

        printGraph(adj);

    }
}
