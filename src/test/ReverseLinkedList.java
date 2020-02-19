	package com.test;

public class ReverseLinkedList {
	
	Node head;
	
	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			this.data=d;
		}
	}
	
	Node reverse(Node head,int k)
	{
		Node current=head;
		Node next=null;
		Node prev=null;
		
		int count=0;
		
		while(count<k && current!=null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
			count++;
		}
		
		if(next!=null)
		{
			head.next=reverse(next,k);
		}
		
		return prev;
	}
	
	public void push(int d)
	{
		Node newNode=new Node(d);
		newNode.next=head;
		
		head=newNode;
				
	}
	
	public void printList()
	{
		Node temp=head;
		
		while (temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	 /* Driver program to test above functions */
    public static void main(String args[]) 
    { 
        ReverseLinkedList llist = new ReverseLinkedList(); 
          
        /* Constructed Linked List is 1->2->3->4->5->6-> 
           7->8->8->9->null */
        llist.push(9); 
        llist.push(8); 
        llist.push(7); 
        llist.push(6); 
        llist.push(5); 
        llist.push(4); 
        llist.push(3); 
        llist.push(2); 
        llist.push(1); 
          
        System.out.println("Given Linked List"); 
        llist.printList(); 
          
        llist.head = llist.reverse(llist.head, 9); 
  
        System.out.println("Reversed list"); 
        llist.printList(); 
    } 

}
