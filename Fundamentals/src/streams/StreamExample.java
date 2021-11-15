import java.util.*;
import java.util.stream.*;

public class StreamExample {
    public static void main(String[] args) {

        // demo map method
        List<Integer> number = Arrays.asList(2, 3, 4, 5);
        List<Integer> squared = number.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println(squared);


        // demo of filter method
        List<String> names = Arrays.asList("Reflection", "Collection", "Stream");
        List<String> filteredNames = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
        System.out.println(filteredNames);


        // demo of sorted method
        List<String> show = names.stream().sorted().collect(Collectors.toList());
        System.out.println(show);


        // demo forEarch method
        number.stream().map(x -> x*x).forEach(y -> System.out.println(y));
    

        // demo of reduce method
        System.out.println("-- reduce method --");
        int even = number.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);
        System.out.println(even);

        
    }
}
