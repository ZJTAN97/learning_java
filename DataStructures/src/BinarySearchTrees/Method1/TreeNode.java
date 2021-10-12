package BinarySearchTrees.Method1;

public class TreeNode {
    private Integer data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    // constructor
    public TreeNode(Integer data) {
        this.data = data;
    }

	public TreeNode find(Integer data) {
		if (this.data == data)
			return this;
		if (data < this.data && leftChild != null)
			return leftChild.find(data);
		if (rightChild != null)
			return rightChild.find(data);
		return null;
	}

	public void insert(Integer data) {
		if (data >= this.data) { // insert in right subtree
			if (this.rightChild == null)
				this.rightChild = new TreeNode(data);
			else
				this.rightChild.insert(data);
		} else { // insert in left subtree
			if (this.leftChild == null)
				this.leftChild = new TreeNode(data);
			else
				this.leftChild.insert(data);
		}
	}
	
	public Integer largest() {
		if (this.rightChild == null)
			return this.data;
		return this.rightChild.largest();
	}

	public Integer smallest() {
		if (this.leftChild == null)
			return this.data;
		return this.leftChild.smallest();
	}

    public Integer getData() {
        return data;
    }

	public TreeNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNode left) {
		this.leftChild = left;
	}

	public TreeNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode right) {
		this.rightChild = right;
	}

}
