import java.util.Arrays;

import java.util.*;

public class ReverseAndCopy {
    public static void main(String[] args) {
        
        // create array and convert to list
        Character[] myArr = {'p', 'w', 'n'};
        List<Character> myList = Arrays.asList(myArr);

        System.out.println(myList);

        // reverse the list
        Collections.reverse(myList);
        System.out.println(myList);


        // Create new array and new list
        Character[] newArr = new Character[3];
        List<Character> newList = Arrays.asList(newArr);

        // copy contents of myList into newList
        Collections.copy(newList, myList);
        System.out.println(newList);


        // Fill 
        Collections.fill(newList, 'X');
        System.out.println(newList);

    }



}
