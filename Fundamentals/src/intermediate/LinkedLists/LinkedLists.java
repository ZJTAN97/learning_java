import java.util.*;
import java.util.LinkedList;

public class LinkedListTutorial {
    public static void main(String[] args) {

        String[] myThings = {"apples", "docker", "kubernetes", "phone", "computer"};
        List<String> list1 = new LinkedList<String>();

        for(String i : myThings) {
            list1.add(i);
        }


        String[] myOtherThings = {"sausage", "hotdog", "bacon", "egg", "fries"};
        List<String> list2 = new LinkedList<String>();
        
        for(String i : myOtherThings) {
            list2.add(i);
        }


        list1.addAll(list2); // concatenate list 1 and list 2.
        list2 = null; // null to free up memory.

        printItems(list1);
        removeItem(list1, 2, 5);
        printItems(list1);
        reverseList(list1);
    }
    
    // printMe Method
    public static void printItems(List<String> list) {
        for(String i : list) {
            System.out.println(i);
        }
        System.out.println();
    }


    // removeItem
    public static void removeItem(List<String> list, int from, int to) {
        list.subList(from, to).clear();
    }


    // reverseList
    public static void reverseList(List<String> list) {
        ListIterator<String> reverse = list.listIterator(list.size());
        while(reverse.hasPrevious()) {
            System.out.printf("%s ", reverse.previous());
        }
    }




}
