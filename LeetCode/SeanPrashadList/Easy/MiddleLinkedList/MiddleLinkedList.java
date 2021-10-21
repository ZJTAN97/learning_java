public class MiddleLinkedList {


    static ListNode middleNode(ListNode head) {

        int counter = 1;
        ListNode current = head.next;
        while(current != null) {
            System.out.println(current.val);
            counter += 1;
            current = current.next;
        }

        System.out.print("Counter 1/2: ");
        System.out.println(counter/2 + 1);
        
        ListNode newCurrent = head;
        for(int i=1; i< counter/2 + 1; i++) {
            newCurrent = newCurrent.next;
        }

        System.out.println(newCurrent.val);


        return newCurrent;
    }


    public static void main(String[] args) {

        ListNode test1 = new ListNode(1);
        ListNode test2 = new ListNode(2);
        ListNode test3 = new ListNode(3);
        ListNode test4 = new ListNode(4);
        ListNode test5 = new ListNode(5);
        ListNode test6 = new ListNode(6);

        test1.next = test2;
        test2.next = test3;
        test3.next = test4;
        test4.next = test5;
        test5.next = test6;
        
        middleNode(test1);
        
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