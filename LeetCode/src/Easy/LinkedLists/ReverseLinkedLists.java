package Easy.LinkedLists;

public class ReverseLinkedLists {

    public static ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode current = head;

        while(current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;

    }

    public static void main(String[] args) {

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);

        a.next = b;
        b.next = c;
        c.next = d;

        ListNode reversed = reverseList(a);

        while(reversed != null) {
            System.out.println(reversed.val);
            reversed = reversed.next;
        }

    }
}
