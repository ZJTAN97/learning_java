package BinaryTrees;

import java.util.*;

public class DepthFirstValues {

    static List<Character> depthFirstTraversal(TreeNode root) {

        List<Character> result = new ArrayList<Character>();

        if (root == null) return result;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.add(root);

        while(stack.size() > 0) {

            TreeNode current = stack.pop();
            result.add(current.val);

            if(current.left != null) stack.add(current.left);
            if(current.right != null) stack.add(current.right);

        }   
        return result;
    }


    static List<Character> depthFirstRecursive(TreeNode root) {
        List<Character> result = new ArrayList<Character>();
        if (root == null) return result;
        
        List<Character> leftValues = depthFirstRecursive(root.left);
        List<Character> rightValues = depthFirstRecursive(root.right);

        result.addAll(Arrays.asList(root.val));
        result.addAll(leftValues);
        result.addAll(rightValues);
    
        return result;
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode('a');
        TreeNode b = new TreeNode('b');
        TreeNode c = new TreeNode('c');
        TreeNode d = new TreeNode('d');
        TreeNode e = new TreeNode('e');
        TreeNode f = new TreeNode('f');

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        System.out.println(depthFirstTraversal(a));
        System.out.println(depthFirstRecursive(a));

    }
}



class TreeNode {
    char val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(char val) { this.val = val; }
    TreeNode(char val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}