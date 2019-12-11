/*
Input :
Str1 = aax
Str2 = zzy

Output :

The String Is isomorphic

Input :
Str1 = aax
Str2 = zxy

Output :

The String Is not isomorphic
*/

import java.util.Arrays;

public class IsomorphicOrNot
{
    public static boolean areIsomorphic(String s1,String s2) 
    {
        int SIZE = 256;

        int m = s1.length();
        int n = s2.length();

        if (m != n) 
        {
            return false;    
        }

        boolean Marked [] = new boolean[SIZE];
        Arrays.fill(Marked, false);

        int Maping [] = new int[SIZE];
        Arrays.fill(Maping, -1);

        for(int i = 0;i < n;i++)
        {
            if(Maping[s1.charAt(i)] == -1)
            {
                if (Marked[s2.charAt(i)] == true) 
                {
                    return false;
                }

                Marked[s2.charAt(i)] = true;

                Maping[s1.charAt(i)] = s2.charAt(i);
            }

            if (Maping[s1.charAt(i)] != s2.charAt(i)) 
            {
                return false;    
            }
        }

        return true;
    }

    public static void main(String[] args) 
    {
        String s1[] = {"aab","ax","abc","aaa","bbb","xxyc"};
        String s2[] = {"xxy","b","def","zzx","aaa","aabb"};

        for (int i = 0; i < s1.length; i++) 
        {
            if(areIsomorphic(s1[i],s2[i]))
            {
                System.out.println("The strings "+s1[i]+" and "+s2[i]+" are isomorphic");
            }
            else
            {
                System.out.println("The strings "+s1[i]+" and "+s2[i]+" are not isomorphic");
            }    
        }
    }
}

















