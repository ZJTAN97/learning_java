import java.util.*;

public class Frequency {
    public static void main(String[] args) {

        String[] arr = {"Grandchase", "Grandchase", "Maplestory", "Maplestory"};
        List<String> newList = Arrays.asList(arr);

        System.out.println(Collections.frequency(newList, "Grandchase"));

        boolean myBool = Collections.disjoint(newList, newList);
        System.out.println(myBool);

        if(myBool)
            System.out.println("These lists have nothing in common");
        else 
            System.out.println("These lists have something in common");
   
    }
}
