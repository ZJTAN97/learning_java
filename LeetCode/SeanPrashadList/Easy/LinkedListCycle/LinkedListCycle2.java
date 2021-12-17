package SeanPrashadList.Easy.LinkedListCycle;

public class LinkedListCycle2 {


    static boolean isCycle(ListNode l1) {

        ListNode slow = l1;
        ListNode fast = l1.next;

        while(l1 != null) {

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                return true;
            }

        }
        return false;
    }

    

    public static void main(String[] args) {

        ListNode first = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode fourth = new ListNode(-4);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second;

        System.out.println(isCycle(first));
        
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode (int x) {
        val = x;
        next = null;
    }
}