package SeanPrashadList.Easy.NextGreatestLetter;

public class NextGreatestLetter {

    static char nextGreatestLetter(char[] letters, char target) {

        int left = 0;
        int right = letters.length - 1;

        while (left <= right) {

            int middle = (left + right) / 2;

            if(letters[middle] == target) {
                return letters[middle+1];
            }

            if(letters[middle] < target) {
                left = middle + 1;
            }

            else {
                right = middle - 1;
            }
        }
        return letters[0];
    }

    public static void main(String[] args) {

        char[] arr = {'c', 'f', 'j'};


        char ans = nextGreatestLetter(arr, 'd');
        System.out.println(ans);

    }
}
