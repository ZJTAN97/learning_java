public class BasicCalculator {
    
    static int calculate(int num1, String op, int num2) {
        if(num2 == 0) {
            return 0;
        } else {
            switch(op) {
                case "+": return num1+num2;
                case "-": return num1-num2;
                case "*": return num1*num2;
                case "/": return num1/num2;
                default: return num1%num2;
            }
        }
    }
    
    public static void main(String[] args) {
        int answer = calculate(5, "*", 0);
        System.out.println(answer);
    }
}
