package BinaryTrees;
// https://www.geeksforgeeks.org/binary-tree-set-1-introduction/
public class BinaryTreesMain {
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        System.out.println(tree.root.key);
        System.out.println(tree.root.left.key);
        System.out.println(tree.root.right.key);

    }
}


class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }

}


class BinaryTree {
    // Root of Binary Tree
    Node root;

    // Constructors
    BinaryTree(int key) {
        root = new Node(key);
    }
    BinaryTree() {
        root = null;
    }
}