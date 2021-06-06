package com.failedpeanut;

public class BST {
	Node root = null;// declare root node

	public static void main(String[] args) {
		BST bst_tree = new BST();
		/* Add Data to Tree */
		bst_tree.add(10);
		bst_tree.add(20);
		bst_tree.add(30);
		bst_tree.add(40);

		/*
		 * 1. Inorder Traversel (Left, Root, Right) : 4 2 5 1 3 
		 * 2. Preorder (Root, Left,Right) : 1 2 4 5 3 
		 * 3. Postorder (Left, Right, Root) : 4 5 2 3 1
		 */
		bst_tree.InorderTraversel();
		bst_tree.PreOrderTraversel();
		bst_tree.PostorderTraversel();
	}

	private void InorderTraversel() {
		System.out.println("---InorderTraversel Start---");
		displayDataForInorder(root);
		System.out.println("---InorderTraversel End---");
	}

	private void displayDataForInorder(Node root) {
		if (null != root) {
			displayDataForInorder(root.left);
			System.out.println(root.data);
			displayDataForInorder(root.right);

		}

	}

	private void PreOrderTraversel() {
		System.out.println("---PreOrderTraversel Start---");
		displayDataForPreOrder(root);
		System.out.println("---PreOrderTraversel End---");

	}

	private void displayDataForPreOrder(Node root) {
		if (null != root) {
			System.out.print(root.data);

			displayDataForPreOrder(root.left);

			displayDataForPreOrder(root.right);
		}
	}

	private void PostorderTraversel() {
		System.out.println("---PostorderTraversel Start---");
		displayDataForPostorder(root);
		System.out.println("---PostorderTraversel End---");

	}

	private void displayDataForPostorder(Node root) {
		if (null != root) {

			displayDataForPostorder(root.left);

			displayDataForPostorder(root.right);
			System.out.print(root.data );
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
		if (root == null) { // check if Node is NULL
			return new Node(data);
		}
		if (data < root.data) // if data is lesser than root.data add to left
		{
			root.left = stitchNodes(root.left, data);
		} else if (data > root.data) // if data is greater than root.data add to right
		{
			root.right = stitchNodes(root.right, data);
		} else {
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
