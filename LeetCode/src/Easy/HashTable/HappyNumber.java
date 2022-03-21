package Easy.HashTable;

import java.util.HashMap;

public class HappyNumber {

    public static Boolean isHappy(int n) {

        String str = Integer.toString(n);
        int currNum = 0;

        HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();

        while(currNum != 1) {
            for(int i=0; i<str.length(); i++) {
                currNum += Math.pow(Character.getNumericValue(str.indexOf(i)), 2);
            }

            if(currNum == 1) return true;
            if(cache.get(currNum) != null) return false;
            cache.put(currNum, 1);
            str = Integer.toString(currNum);
            currNum = 0;
        }
        return false;
    }

    public static void main(String[] args) {
        
    }
}
