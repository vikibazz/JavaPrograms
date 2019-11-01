public class RemoveDuplicatesInAnUnsortedLinkedList
{
    Node head;
    static class Node
    {
        int data;
        Node next;

        Node(int d)
        {
            data = d;
        }
    }

    public static RemoveDuplicatesInAnUnsortedLinkedList insert(RemoveDuplicatesInAnUnsortedLinkedList list,int data)
    {
        Node new_node = new Node(data);
        new_node.next = null;

        if(list.head == null)
        {
            list.head = new_node;
        }
        else
        {
            Node last = list.head;

            while(last.next != null)
            {
                last = last.next;
            }

            last.next = new_node;
        }

        return list;
    }

    public static void RemoveAllDuplicates(RemoveDuplicatesInAnUnsortedLinkedList list)
    {
        Node ptr1 = list.head;
        Node ptr2 = null;
        Node dup  = null;

        while(ptr1 != null && ptr1.next != null)
        {
            ptr2 = ptr1;

            while(ptr2.next != null)
            {
                if(ptr1.data == ptr2.next.data)
                {
                    dup = ptr2.next;
                    ptr2.next = ptr2.next.next;
                    System.gc();
                } 
                else
                {
                    ptr2 = ptr2.next;
                }
            }

            ptr1 = ptr1.next;
        }
    }

    public static void printList(RemoveDuplicatesInAnUnsortedLinkedList list)
    {
        Node currNode = list.head;
        System.out.println("\n-------Linked List-------");
        while(currNode != null)
        {
            System.out.print(currNode.data+" ");
            currNode = currNode.next;
        }
        System.out.println("\n");
    }

    public static void main(String[] args) 
    {
        RemoveDuplicatesInAnUnsortedLinkedList list = new RemoveDuplicatesInAnUnsortedLinkedList();

        insert(list,1);
        insert(list,2);
        insert(list,3);
        insert(list,1);
        insert(list,1);
        insert(list,4);
        insert(list,5);
        insert(list,4);
        insert(list,6);
        insert(list,6);

        printList(list);

        RemoveAllDuplicates(list);

        printList(list);
    }
}