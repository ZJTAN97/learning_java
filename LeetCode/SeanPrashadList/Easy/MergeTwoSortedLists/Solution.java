package SeanPrashadList.Easy.MergeTwoSortedLists;

public class Solution {

    static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode returnNode = new ListNode(0);
        ListNode current = returnNode;


        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }

            current = current.next;
        }

        if(l1 != null) {
            current.next = l1;
            l1 = l1.next;
        } else {
            current.next = l2;
            l2 = l2.next;
        }

        printList(returnNode.next);

        return returnNode.next;
    }

    static void printList(ListNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }


    public static void main(String[] args) {
        
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(1);
        ListNode fifth = new ListNode(2);
        ListNode sixth = new ListNode(3);


        first.next = second;
        second.next = third;
        
        fourth.next = fifth;
        fifth.next = sixth;

        mergeTwoLists(first, fourth);

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

