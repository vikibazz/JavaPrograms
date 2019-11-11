
public class SortListUsingMerge
{
    ListNode head;
    static class ListNode
    {
        ListNode next;
        int data;

        ListNode(int d)
        {
            data = d;
        }
    }

    public static SortListUsingMerge insert(SortListUsingMerge list,int data)
    {
        ListNode new_node = new ListNode(data);
        new_node.next = null;

        if(list.head == null)
        {
            list.head = new_node;
        }
        else
        {
        ListNode last = list.head;

            while(last.next != null)
            {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }

    public static void printList(SortListUsingMerge list)
    {
        ListNode currNode = list.head;

        while(currNode != null)
        {
            System.out.print(currNode.data+" ");
            currNode = currNode.next;
        }
    }

    public static ListNode SortList(SortListUsingMerge list,ListNode head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }

        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null)
        {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;

        ListNode l1 = SortList(list,head);
        ListNode l2 = SortList(list,slow);

        list.head =  Merge(l1,l2);

        return list.head;
    }

    public static ListNode Merge(ListNode l1,ListNode l2)
    {
        ListNode l = new ListNode(0);
        ListNode p = l;

        while(l1 != null && l2 != null)
        {
            if(l1.data < l2.data)
            {
                p.next = l1;
                l1 = l1.next;
            }
            else
            {
                p.next = l2;
                l2 = l2.next;
            }

            p = p.next;
        }

        if(l1 != null)
        {
            p.next = l1;
        }

        if(l2 != null)
        {
            p.next = l2;
        }


        return l.next;
    }

    public static void main(String[] args) 
    {
        SortListUsingMerge list = new SortListUsingMerge();

        insert(list,8);
        insert(list,1);
        insert(list,5);
        insert(list,2);
        insert(list,10);
        insert(list,3);
        insert(list,4);
        insert(list,6);
        insert(list,7);
        insert(list,9);
        
        System.out.println("\n------Unsorted Linked List------");
        printList(list);

        SortList(list,list.head);

        System.out.println("\n\n------sorted Linked List------");
        printList(list);
    }
}