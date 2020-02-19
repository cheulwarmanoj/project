package com.test;

public class BinaryTree {
	
	Node node;
	Node head;
	
	void BTTtoDLL(Node root)
	{
		if(root==null)
		  return;
		
		BTTtoDLL(root.right);
		
		if(head!=null)
			(head).left= root;
		
		head=root;
		
		BTTtoDLL(root.left);
		
	}

	public void printList(Node head)
	{
		System.out.println("Linked list");
		while(head!=null)
		{
			System.out.println(head.data+"head.data");
			head=head.right;
		}
	}
}
