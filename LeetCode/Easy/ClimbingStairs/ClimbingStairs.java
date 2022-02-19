package SeanPrashadList.Easy.ClimbingStairs;

public class ClimbingStairs {

    static int climbStairs(int n) {

        // fibonacci sequence

        // need to revise more on dynamic programming problems

        int first = 1;
        int second = 1;
        int temp;

        for(int i=0; i<n-1; i++) {
            temp = first; // 1, 2, 3, 5,
            first = first + second; // 2, 3, 5, 8  
            second = temp; // 1, 2, 3,
        }

        return first;

    }

    public static void main(String[] args) {


        System.out.println(climbStairs(5));

    }
}
