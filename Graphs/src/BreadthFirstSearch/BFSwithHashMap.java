package BreadthFirstSearch;

import java.util.*;

public class BFSwithHashMap {

    private static Map<String, List<String>> graph = new HashMap<>();

    private static void search(String name) {
        Queue<String> searchQueue = new ArrayDeque<>(graph.get(name));

        List<String> searched = new ArrayList<>();

        // as long as queue not empty
        while(!searchQueue.isEmpty()) {
            String person = searchQueue.poll();
            if(!searched.contains(person)) {
                if(person.endsWith("m")) {
                    System.out.println(person + " is a mango seller!");
                } else {
                    searchQueue.addAll(graph.get(person));
                    searched.add(person);
                }
            }
        }

    }

    public static void main(String[] args) {

        graph.put("you", Arrays.asList("alice", "bob", "claire"));
        graph.put("bob", Arrays.asList("anuj", "peggy"));
        graph.put("alice", Arrays.asList("peggy"));
        graph.put("claire", Arrays.asList("thom", "jonny"));
        graph.put("anuj", Collections.emptyList());
        graph.put("peggy", Collections.emptyList());
        graph.put("thom", Collections.emptyList());
        graph.put("jonny", Collections.emptyList());
        search("you");
    }

}
