package Ass13;
class Node{
    int data;
    Node next;
    
    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
class DeleteLastOccurence {
    // The main function to delete the last occurence of 
    // x in the Linked List
  static void deleteLastOccurence(Node head, int x)
    {
        Node temp = head;
        Node ptrX = null;
        
        while(temp != null)
        {
            if(temp.data == x)
            {
                ptrX = temp;
            }
            
            temp = temp.next;
        }
        
        // the ptrX is now pointing to the 
        // last occurence of x
        
        // If the last occurence is the last node
        if(ptrX != null && ptrX.next == null)
        {
            temp = head;
            while(temp.next != ptrX){
                temp = temp.next;
            }
            
            temp.next = null;
        }
        
        // If the last occurence is not the last node
        if(ptrX != null && ptrX.next != null){
            ptrX.data = ptrX.next.data;
            temp = ptrX.next;
            ptrX.next = ptrX.next.next;
            System.gc();
        }
        
    }
    
    static void displayLinkedList(Node head)
    {
        Node temp = head;
        if(head == null){
            System.out.print("null\n");
            return;
        }
    
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        
        System.out.print("Null\n");
        
    }
    public static void main(String[] args) {
        Node head = new Node(0);
        head.next= new Node(3);
        head.next.next = new Node(0);
        head.next.next.next = new Node(8);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(0);
        head.next.next.next.next.next.next = new Node(0);
        head.next.next.next.next.next.next.next = new Node(0);
        displayLinkedList(head);
        int x = 0;
        deleteLastOccurence(head, x);
        System.out.println("\nDisplaying Linked list after deletion of last occurence of " + x);
        displayLinkedList(head);


        
    }
}