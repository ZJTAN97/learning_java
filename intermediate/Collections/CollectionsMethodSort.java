import java.util.*;

public class CollectionsMethodSort {
    public static void main(String[] args) {
     
        String[] items = {"apple", "lemons", "banana", "watermelon", "peach"};
        List<String> myList = Arrays.asList(items);

        Collections.sort(myList);
        System.out.printf("%s\n", myList);

        Collections.sort(myList, Collections.reverseOrder());
        System.out.printf("%s\n", myList);

    }
}
