public class FindDiscount {

    static double evaluateAmount(double amount, int discount) {
        double finalAmount = ((100-discount)/100.00) * amount;
        System.out.println(Math.round(finalAmount*100));
        return Math.round(finalAmount*100.0);
    }

    public static void main(String[] args) {
        double answer = evaluateAmount(100.0, 33);
        System.out.println(answer);
    }
}
