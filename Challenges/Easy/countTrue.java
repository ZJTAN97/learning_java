// Create a function which returns the number of true values there are in an array.

public class countTrue {
    public static int countTrue(boolean [] arr) {
        int count = 0;
        for(boolean i : arr) {
            if(i) count += 1;
        }
        return count;
    }

    public static void main(String[] args) {

        boolean[] test = {true, true, true, true, true};
        int numberOfTrue = countTrue(test);
        System.out.println(numberOfTrue);
    }
}
