package com.failedpeanut;

public class BST {
	Node root = null;// declare root node

	public static void main(String[] args) {
		BST bst_tree = new BST();
		bst_tree.add(10);
		bst_tree.add(20);
		bst_tree.add(30);
		bst_tree.add(40);
		bst_tree.display();
	}

	private void display() {
		display(root);
		
	}

	private void display(Node root) {
		if(null!=root) {
			System.out.println(root.data);
			display(root.left);
			display(root.right);
			
		}
		
	}

	public void add(int i) {
		Node tempNode = new Node(i);
		if (null == root) {
			root = tempNode;
		} else {
			root = stitchNodes(root, i);
		}

	}

	private Node stitchNodes(Node root, int data) {
		if (root == null) { //check if Node is NULL
	        return new Node(data);
	    }
		if (data < root.data) // if data is lesser than root.data add to left
		{
			root.left = stitchNodes(root.left, data);
		} 
		else if (data > root.data) // if data is greater than root.data add to right
		{
			root.right = stitchNodes(root.right, data);
		} 
		else {
			return root;// if data already exists
		}

		return root;
	}
	
	
	
	
	
	
	
}

class Node {
	Node left;
	Node right;
	int data;

	public Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}

}
