import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LetterBoxPaintSquad {

    public static void paintLetterBoxes(final int start, final int end) {

        List<Character> list = new ArrayList<Character>();
        List<Number> results = new ArrayList<Number>();

        // get range between start and end
        for (int i=start; i < end+1; i++ ) {
            String stringifiedNumber = String.valueOf(i);
            for (int a=0; a < stringifiedNumber.length(); a++) {
                list.add(stringifiedNumber.charAt(a));
            }
        }

        Collections.sort(list);

        for(int i=0; i<10; i++) {

            switch(i) {
                case "1": 
            }

        }

        
        
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
 



        // calculate each frequency

        // return in order
    }

    public static void main(String[] args) {
        paintLetterBoxes(125, 150);
    }
}
