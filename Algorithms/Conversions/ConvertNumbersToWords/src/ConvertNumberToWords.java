

/**
 * ConvertNumberToWords
 */
public class ConvertNumberToWords 
{

    public static void Convert_Num_To_Words(char [] num) 
    {
        int len = num.length;

        System.out.print(String.valueOf(num)+" : ");

        if(len == 0)
        {
            System.out.print("No string has been entered");
            return;
        }

        if(len > 4)
        {
            System.out.print("Length more than four not supported");
            return;
        }

        String ones []          = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String tens []          = {"","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
        String tens_multiple [] = {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninty"};
        String exponents []     = {"Hundred","Thousand"};

        if(len == 1)
        {
            System.out.println(ones[num[0] - '0']);
            return;
        }

        int x = 0;

        while (x < num.length) 
        {
            if(len >= 3)
            {
                if(num[x] - '0' != 0)
                {
                    System.out.print(ones[num[x] - '0']+" ");
                    System.out.print(exponents[len - 3]+" ");
                }
                --len;
            }
            else
            {
                if(num[x] - '0' == 1)
                {
                    int sum = num[x] - '0' + num[x + 1] - '0';
                    System.out.println(tens[sum]);
                    return;
                }
                else
                {
                    int i = num[x] - '0';

                    if(i > 0)
                    {
                        System.out.print(tens_multiple[i]+" ");
                    }
                    else
                    {
                        System.out.print("");
                    }

                    ++x;

                    if (num[x] - '0' != 0) 
                    {
                        System.out.print(ones[num[x] - '0']);
                    }
                }
            }
            
            ++x;
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        Convert_Num_To_Words("55".toCharArray());
        Convert_Num_To_Words("114".toCharArray());
        Convert_Num_To_Words("400".toCharArray());
        Convert_Num_To_Words("414".toCharArray());
        Convert_Num_To_Words("14".toCharArray());
        Convert_Num_To_Words("5545".toCharArray());
        Convert_Num_To_Words("4".toCharArray());
        Convert_Num_To_Words("40".toCharArray());
        Convert_Num_To_Words("324".toCharArray());
        Convert_Num_To_Words("120".toCharArray());
        Convert_Num_To_Words("20".toCharArray());
        Convert_Num_To_Words("24".toCharArray());
    }
}