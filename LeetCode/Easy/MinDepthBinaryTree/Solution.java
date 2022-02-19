package SeanPrashadList.Easy.MinDepthBinaryTree;

import java.util.*;

public class Solution {

    static int minDepth(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if (root == null) return 0;

        queue.add(root);

        int depth = 1;

        while(queue.size() > 0) {
            // for each level
            // *** NEVER put queue size in for loop
            int size = queue.size();
            for(int i=0; i < size; i++) {
                TreeNode currentNode = queue.poll();
                if (currentNode.left == null && currentNode.right == null) return depth;
                if(currentNode.left != null) queue.add(currentNode.left);
                if(currentNode.right != null) queue.add(currentNode.right);
            }
            depth ++;
        }
        return depth;
    }

    public static void main(String[] args) {

        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode();
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode();
        TreeNode e = new TreeNode(4);
        TreeNode f = new TreeNode();
        TreeNode g = new TreeNode(5);
        TreeNode h = new TreeNode();
        TreeNode i = new TreeNode(6);


        a.left = b;
        a.right = c;
        c.left = d;
        c.right = e;
        e.left = f;
        e.right = g;
        g.left = h;
        g.right = i;

        System.out.println(minDepth(a));
        
    }
}




class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}