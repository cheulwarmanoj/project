package com.test;

public class BinarytTreeDepth {

	Node root;
	
	int maxDepth(Node node)
	{
		if(node==null)
		{
			return 0;
		}
		else
		{
			int leftDepth=maxDepth(node.left);
			int  rightDepth=maxDepth(node.right);
			
			if(leftDepth > rightDepth)
			    return leftDepth +1;
			else
				return rightDepth +1;
		}
		
	}
	
	public static void main(String args[])
	{
		BinarytTreeDepth binarytTreeDepth=new BinarytTreeDepth();
		binarytTreeDepth.root=new Node(1);
		binarytTreeDepth.root.left=new Node(2);
		binarytTreeDepth.root.left.left=new Node(4);
		binarytTreeDepth.root.left.right=new Node(5);
		
		
		System.out.println(binarytTreeDepth.maxDepth(binarytTreeDepth.root));
	}
	
}
