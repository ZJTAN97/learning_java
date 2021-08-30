public class javaIfElse {
    public static void main(String[] args) {
        
        String text = "I wonder how long it is";

        if(text.length() >= 10) {
            System.out.println("Text length greater than 10.");
        } else {
            System.out.println("Text length lesser than 10.");
        }

        // Ternarny operator
        String result = text.length() >= 10 ? "Text length greater than 10" : "Text length lesser than 10";
        System.out.println("The new " + result);

    }
}
