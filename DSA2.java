package Ass13;

import java.util.HashMap;

public class DSA2 {

	  class Node{  
	        int data;  
	        Node previous;  
	        Node next;  
	  
	        public Node(int data) {  
	            this.data = data;  
	        }  
	    }  
	  
	    //Represent the head and tail of the doubly linked list  
	    Node head, tail = null;  
	    int count=0;
	    //addNode() will add a node to the list  
	    public void addNode(int data) {  
	        //Create a new node  
	        Node newNode = new Node(data);  
	  
	        //If list is empty  
	        if(head == null) {  
	            //Both head and tail will point to newNode  
	            head = tail = newNode;  
	            //head's previous will point to null  
	            head.previous = null;  
	            //tail's next will point to null, as it is the last node of the list  
	            tail.next = null;  
	        }  
	        else {  
	            //newNode will be added after tail such that tail's next will point to newNode  
	            tail.next = newNode;  
	            //newNode's previous will point to tail  
	            newNode.previous = tail;  
	            //newNode will become new tail  
	            tail = newNode;  
	            //As it is last node, tail's next will point to null  
	            tail.next = null;  
	        }  
	        count++;
	    }  
	  
	    //display() will print out the nodes of the list  
	    public void display() {  
	        //Node current will point to head  
	        Node current = head;  
	        if(head == null) {  
	            System.out.println("List is empty");  
	            return;  
	        }  
	        System.out.println("Nodes of doubly linked list: ");  
	        while(current != null) {  
	            //Prints each node by incrementing the pointer.  
	  
	            System.out.print(current.data + " ");  
	            current = current.next;  
	        }
	        
	         } 
	    
	    public  void modify()
	    {
	    	Node current =head;
	    	HashMap<Integer,Integer>g= new HashMap();
	    	while(current!=null)
	    	{
	    		if(g.get(current.data)!=null)
	    		{
	    			current.previous.next=current.next;
	    			current=current.next;
	    		}
	    		else
	    		{
	    			g.put(current.data,1);
	    			current=current.next;
	    		}
	    	}
	    }
	    
	    public static void main(String[] args) {
	    	
	    	DSA2 dList = new DSA2();  
		        //Add nodes to the list  
		        dList.addNode(1);  
		        dList.addNode(2);  
		        dList.addNode(3);  
		        dList.addNode(3);
		        dList.addNode(4);  
		        dList.addNode(5);  
		        dList.modify();
		        dList.display();  
		}
	    
}
