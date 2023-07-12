
package Ass13;

class DoublyLinkedList
{
    Node head;
    // not using parameterized constructor would by default
    // force head instance to become null
    // Node head = null;  // can also do this, but not required

    // Node Class
    class Node
    {
        int data;
        Node next, prev;

        Node (int x)		// parameterized constructor
        {
            data = x;
            next = null;
            prev = null;
        }
    }

    public void insertBeginning (int data)
    {
        // Creating newNode memory & assigning data value
        Node freshNode = new Node (data);

        freshNode.next = head;
        freshNode.prev = null;

        // if DLL had already >=1 nodes
        if (head != null)
            head.prev = freshNode;

        // changing head to this
        head = freshNode;
    }


    // function for deleting Nth node
    public void deletenth (int n)
    {
        if (head == null)
        {
            return;
        }
        else
        {
            Node current = head;
            int pos = n;
            for (int i = 1; i < pos; i++)
            {
                current = current.next;
            }
            if (current == head)
            {
                head = current.next;
            }
            else if (current == null)
            {
                current = current.prev;
            }
            else
            {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            //Delete the middle node
            current = null;
        }
    }


    void printList ()
    {
        //Node current will point to head
        Node curr = head;
        if (head == null)
        {
            System.out.println ("List is empty");
            return;
        }
        while (curr != null)
        {
            //Prints each node by increasing order of the pointer
            System.out.print (curr.data + " ");
            curr = curr.next;
        }
        System.out.println ();
    }

}

class Main
{

    public static void main (String args[])
    {
        DoublyLinkedList doublylist = new DoublyLinkedList ();

        doublylist.insertBeginning (3);
        doublylist.insertBeginning (2);
        doublylist.insertBeginning (1);
        doublylist.insertBeginning (4);
        doublylist.insertBeginning (7);

        System.out.println ("List before deletion : ");
        doublylist.printList ();


        doublylist.deletenth (2);
        doublylist.deletenth (3);
        System.out.println ("List after deleting 2nd node : ");
        doublylist.printList ();

    }
}