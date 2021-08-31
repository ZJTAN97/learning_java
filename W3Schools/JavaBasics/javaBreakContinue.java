public class javaBreakContinue {
    public static void main(String[] args) {
        // break example
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
              break;
            }
            System.out.println(i);
        }
        
        // continue example
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
              continue;
            }
            System.out.println(i);
        }
        
    }
}
