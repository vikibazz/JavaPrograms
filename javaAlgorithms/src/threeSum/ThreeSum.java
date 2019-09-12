/*Question

Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? 
Find all unique triplets in the array which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.

Example:

Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]


*/
import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;

public class ThreeSum
{
    static List<List<Integer>> res = new LinkedList<>();
    static List<List<Integer>> listOfThreeSum(int [] num)
    {
        //Sorting the array
        Arrays.sort(num);

        for(int i = 0 ; i < num.length - 2;i++)
        {
            //checking whether the previous element in array is same as the present element
            if(i == 0 || num[i] != num[i - 1])
            {
                int lo = i + 1;
                int hi = num.length - 1;
                int sum = 0 - num[i];

                while(lo < hi)
                {
                    //checking whether the elements in the indexes lo and hi are equal to 'i'
                    //by two pointer method
                    if(num[lo] + num[hi] == sum)
                    {
                        res.add(Arrays.asList(num[i],num[lo],num[hi]));

                        while(lo < hi && num[lo] == num[lo + 1])
                        {
                            lo++;
                        }

                        while (lo < hi && num[hi] == num[hi - 1]) 
                        {
                            hi--;
                        }

                        lo++;
                        hi--;
                    }
                    else if(num[lo] + num[hi] < sum)
                    {
                        lo++;
                    }
                    else
                    {
                        hi--;
                    }
                }
            }
        }

        return res;
    }
    public static void main(String[] args) 
    {
        int num[] = {-1,0,1,2,-1,-4};

        listOfThreeSum(num);

        System.out.println("[ ");
        for(int i = 0 ;i < res.size();i++)
        {
            System.out.println(res.get(i));
        }

        System.out.println(" ]");
    }
}