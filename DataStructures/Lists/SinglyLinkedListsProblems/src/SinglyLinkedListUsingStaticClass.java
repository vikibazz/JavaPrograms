public class SinglyLinkedListUsingStaticClass
{
    Node head;

    //using static nested class
    static class Node
    {
        int data;
        Node next;

        Node(int d)
        {
            data = d;
        }
    }

    public static SinglyLinkedListUsingStaticClass insert(SinglyLinkedListUsingStaticClass list,int data)
    {
        Node new_Node = new Node(data);
        new_Node.next = null;

        if(list.head == null)
        {
            list.head = new_Node;
        }
        else
        {
            Node last = list.head;

            while(last.next != null)
            {
                last = last.next;
            }
            last.next = new_Node;
        }

        return list;
    } 

    public static void PrintList(SinglyLinkedListUsingStaticClass list)
    {
        Node curr_Node = list.head;

        System.out.println("\n\nLinked List");

        while(curr_Node != null)
        {
            System.out.print(curr_Node.data+" ");
            curr_Node = curr_Node.next;
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        SinglyLinkedListUsingStaticClass lists = new SinglyLinkedListUsingStaticClass();

        insert(lists,1);
        insert(lists,2);
        insert(lists,3);
        insert(lists,4);
        insert(lists,5);
        insert(lists,6);
        insert(lists,7);
        insert(lists,8);

        PrintList(lists);
    }
}