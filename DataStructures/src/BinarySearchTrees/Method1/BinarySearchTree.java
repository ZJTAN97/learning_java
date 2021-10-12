package src.BinarySearchTrees.Method1;

public class BinarySearchTree {
    
    private TreeNode root;

    public TreeNode find(Integer data) {
        if (root != null) 
            return root.find(data);
        return null;
    }

    public Integer largest() {
		if (this.root != null)
			return root.largest();
		return null;
	}

	public Integer smallest() {
		if (this.root != null)
			return root.smallest();
		return null;
	}

    public void insert(Integer data) {
		if (root == null)
			this.root = new TreeNode(data);
		else
			root.insert(data);
	}


    public static void main(String[] args) {

        int[] sample = {212, 580, 6, 7, 28, 84, 112, 434};
        BinarySearchTree tree = new BinarySearchTree();

        for (int i : sample) {
            tree.insert(i);
        }

        System.out.println(tree.largest());
        System.out.println(tree.find(580));

        
    }

}
