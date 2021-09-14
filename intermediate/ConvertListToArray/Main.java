import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        String[] items = {"watermelon", "orange", "grapes", "lemon"};
        // convert array to list
        LinkedList<String> itemList = new LinkedList<String>(Arrays.asList(items));

        itemList.add("chocolate");
        itemList.addFirst("first item");
        itemList.addLast("last item");

        // convert back to array
        items = itemList.toArray(new String[itemList.size()]);

        for(String i : items) {
            System.out.println(i);
        }

    }
}
