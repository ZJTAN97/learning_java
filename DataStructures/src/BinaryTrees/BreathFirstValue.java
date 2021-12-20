package BinaryTrees;

import java.util.*;

public class BreathFirstValue {

    static List<Character> breathFirstTraversal(TreeNode root) {

        List<Character> result = new ArrayList<Character>();
        if(root == null) return result;


        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        while(queue.size() > 0) {
            TreeNode current = queue.poll();
            result.add(current.val);

            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);

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

        System.out.println(breathFirstTraversal(a));
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