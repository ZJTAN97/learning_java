package Easy.LinkedLists;

public class PalindromeLinkedLists {

    public static Boolean isPalindrome(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        // 1. Find middle of linkedlist 
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. Reverse 2nd half of linked list
        ListNode prev = null;
        while(slow != null) {
            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }

        // 3. compare
        ListNode left = head; // from start
        ListNode right = prev; // from end

        while(right != null) {
            if(left.val != right.val) return false;
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(3);
        ListNode f = new ListNode(2);
        ListNode g = new ListNode(1);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;

        System.out.println(isPalindrome(a));

    }
}
