public class CorrectCharRecognition {

    public static String correct(String string) {
        return string.replaceAll("5", "S").replaceAll("0", "O").replaceAll("1", "I");
    }

    public static void main(String[] args) {
        String corrected = correct("051");
        System.out.println(corrected);
    }
}
