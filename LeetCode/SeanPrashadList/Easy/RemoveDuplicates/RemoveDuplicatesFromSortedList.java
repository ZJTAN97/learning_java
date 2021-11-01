package SeanPrashadList.Easy.RemoveDuplicates;


public class RemoveDuplicatesFromSortedList {


    // we are not done yet.
    // need handle such a scenario 1, 1, 1
    static ListNode deleteDuplicates(ListNode head) {

        if(head != null) {
            ListNode slow = head;
            ListNode fast = head.next;
            
            while(slow != null && fast != null) {
    
                if(slow.val == fast.val) {
    
                    if (fast.next != null) {
                        fast = fast.next;
                        slow.next = fast;
                        slow = slow.next;
                        fast = fast.next;
                    } else {
                        slow.next = null;
                        slow = slow.next;
                    }
    
                } else {
                    slow = slow.next;
                    fast = fast.next;
                }
            }
            
            printList(head);
        }

        return head;

    }

    static void printList(ListNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static void main(String[] args) {

        ListNode first = new ListNode(1);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(2);
        ListNode fourth = new ListNode(3);
        ListNode fifth = new ListNode(3);


        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;


        ListNode new1 = new ListNode(1);
        ListNode new2 = new ListNode(1);
        ListNode new3 = new ListNode(2);

        new1.next = new2;
        new2.next = new3;


        deleteDuplicates(first); // 1 2 3
        System.out.println("----");
        deleteDuplicates(new1); // 1 2
        
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
