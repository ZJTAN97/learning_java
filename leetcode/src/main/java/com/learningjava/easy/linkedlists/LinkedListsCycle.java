package com.learningjava.easy.linkedlists;

public class LinkedListsCycle {

    public static Boolean hasCycle(ListNode head) {

        if(head == null) return false;

        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {

        ListNode a = ListNode.builder().val(3).build();
        ListNode b = ListNode.builder().val(2).build();
        ListNode c = ListNode.builder().val(0).build();
        ListNode d = ListNode.builder().val(-4).build();

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = b;

        System.out.println(hasCycle(a));

    }

}
