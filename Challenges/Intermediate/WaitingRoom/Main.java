import java.util.Arrays;

import java.util.*;

public class Main {
    // https://www.codewars.com/kata/542f0c36d002f8cd8a0005e5/java
    public static void main(String[] args) {
        System.out.println(lastChair(100));
        // once you use it a few times, you realise
        // the answer is just n - 1
    }


    private static int getBeatSeat(boolean[] chairs) {
        int index = -1;
        int maxSoFar = -1;
        for(int i=0; i < chairs.length; i++) {
            if(!chairs[i]) {
                int score = calcScore(chairs, i);
                if (score > maxSoFar) {
                    index = i;
                    maxSoFar = score;
                }
            }
        }
        return index;
    }


    private static int calcScore(boolean[] chairs, int chair) {
        int leftScore = 0;
        if (chair == 0) {
            leftScore = chairs.length;
        } else {
            for (int i = chair - 1; i >= 0; i--) {
                if (chairs[i]) {
                    break;
                }
                leftScore ++;
            }
        }

        int rightScore = 0;
        if (chair == chairs.length - 1) {
          rightScore = chairs.length;
        } else {
          for (int i = chair + 1; i < chairs.length; i++) {
            if (chairs[i]) {
              break;
            }
            rightScore ++;
          }
        }
        return (leftScore < rightScore) ? leftScore : rightScore;
    }

    
    public static int lastChair(int n) {
        boolean[] chairs = new boolean[n];
        int chair = 0;
        for (int i = 0; i < n; i++) {
            chair = getBeatSeat(chairs);
            chairs[chair] = true;
        }
        return chair + 1;
    }


}
