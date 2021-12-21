package BinaryTrees;

import java.util.*;

public class TreeIncludes {

    static boolean treeIncludesBFS(TreeNode root, char target) {
        if(root == null) return false;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        
        while(queue.size() > 0) {
            TreeNode current = queue.poll();
            if(current.val == target) return true;
            if(current.left != null) queue.add(current.left);
            if(current.right !=null) queue.add(current.right);
        }
        return false;
    }

    static boolean treeIncludeDFS(TreeNode root, char target) {
        if(root == null) return false;
        if(root.val == target) return true;
        return treeIncludeDFS(root.left, target) || treeIncludeDFS(root.right, target);
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

        System.out.println(treeIncludesBFS(a, 'a'));
        System.out.println(treeIncludeDFS(a, 'a'));

        
    }
}



class TreeNode {
    char val;
    TreeNode left, right;
    public TreeNode(char val) {
        this.val = val;
        left = right = null;
    }   
}