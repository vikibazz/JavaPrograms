public class HeapSort
{
    
    public static void Sort(int [] arr,int n)
    {
        for(int i = n / 2 - 1;i >= 0;i--)
        {
            Heapify(arr,n,i);
        }
        
        for(int i = n - 1;i >= 0;i--)
        {
            int swap = arr[0];
            arr[0]   = arr[i];
            arr[i]   = swap;
            
            Heapify(arr,i,0);
        }
    }
    
    public static void Heapify(int [] arr,int n,int i)
    {
        int largest = i;
        
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        
        if(l < n && arr[l] > arr[largest])
        {
            largest = l;
        }
        
        if(r < n && arr[r] > arr[largest])
        {
            largest = r;
        }
        
        if(largest != i)
        {
            int temp     = arr[i];
            arr[i]       = arr[largest];
            arr[largest] = temp;
            
            Heapify(arr,n,largest);
        }
        
    }
    
    static void PrintArray(int arr[]) 
	{ 
		int n = arr.length;
		
		for (int i = 0; i < n; ++i)
		{
			System.out.print(arr[i] + " ");
		}
		
		System.out.println(); 
	}
    
	public static void main(String[] args) 
	
	{
	    int arr [] = {5,7,3,9,4,2,8,1,6};
	    int n      = arr.length;
	    
	    System.out.println("The unsorted elements are : ");
	    PrintArray(arr);
	    
	    Sort(arr,n);
	    
	    System.out.println("\nThe sorted elements are : ");
	    PrintArray(arr);
		
	}
}