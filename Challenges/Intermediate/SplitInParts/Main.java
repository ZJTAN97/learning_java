import java.util.ArrayList;

// https://www.codewars.com/kata/5650ab06d11d675371000003
// https://www.codewars.com/kata/5650ab06d11d675371000003/train/java

public class Main {

    public static String returnSplit(String s, int partLength) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = partLength++; i < sb.length(); i += partLength){
          sb.insert(i, " ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String answer = returnSplit("Test", 2);
        String solution = "Te st";
        System.out.println(answer == solution);
        System.out.println(answer);
        System.out.println(solution);
    }
}
