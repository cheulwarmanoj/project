package com.practical.datastructure;

public class CountLinkedListNode {

	public Node head;

	public void push(int newData) {
		Node newNode = new Node(newData);
		newNode.next = head;
		head = newNode;
	}

	public int getCount() {
		int count = 0;
		Node temp = head;
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
