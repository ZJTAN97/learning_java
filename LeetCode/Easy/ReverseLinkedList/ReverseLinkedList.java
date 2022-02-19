package SeanPrashadList.Easy.ReverseLinkedList;

public class ReverseLinkedList {

    static ListNode reverseList(ListNode head) {

        if(head == null) return head;

        ListNode curr = head, next = head, prev = null;

        while(next != null) {
            
            next = next.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        printList(prev);

        return prev;
    }

    static void printList(ListNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static void main(String[] args) {

        // Test Case 1
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);


        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        reverseList(first);

    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode (int x) {
        this.val = x;
        next = null;
    }
}
