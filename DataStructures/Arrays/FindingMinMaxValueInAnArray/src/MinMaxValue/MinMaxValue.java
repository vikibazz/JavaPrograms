public class MinMaxValue
{
    public static void InsertionSort(int a[],int n)
    {
        for(int i = 1;i < n;i++)
        {
            int key =  a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > key) 
            {
                a[j + 1] = a[j];
                j = j - 1;    
            }

            a[j + 1] = key;
        }
    }
    public static void main(String[] args) 
    {
        int arr[] = {50,30,70,100,80,10,40,20,60,90};
        int n = arr.length;

        InsertionSort(arr,n);

        System.out.println("The minimum value in  this array is :"+arr[0]);
        System.out.println("The maximum value in  this array is :"+arr[n - 1]);
    }
}