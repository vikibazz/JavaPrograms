public class CountTheGivenElementInALinkedList
{
    Node head;

    class Node 
    {
        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public void push(int data)
    {
        Node new_Node = new Node(data);

        new_Node.next = head;

        head = new_Node;
    }
    
    int Count(int Search_For)
    {
        int count = 0;
        Node CurrNode = head;

        while(CurrNode != null)
        {
            if(CurrNode.data == Search_For)
            {
                count++;
            }

            CurrNode = CurrNode.next;
        }

        return count;
    }

    public static void main(String[] args) 
    {
        CountTheGivenElementInALinkedList l1 = new CountTheGivenElementInALinkedList();
        
        int Search = 1;

        l1.push(1);
        l1.push(3);
        l1.push(1);
        l1.push(4);
        l1.push(3);
        l1.push(1);
        l1.push(1);
        l1.push(2);
        l1.push(5);
        l1.push(1);
        l1.push(1);
        l1.push(1);

        System.out.println("The count of the given number "+Search+" is "+l1.Count(Search));
    }
}