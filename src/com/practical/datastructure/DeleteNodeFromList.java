package com.practical.datastructure;

/**
 * @author hp
 *
 */
public class DeleteNodeFromList {

	NodeItem head;

	/**
	 * This method will delete the given item from the list.
	 * 
	 * @param itemTobeDeleted
	 */
	public void deleteNode(int itemTobeDeleted) {
		NodeItem temp = head;
		NodeItem prev = null;

		if (temp != null && temp.data == itemTobeDeleted) {
			head = temp.next;
			return;
		}

		while (temp != null && temp.data != itemTobeDeleted) {
			prev = temp;
			temp = temp.next;
		}
		if (temp == null) {
			return;
		}

		prev.next = temp.next;
	}

	/* Inserts a new Node at first position of the list. */
	public void push(int newData) {
		NodeItem newNode = new NodeItem(newData);
		newNode.next = head;
		head = newNode;
	}

	/* print the list of item in the list */
	public void printLinkedList() {
		NodeItem nodeItem = head;

		while (nodeItem != null) {
			System.out.println("\n data" + nodeItem.data);
			nodeItem = nodeItem.next;
		}
	}

	public static void main(String args[]) {
		DeleteNodeFromList list = new DeleteNodeFromList();
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		list.push(5);
		list.push(6);
		
		System.out.println("before deletion of node");
		list.printLinkedList();
		
		
		list.deleteNode(1);
		System.out.println("after deletion of node");
		list.printLinkedList();

	}
}
