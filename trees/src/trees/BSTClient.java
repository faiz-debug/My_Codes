package trees;

public class BSTClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sortedarray = {10,20,30,40,50,60,70};
		BinarySearchTree bst = new BinarySearchTree();
		bst.contruct(sortedarray);
		bst.display();
	}

}
