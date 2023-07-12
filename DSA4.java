package Ass13;

public class DSA4 {


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
	    
	    public  void modify(int n)
	    {
	    	Node current =head;
	    	int temp=1,trav=0;
	    	Node prev=null;
	    	int flag=0;
	    	while(current!=null)
	    	{
	    		if(temp==n)
	    		{
	    		//	System.out.println("te"+temp);
	    			if(flag==0)
	    			{	    				
	    				head=current;
	    				flag=1;
	    			}
	    			Node tempo=current;
	    			Node next =current.next;
	    			while(tempo!=null)
	    			{
	    				tempo.next=tempo.previous;
	    				tempo.previous=prev;
	    				prev=tempo;
	    				tempo=tempo.next;
	    			}
	    			temp=0;
	    			trav=0;
	    			prev.next=next;
	    			current=prev;
	    			System.out.println(prev.data+"pr");
	    			System.out.println(current.data);
	    			System.out.println(prev.next.data+"d");
	    		}
	    		
	    		if(temp==0 && trav<n)
	    		{
	    			System.out.println(trav+"tra");
	    			trav++;	    			
	    		}
	    		else
	    		{
	    			temp++;
	    			System.out.println(temp+"t");
	    		}
	    		current=current.next;
	    	}
	    }
	    
	    public static void main(String[] args) {
	    	
	    	DSA4 dList = new DSA4();  
		        //Add nodes to the list  
		        dList.addNode(1);  
		        dList.addNode(2);  
		        dList.addNode(3);  
		        dList.addNode(3);
		        dList.addNode(4);  
		        dList.addNode(5);  
		        dList.addNode(6);  
		        dList.addNode(7);  
		        dList.addNode(8);  
		        dList.modify(3);
		        dList.display();  
		}
}
