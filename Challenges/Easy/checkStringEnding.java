public class checkStringEnding {
    
    static boolean checkEnding(String original, String ending) {
        return original.endsWith(ending);
    }
    
    public static void main(String[] args) {
        boolean checked = checkEnding("test", "wdf");
        System.out.println(checked);
    }
}
