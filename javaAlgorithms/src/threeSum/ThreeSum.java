import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;

public class ThreeSum
{
    static List<List<Integer>> res = new LinkedList<>();
    static List<List<Integer>> listOfThreeSum(int [] num)
    {
        Arrays.sort(num);

        for(int i = 0 ; i < num.length;i++)
        {
            if(i == 0 || num[i] != num[i - 1])
            {
                int lo = i + 1;
                int hi = num.length - 1;
                int sum = 0 - num[i];

                while(lo < hi)
                {
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