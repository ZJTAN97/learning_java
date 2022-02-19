package ObjectOrientedProgramming.a_Introduction;

public class Sum {
    public int sum(int x, int y) {
        return (x + y);
    }

    public int sum(int x, int y, int z) {
        return (x + y + z);
    }

    public double sum(double x, double y) {
        return (x + y);
    }
    public static void main(String[] args) {
        Sum add = new Sum();
        System.out.println(add.sum(2,3,4));
        
    }
}
