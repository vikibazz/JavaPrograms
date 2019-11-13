

public class SortColors
{

    public static void colorSort(int a[],int n)
    {
        int lo     = 0;
        int hi     = (n-1);
        int index  = 0;
        int temp   = 0;

        while (index <= hi) 
        {
            switch (a[index]) 
            {
                case 0:
                    temp     = a[lo];
                    a[lo]    = a[index];
                    a[index] = temp;
                    index++;
                    lo++;

                    break;
            
                case 1:
                    index++;

                    break;

                case 2:
                    temp = a[index];
                    a[index] = a[hi];
                    a[hi] = temp;
                    hi--;

                    break;
            }    
        }
    }

    public static void PrintColor(int a[],int n)
    {
        for(int i = 0;i < n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) 
    {
       int a[] = {1,0,2,0,0,2,1,0,1,1,0};
       int n = a.length;

       System.out.println("------The Unsorted Colors------");
       PrintColor(a,n);

       colorSort(a,n);

       System.out.println("\n\n------The Sorted Colors------");
       PrintColor(a,n);
    }
}