/*
Input :

ABC

Output :

ABC,BCA,ACB,BAC,CAB,CBA
*/ 

public class PermutationsOfAGivenString
{

    public static void Permutate(String str,int l,int r)
    {
        if (l == r) 
        {
            System.out.println(str);    
        }
        else
        {
            for (int i = l; i <= r; i++) 
            {
                str = Swap(str,l,i);
                Permutate(str, l + 1, r);
            }
        }
    }

    public static String Swap(String str,int i,int j) 
    {
        char cArr[] = str.toCharArray();
        char temp   = cArr[i];
        cArr[i]     = cArr[j];
        cArr[j]     = temp;
        
        return String.valueOf(cArr);
    }
    public static void main(String[] args) 
    {
        String s = "ABC";

        int n = s.length();
        Permutate(s,0,n-1);
    }
}