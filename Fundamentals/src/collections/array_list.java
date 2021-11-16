package collections;

import java.util.*;


public class array_list {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i=1; i<=5; i++) {
            arrayList.add(i);
        }

        System.out.println(arrayList);

        // removing at index 4
        arrayList.remove(4);

        System.out.println(arrayList);
        
    }
}
