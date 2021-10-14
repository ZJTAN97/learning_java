package BinarySearchTrees.Method1;

public class BinarySearchTree {
    
    private TreeNode root;

    public TreeNode find(Integer data) {
        if (root != null) 
            return root.find(data);
        return null;
    }



    public void insert(Integer data) {
		if (root == null)
			this.root = new TreeNode(data);
		else
			root.insert(data);
	}

    public void delete(Integer data) {
        TreeNode current = this.root;
        TreeNode parent = this.root;
        boolean isLeftChild= false;

		if (current == null)
			return; // tree is empty

        // check that current node data is not null and the data is not the one to be deleted
        // when current == null, we reached end of tree
        // we are trying to find the node to be deleted represented by "current"
        // and the parent of that node represnted by "parent"
		while (current != null && current.getData() != data) {
			parent = current; // so that can move downwards
			if (data < current.getData()) {
				current = current.getLeftChild();
				isLeftChild = true;
			} else {
				current = current.getRightChild();
				isLeftChild = false;
			}
            // by the end of the while loop, you will reach the node to be deleted or null
		}
		if (current == null) {
            // end of tree, cannot find the one to be deleted.
            System.out.println("Node to be deleted not found.");
			return; // node to be deleted not found
        }

		// this is case 1
		if (current.getLeftChild() == null && current.getRightChild() == null) {
			if (current == root) {
				root = null; // no elements in tree now
			} else {
				if (isLeftChild) {
					parent.setLeftChild(null);
                    System.out.println("Node deleted is at left side.");
                }
				else {
					parent.setRightChild(null);
                    System.out.println("Node deleted is at right side.");
                }
			}
		}

    }


    public static void main(String[] args) {

        int[] sample = {212, 580, 6, 7, 28, 84, 112, 434};
        BinarySearchTree tree = new BinarySearchTree();

        for (int i : sample) {
            tree.insert(i);
        }

        tree.delete(112);

        
    }

}
