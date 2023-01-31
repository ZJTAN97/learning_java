package com.learningjava.easy.binarytrees;

public class InvertBinaryTree {

    public static TreeNode invertTree(TreeNode root) {

        if (root == null) return root;

        TreeNode leftSubTree = root.left;
        TreeNode rightSubTree = root.right;

        root.left = rightSubTree;
        root.right = leftSubTree;

        invertTree(root.left);
        invertTree(root.right);

        return root;

    }

    public static void main(String[] args) {

        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(1);
        TreeNode c = new TreeNode(3);

        a.left = b;
        a.right = c;

        TreeNode inverted = invertTree(a);
        System.out.println(inverted.left.val);
        System.out.println(inverted.right.val);

    }

}
