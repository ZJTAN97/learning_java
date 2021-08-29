import java.util.*;

public class ConvertingListsToArrays {
    public static void main(String[] args) {

        String[] stuff = {"babies", "watermelon", "melons", "fudge"};

        // created a list containing the 'stuff' array
        LinkedList<String> theList = new LinkedList<String>(Arrays.asList(stuff));

        // now list methods are possible
        theList.add("nugget");
        theList.addFirst("cheese fries");

        // convert back to array
        stuff = theList.toArray(new String[theList.size()]);

        for(String x : stuff)
            System.out.printf("%s ", x);

    }
}
