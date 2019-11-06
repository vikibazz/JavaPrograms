public class ListNode
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

    public static ListNode insert(ListNode list,int data)
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

    public static ListNode ListSort(ListNode list)
    {
        Node helper = new Node(0);
        Node cur    = list.head;
        Node pre    = helper;
        Node next   = null;

        while(cur != null)
        {
            next = cur.next;
            while(pre.next != null && pre.next.data < cur.data) 
            {
                pre = pre.next;
            }

            cur.next = pre.next;
            pre.next = cur;
            pre      = helper;
            cur      = next;
        }
        list.head = helper.next;

        return list;
    }

    public static void printList(ListNode list)
    {
        Node currNode = list.head;

        //System.out.println("------Sorted Linked List------");
        while(currNode != null)
        {
            System.out.print(currNode.data+" ");
            currNode = currNode.next;
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        ListNode list = new ListNode();

        insert(list,5);
        insert(list,1);
        insert(list,3);
        insert(list,7);
        insert(list,2);
        insert(list,4);
        insert(list,6);

        System.out.println("------Unsorted Linked List------");
        printList(list);

        ListSort(list);

        System.out.println("------Sorted Linked List------");
        printList(list);
    }
}