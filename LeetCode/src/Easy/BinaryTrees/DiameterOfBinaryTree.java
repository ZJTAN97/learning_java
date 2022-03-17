package Easy.BinaryTrees;

public class DiameterOfBinaryTree {

    static int diameter = 0;

    public static Integer dfs(TreeNode node) {

        if(node == null) return 0;

        int left = dfs(node.left);
        int right = dfs(node.right);
        diameter = Math.max(diameter, left + right);
        return 1 + Math.max(left, right);
    }

    public static Integer diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return diameter;
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;

        System.out.println(diameterOfBinaryTree(a));

    }
}
