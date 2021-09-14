import java.util.*;

public class CasingStrings {
    public static void main(String[] args) {
        System.out.println(toJadenCase("testing this string to see if it works"));
    }

    public static String toJadenCase(String phrase) {

        List<String> upperCased = new ArrayList<String>();
        String[] phraseSplit = phrase.split(" ");
        for(String i : phraseSplit) {
            upperCased.add(i.substring(0,1).toUpperCase() + i.substring(1).toLowerCase());
        }

        return String.join(" ", upperCased);
    }
}
