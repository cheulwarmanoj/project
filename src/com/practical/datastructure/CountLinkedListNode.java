package com.practical.datastructure;

public class CountLinkedListNode {

	public NodeItem head;

	public void push(int newData) {
		NodeItem newNode = new NodeItem(newData);
		newNode.next = head;
		head = newNode;
	}

	// count the nodes in the list
	public int getCount() {
		int count = 0;
		NodeItem temp = head;
		while (temp != null) {
			count++;
			temp = temp.next;
		}

		return count;
	}
	
	public static void main(String args[])
	{
		CountLinkedListNode countLinkedListNode=new CountLinkedListNode();
		for(int i=0;i<=5;i++)
		{
			countLinkedListNode.push(i);
		}
		System.out.println("total count"+countLinkedListNode.getCount());
		
	}

}
