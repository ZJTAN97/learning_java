import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {

    static boolean isPalindrome(ListNode head) {

        int counter = 0;
        List<Integer> values = new ArrayList<Integer>();
        ListNode current = head;
        

        boolean condition = true;
        int leftIter = 1;
        int rightIter = 0;

        while(current != null) {
            counter += 1;
            values.add(current.val);
            current = current.next;
        }

        if(counter % 2 != 0) return false;
        
        System.out.println(counter);


        while(condition && rightIter < (counter - counter/2)) {

            int left = values.get(counter/2 - leftIter);
            int right = values.get(counter/2 + rightIter);

            if(left != right) {
                condition = false;
            }

            leftIter += 1;
            rightIter += 1;

        }

        return condition;
    }

    public static void main(String[] args) {

        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(2);
        ListNode fourth = new ListNode(1);

        // first.next = second;
        // second.next = third;
        // third.next = fourth;

        isPalindrome(first);

    }
}


public class ListNode {
    int val;
    ListNode next;
    ListNode (int x) {
        this.val = x;
        next = null;
    }
}