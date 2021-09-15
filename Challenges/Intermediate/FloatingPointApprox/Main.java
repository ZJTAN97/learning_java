public class Main {
    public static void main(String[] args) {
        quadratic(1, 1e9, 1);
    }

    public static double quadratic(double a, double b, double c) {
        double discriminantPos = ((-b) + Math.sqrt((Math.pow(b,2)) - (4*a*c))) / (2*a);
        double discriminantNeg = ((-b) - Math.sqrt((Math.pow(b,2)) - (4*a*c))) / (2*a);

        if(Math.abs(discriminantNeg) < 1e-12) {
            return discriminantNeg;
        } else {
            return 0;
        }        
    }

}
