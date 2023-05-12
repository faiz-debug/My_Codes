package trees;
import java.util.*;

public class BinaryTree {
	
	private static Scanner sc = new Scanner(System.in);
	class Node{
		int val;
		Node left;
		Node right;
	}
	private Node root;   // Initially root is null
	
	public BinaryTree() {
		//constructor
		this.root = build(null);
	}
	private Node build(Node parent) {
		System.out.println("Node ki value do ");
		int data = sc.nextInt();
		Node nn= new Node();
		nn.val = data;
		System.out.println("Kya"+nn.val+" ka left node banna hai?");
		boolean leftnodebannanahai = sc.nextBoolean();
		if(leftnodebannanahai)
		{
			nn.left = build(nn);
		}
		System.out.println("Kya"+nn.val+" ka right node banna hai?");
		boolean rightnodebannanahai = sc.nextBoolean();
		if(rightnodebannanahai)
		{
			nn.right = build(nn);
		}
		return nn;
	}
	public void display() {
		display(root);
	}
	private void display(Node parent) {
		if(parent==null)
			return;
		String ans = "";
		if(parent.left !=null) {
			ans +=parent.left.val;
		}else {
			ans+= '_';
		}
		ans+=  " -> " +parent.val+ " <- ";
		if(parent.right !=null) {
			ans +=parent.right.val;
		}else {
			ans+= '_';
		}
		System.out.println(ans);
		display(parent.left);
		display(parent.right);
	}
	
}
