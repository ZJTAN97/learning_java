import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {

    static ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    static boolean isPalindrome(ListNode head) {

        ListNode fast = head, slow = head;
        while( fast != null && fast.next != null ) {
            fast = fast.next.next;
            slow = slow.next;
        }

        if (fast != null) { // odd nodes: let right half smaller
            slow = slow.next;
        }
        slow = reverse(slow);
        fast = head;
        
        while (slow != null) {
            if (fast.val != slow.val) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;


    }



    public static void main(String[] args) {

        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(2);
        ListNode fourth = new ListNode(1);

        // first.next = second;
        // second.next = third;
        // third.next = fourth;

        System.out.println(isPalindrome(first));

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

