package trees;

import trees.BinaryTree.Node;

public class BinarySearchTree {
	class Node{
		int val;
		Node left;
		Node right;
	}
	private Node root;
	public void contruct(int[] sortedarray) {
		// TODO Auto-generated method stub
		this.root = contruct(sortedarray,0,sortedarray.length);
	}
	private Node contruct(int[] sortedarray,int l, int r) {
		if(l>r)
			return null;
		int mid = (l+r)/2;
		Node nn = new Node();
		nn.val = sortedarray[mid];
		int left = contruct(sortedarray, l, mid-1);
		int right = contruct(sortedarray, mid+1, r);
		
	}
	private boolean search(Node root,int val) {
		if(root==null)
			return false;
		if(root.val<val)
			return search(root.left,val);
		else if(root.val>val)
			return search(root.right,val);
		else
			return true;
	}
}
