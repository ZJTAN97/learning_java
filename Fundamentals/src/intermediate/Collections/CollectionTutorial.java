import java.util.*;

public class CollectionTutorial {
    /*
        Collections tutorial covers List, Iterator
    */
    public static void main(String[] args) {

        String[] things = {"eggs", "lasers", "hats", "docker"};
        List<String> list = new ArrayList<String>();

        // add array items to list
        for(String x: things)
            list.add(x);
        
        String[] moreThings = {"docker", "eggs"};
        List<String> list2 = new ArrayList<String>();

        // add array items to list
        for(String y: moreThings)
            list2.add(y);

        for(int i=0; i<list.size(); i++) {
            System.out.printf("%s ", list.get(i));
        }

        editList(list, list2);
        System.out.println();

        // after removing all the items that belong to list2
        for(int i=0; i<list.size(); i++) {
            System.out.printf("%s ", list.get(i));
        }

    }
    
    public static void editList(Collection<String> l1, Collection<String> l2) {
        Iterator<String> it = l1.iterator();

        // loop through until the end of the list
        while(it.hasNext()) {
            // if list2 has the item from list1, remove
            if(l2.contains(it.next()))
                it.remove();
        }
    }
}



