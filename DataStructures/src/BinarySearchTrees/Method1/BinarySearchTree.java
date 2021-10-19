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

    private TreeNode getSuccessor(TreeNode node) {
        // private method to get successor for case 3 deletion
        TreeNode parentOfSuccessor = node;
        TreeNode successor = node;
        TreeNode current = node.getRightChild();
        while (current != null) {
            parentOfSuccessor = successor;
            successor = current;
            current = current.getLeftChild();
        }
        if (successor != node.getRightChild()) {
            parentOfSuccessor.setLeftChild(successor.getRightChild());
            successor.setRightChild(node.getRightChild());
        }

        return successor;
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

		// Case 1: Leaf Node
		if (current.getLeftChild() == null && current.getRightChild() == null) {
            System.out.println("Case 1 Deletion");
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
        // Case 2: Node has one child (either left or right)
        // to "Delete" in case 2, is simply bypassing the node from grandparent to grandchild
        else if (current.getRightChild() == null) {
            System.out.println("Case 2 Deletion (Left Child)");
            // this condition handles if the child is at left side
            if (current == root) { // first level 
                root = current.getLeftChild();
            } else if (isLeftChild) {
                parent.setLeftChild(current.getLeftChild());
            } else {
                parent.setRightChild(current.getLeftChild());
            }
        }
        else if (current.getLeftChild() == null) {
            System.out.println("Case 2 Deletion (Right Child)");
            // this condition handles if the child is at right side
            if (current == root) {
                root = current.getRightChild();
            } else if (isLeftChild) {
                parent.setLeftChild(current.getRightChild());
            } else {
                parent.setRightChild(current.getRightChild());
            }
        }

        // Case 3: Node has two children
        else {
            System.out.println("Case 3 Deletion");
            TreeNode successor = getSuccessor(current);
            if (current == root) {
                root = successor; // handle first level as usual
            } else if (isLeftChild) {
                parent.setLeftChild(successor);
            } else {
                parent.setRightChild(successor);
            }
            successor.setLeftChild(current.getLeftChild());
        }






    }


    public static void main(String[] args) {

        int[] sample = {212, 580, 6, 7, 28, 84, 112, 434, 5};
        BinarySearchTree tree = new BinarySearchTree();

        for (int i : sample) {
            tree.insert(i);
        }

        tree.delete(6);

        
    }

}
