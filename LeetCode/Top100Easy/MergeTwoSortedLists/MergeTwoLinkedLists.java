public class Node {

    int data;
    Node next;
    Node (int data) {
        this.data = data;
    }

    static void printList(Node l1) {
        while(l1 != null) {
            System.out.print(l1.data + " ");
            l1 = l1.next;
        }
        System.out.println("");
    }

    static Node mergeTwoLists(Node l1, Node l2) {

        Node returnNode = new Node(0);
        Node currentNode = returnNode;

        while(l1 != null && l2 != null) {
            if(l1.data < l2.data) {
                currentNode.next = l1;
                l1 = l1.next;
            } else {
                currentNode.next = l2;
                l2 = l2.next;
            }

            currentNode = currentNode.next;

            printList(currentNode);

        }

        if (l1 != null) {
            currentNode.next = l1;
            l1 = l1.next;
        }

        if (l2 != null) {
            currentNode.next = l2;
            l2 = l2.next;
        }

        printList(returnNode);

        

        return l1;

    }

    public static void main(String[] args) {
        Node nodeA = new Node(1);
        Node nodeB = new Node(3);
        Node nodeC = new Node(5);
        Node nodeD = new Node(7);

        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;

        Node nodeA1 = new Node(2);
        Node nodeB1 = new Node(4);
        Node nodeC1 = new Node(6);
        Node nodeD1 = new Node(8);

        nodeA1.next = nodeB1;
        nodeB1.next = nodeC1;
        nodeC1.next = nodeD1;

        mergeTwoLists(nodeA, nodeA1);


    }

}