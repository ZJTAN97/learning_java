package src.LinkedLists.Method1;

public class Node {

    // Remember that Node has 2 parts, data and reference to nextNode
    private int data;
    private Node nextNode;

    public Node (int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public Node getNextNode() {
        return this.nextNode;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }


    @Override
    public String toString() {
        return "Data: " + this.data;
    }

}