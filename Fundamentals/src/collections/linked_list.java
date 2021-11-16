package collections;

import java.util.*;

public class linked_list {
    public static void main(String[] args) {
     
        LinkedList<Integer> ll = new LinkedList<Integer>();

        for (int i=1; i <=5; i++) {
            ll.add(i);
        }
        System.out.println(ll);
    }
}
