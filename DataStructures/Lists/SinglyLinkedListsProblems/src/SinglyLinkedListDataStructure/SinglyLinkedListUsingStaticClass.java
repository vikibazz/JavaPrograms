/*
Inserting data,Deleting data(Delete by key,Delete by position) in a Singly linked list)
*/
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

    public static SinglyLinkedListUsingStaticClass DeleteByKey(SinglyLinkedListUsingStaticClass list,int key)
    {
        Node CurrNode = list.head;
        Node prev     = null;

        while(CurrNode != null && CurrNode.data == key)
        {
            list.head = CurrNode.next;
            System.out.println("\n"+key+" Found and deleted");
            return list;
        }

        while(CurrNode != null && CurrNode.data != key)
        {
            prev = CurrNode;
            CurrNode = CurrNode.next;
        }

        if(CurrNode != null)
        {
            prev.next = CurrNode.next;

            System.out.println(key+" Key Found and deleted");
        }

        if(CurrNode == null)
        {
            System.out.println(key+" Key not found");
        }

        return list;
    }

    public static SinglyLinkedListUsingStaticClass DeleteByPos(SinglyLinkedListUsingStaticClass list,int pos)
    {
        Node curr_Node = list.head;
        Node prev = null;

        if(pos == 0 && curr_Node != null)
        {
            System.out.println("The element at the position "+pos+" is deleted");
            list.head = curr_Node.next;

            return list;
        }

        int counter = 0;

        while(curr_Node != null)
        {
            if(counter == pos)
            {
                prev.next = curr_Node.next;

                System.out.println("The element at the position "+pos+" is deleted");
                break;
            }
            else
            {
                prev      = curr_Node; 
                curr_Node = curr_Node.next;
                counter++;
            }
        }

        if(curr_Node == null)
        {
            System.out.println(pos+" Position not found");
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
        insert(lists,5);
        insert(lists,8);

        PrintList(lists);

        DeleteByKey(lists,1);

        PrintList(lists);

        DeleteByKey(lists,5);

        PrintList(lists);

        DeleteByKey(lists,9);

        DeleteByPos(lists,2);
        DeleteByPos(lists,0);
        DeleteByPos(lists,8);

        PrintList(lists);
    }
}