import java.util.*;
import java.util.LinkedList;

public class LinkedListTutorial {
    public static void main(String[] args) {

        String[] things = {"apples", "noobs", "pwnge", "bacon", "goats"};
        List<String> list1 = new LinkedList<String>();
        for(String x: things)
            list1.add(x);
        
        String[] things2 = {"sausage", "bacon", "goats", "harrypotter"};
        List<String> list2 = new LinkedList<String>();
        for(String y: things2)
            list2.add(y);

        list1.addAll(list2); // takes everything from list 2 to list 1
        list2 = null; // free up memory

        printMe(list1);
        removeStuff(list1, 2, 5);
        printMe(list1);
        reverseMe(list1);

    } 

    // printMe method
    private static void printMe(List<String> l) {
        for(String b: l)
            System.out.printf("%s ", b);
        System.out.println(); // go next line
    }

    // removeStuff method
    private static void removeStuff(List<String> l, int from, int to) {
        l.subList(from, to).clear();
    }

    // reverseMe
    private static void reverseMe(List<String> l) {
        ListIterator<String> iterator = l.listIterator(l.size());
        while(iterator.hasPrevious())
            System.out.printf("%s ", iterator.previous());
    }
}
