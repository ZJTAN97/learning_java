import java.util.ArrayList;

// https://www.codewars.com/kata/5650ab06d11d675371000003
// https://www.codewars.com/kata/5650ab06d11d675371000003/train/java

public class Main {

    public static String returnSplit(String sentence) {
        ArrayList<String> parts = new ArrayList<>();
        int len = sentence.length();

        for(int i=0; i<len; i+=3) {
            parts.add(sentence.substring(i, Math.min(len, i+3)));
        }

        StringBuilder sb = new StringBuilder();
        for(String s : parts) {
            sb.append(s);
            sb.append(' ');
        }

        return sb.toString();

    }

    public static void main(String[] args) {
        String answer = returnSplit("Testest");
        System.out.println(answer);
    }
}
