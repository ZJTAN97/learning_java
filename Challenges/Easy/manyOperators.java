public class ManyOperators {

    public int evaluate(int a, int b, String o) {
		switch(o) {
			case "+": return a+b;
			case "-": return a-b;
			case "*": return a*b;
			case "/": return a/b;
			default:  return a%b;
		}
    }

    public static void main(String[] args) {
        
        ManyOperators main = new ManyOperators();
        int answer = main.evaluate(10, 3, "+");

        System.out.println(answer);
    }
}
