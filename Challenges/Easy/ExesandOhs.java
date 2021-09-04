public class ExesandOhs {
    public static boolean getXO(String str) {
        str = str.toLowerCase();
        return str.replace("o","").length() == str.replace("x","").length();
    }
    public static void main(String[] args) {
        boolean answer = getXO("xoxo");
        System.out.println(answer);
    }
}
