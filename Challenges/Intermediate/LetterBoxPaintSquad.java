import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

//https://www.codewars.com/kata/597d75744f4190857a00008d/train/java
// 7kyu Letterbox Paint-Squad

public class LetterBoxPaintSquad {

    public static int[] paintLetterBoxes(final int start, final int end) {

        int[] frequencies = new int[10];
        for (int i=start; i<= end; i++) {
            int num = i;
            while(num > 0) {
                frequencies[num%10]++;
                num /= 10;
                System.out.println(num);
            }
        }

        // for(int i=0; i<frequencies.length; i++) {
        //     System.out.println(frequencies[i]);
        // }

        return frequencies;
    }

    public static void main(String[] args) {
        paintLetterBoxes(125, 150);
    }
}
