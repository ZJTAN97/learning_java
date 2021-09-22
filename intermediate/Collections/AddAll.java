import java.util.*;

public class AddAll {
    public static void main(String[] args) {
        
        // convert array to list
        String[] arr = {"apples", "beef", "corn", "ham"};
        List<String> newList = Arrays.asList(arr);

        ArrayList<String> newList2 = new ArrayList<String>();
        newList2.add("grandchase");
        newList2.add("maplestory");
        newList2.add("docker");


        newList2.addAll(newList);
        System.out.println(newList2);



    }
}
