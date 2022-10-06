package DataStructures.Graphs.GraphRepresentation;
import java.util.*;

public class Graph {

    // utility function to add edge in graph
    public void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    // utility function to print adjacency list
    // representation of graph
    public void printGraph(ArrayList<ArrayList<Integer>> adj) {
        for(int i=0; i < adj.size(); i++) {
            System.out.println("\nAdjacency list of vertex" + i);
            System.out.print("head");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(" -> "+adj.get(i).get(j));
            }
            System.out.println();
        }
    }


}