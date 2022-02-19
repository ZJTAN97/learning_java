package SeanPrashadList.Easy.AverageLevelBinaryTree;

import java.util.*;

public class Solution {

    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null) return result;

        queue.add(root);

        while(queue.size() > 0) {
            int n = queue.size();
            double sum = 0.0;
            for(int i=0; i < n; i++) {
                TreeNode node = queue.poll();
                sum += node.val;
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            result.add( sum / n);

        }

        return result;

    }

    public static void main(String[] args) {

        TreeNode three = new TreeNode(3);
        TreeNode one = new TreeNode(1);
        TreeNode five = new TreeNode(5);
        TreeNode four = new TreeNode(4);
        TreeNode zero = new TreeNode(0);
        TreeNode two = new TreeNode(2);
        TreeNode six = new TreeNode(6);

        three.left = one;
        three.right = five;
        one.left = zero;
        one.right = two;
        five.left = four;
        five.right = six;

        Solution solution = new Solution();
        solution.averageOfLevels(three);

    }
}


class TreeNode {
    double val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(double val) { this.val = val; }
    TreeNode(double val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}