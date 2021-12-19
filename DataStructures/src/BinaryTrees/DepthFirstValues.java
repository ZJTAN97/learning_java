package BinaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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