package com.test;

public class RemoveLoopFromLinkedList {
	
	LinkedListNode node;
	
	public void checkAndRemoveLoop(LinkedListNode ptr)
	{
		LinkedListNode slow=node;
		LinkedListNode  fast=node;
		
		while(slow!=null && fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			
			if(slow==fast)
			{
				removeLoop(slow,node);
			}
			
		}
	}

	private void removeLoop(LinkedListNode loop,LinkedListNode node) {
		LinkedListNode ptr1=loop;
		LinkedListNode ptr1=loop;
		
		if()
	}
	

}
