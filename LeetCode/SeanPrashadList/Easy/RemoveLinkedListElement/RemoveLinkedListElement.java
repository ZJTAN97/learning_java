public class RemoveLinkedListElement {

    // Need to find out more about moving nodes

    static ListNode removeElements(ListNode head, int val) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy; // moving node.


        while(current.next != null) {
            if(current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
            // printList(current);
            printList(dummy.next);
            System.out.println("---");
        }

        // printList(dummy.next);

        return dummy.next;

    }


    static void printList(ListNode head) {
        ListNode current = head;
        while(current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }
    public static void main(String[] args) {


        ListNode first = new ListNode(2);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(2);
        // ListNode fifth = new ListNode(2);

        first.next = second;
        second.next = third;
        third.next = fourth;
        // fourth.next = fifth;

        removeElements(first, 1);

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
