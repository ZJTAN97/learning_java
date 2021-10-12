public class StringMethods {
    
    public static void main(String args[]) {

        String[] words = {"Test1", "Test2", "Test3"};

        //startWith
        for(String w : words) {
            if(w.startsWith("Test"))
                System.out.println(w + "starts with Test");
        }

        //endsWith
        for(String w : words) {
            if(w.endsWith("t1"))
                System.out.println(w + "ends with t1");
        }
    }
}
