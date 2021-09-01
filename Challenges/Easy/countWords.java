public class countWords {
    static int countWords(String s) {
        String[] arr = s.split(" ");
        return arr.length;
    }
    public static void main(String[] args) {
        int numOfWords = countWords("This is a test statement.");
        System.out.println(numOfWords);
    }
}
