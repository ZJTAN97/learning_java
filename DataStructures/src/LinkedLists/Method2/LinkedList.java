package LinkedLists.Method2;

//https://www.geeksforgeeks.org/linked-list-set-2-inserting-a-node/

public class LinkedList {

    Node head; // head of list

    /* Linked list Node.  This inner class is made static so that
       main() can access it */
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null; // points to null initially
        } // constructor
    }

    public void printList() {
        Node n = head;
        while(n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String[] args) {
        LinkedList newLinkedList = new LinkedList();

        newLinkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        newLinkedList.head.next = second; // Link first node with the second node
        second.next = third; // Link second node with the third node

        newLinkedList.printList();

    }

}
