/*
 * Sort an array in a way like format such that it looks like
 * 
 * arr[0] >= arr[1] <= arr[3] >=....
 * 
 * 
 * for example :
 * 
 * Input:
 * 
 * 3,8,10,1,7,2,4,9,5,6
 * 
 * Output:
 * 
 * 2 1 4 3 6 5 8 7 10 9
 * 
 * (Or)
 * 
 * 8 3 10 1 7 2 9 4 6 5
 * 
 * 
 */

 public class WaveSort
 {
     public static void Swap(int arr[],int a,int b)
     {
        int temp = arr[a];
        arr[a]   = arr[b];
        arr[b]   = temp;
     } 

     public static void Printarr(int arr[],int n)
     {
         for(int i = 0;i < n;i++)
         {
            System.out.print(arr[i]+" ");
         }
     }
     public static void main(String[] args) 
     {
        int a [] = {3,8,10,1,7,2,4,9,5,6};

        int n = a.length;

        for(int i = 0;i < n;i+=2)
        {
            if(i > 0 && a[i] < a[i - 1])
            {
                Swap(a,i - 1,i);
            }

            if(i <= n - 2 && a[i] < a[i + 1])
            {
                Swap(a,i,i+1);
            }
        }

        Printarr(a,n);
     }

 }