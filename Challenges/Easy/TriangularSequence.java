public class TriangularSequence {

    static int evaluateSequence(int n) {
        return (n*(n+1))/2;
    }

    public static void main(String[] args) {
        int answer = evaluateSequence(5);
        System.out.println(answer);
    }   
}
