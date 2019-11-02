/*
Arrange the array in such a way that number with least difference with a perfect square is placed at the first index of the array
and sort the remaining array

input:
11,74,12,6,85,24

output:
24,6,11,12,74,85

*/

import java.lang.*; 
public class PlaceTheLowestDiffSqRtAtFirstOfIndex
{
    public static int nearestNumToPerfectSquare(int num)
    {
        long SquareRoot = Math.round(Math.sqrt(num));
        int Diff       =(int)(Math.abs((SquareRoot * SquareRoot) - num));
        
        return Diff;
    }

    public static void insertionSort(int a[],int n)
    {
        for(int i = 2;i < n;i++)
        {
            int key = a[i];
            int j   = i - 1;

            while(j >= 1 && a[j] > key)
            {
                a[j + 1] = a[j];
                j        = j - 1;
            }
            a[j + 1] = key; 
        }
    }

    public static void printarray(int a[],int n)
    {
        System.out.println("\n------Arranged Array------\n");
        for(int i = 0;i < n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) 
    {
        int arr[] = {11,74,12,6,85,24};
        int n     = arr.length;
        int lowestDiff = Integer.MAX_VALUE;

        for(int i = 0;i < n;i++)
        {
            int Difference = nearestNumToPerfectSquare(arr[i]);

            if(Difference < lowestDiff)
            {
                lowestDiff = Difference;

                int tmp = arr[i];
                arr[i]  = arr[0];
                arr[0]  = tmp;
            }
        }

        insertionSort(arr,n);

        printarray(arr,n);
    }
}