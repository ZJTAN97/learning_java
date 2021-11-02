package SeanPrashadList.Easy.RemoveDuplicates;


public class RemoveDuplicatesFromSortedList {

    static ListNode deleteDuplicates(ListNode head) {

        // handle empty list
        if (head == null || head.next == null) {
            return head;
        }

        ListNode curr = head, prev = head;

        while(curr != null) {
            if(prev.val == curr.val) {
                // as long as its the same, will move pointer to next
                curr = curr.next;
            } else {
                // slow pointer will get the next pointer which isnt a duplicate; as checked by the first condition
                prev.next = curr;
                prev = prev.next;
            }
        }
        prev.next = curr;
        printList(head);
        return head;
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
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(2);
        ListNode fourth = new ListNode(3);
        ListNode fifth = new ListNode(3);


        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;


        // Test Case 2
        ListNode new1 = new ListNode(1);
        ListNode new2 = new ListNode(1);
        ListNode new3 = new ListNode(2);

        new1.next = new2;
        new2.next = new3;


        // Test Case 3
        ListNode test = new ListNode(1);
        ListNode test2 = new ListNode(1);
        ListNode test3 = new ListNode(1);

        test.next = test2;
        test2.next = test3;


        deleteDuplicates(first); // 1 2 3
        System.out.println("----");
        deleteDuplicates(new1); // 1 2
        System.out.println("----");
        deleteDuplicates(test); // 1
        
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
